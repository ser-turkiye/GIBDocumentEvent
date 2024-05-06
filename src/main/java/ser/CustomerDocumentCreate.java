package ser;

import com.ser.blueline.*;
import com.ser.blueline.bpm.ITask;
import com.ser.blueline.metaDataComponents.IArchiveClass;
import com.ser.foldermanager.IFolder;
import com.ser.foldermanager.INode;
import de.ser.doxis4.agentserver.UnifiedAgent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;

import java.io.File;
import java.util.*;

public class CustomerDocumentCreate extends UnifiedAgent {
    private Logger log = LogManager.getLogger();
    private ProcessHelper helper;
    private IDocument mainDocument;
    JSONObject projects = new JSONObject();
    private ITask mainTask;
    private String uniqueId;
    String tempPath = "";
    String ownerID = "";
    IUser owner = null;
    List<String> docs = new ArrayList<>();
    List<String> others = new ArrayList<>();
    @Override
    protected Object execute() {
        helper = new ProcessHelper(getSes());
        log.info("----CustomerDocumentCreate..eventDocument? -----:" + getEventDocument());
        if(getEventDocument() != null){
            mainDocument = getEventDocument();
            try {
                Utils.session = getSes();
                Utils.bpm = getBpm();
                Utils.server = Utils.session.getDocumentServer();

                uniqueId = UUID.randomUUID().toString();
                ownerID = mainDocument.getOwnerID();
                owner = getDocumentServer().getUser(getSes() , mainDocument.getOwnerID());
                this.getSes().refreshServerSessionCache();
                //mainDocument.setDescriptorValue("AbacOwner",ownerID);
                //mainDocument.setDescriptorValue("OwnerFullName",owner.getFullName());
//                try{
//                    mainDocument.commit();
//                }catch (Exception e){
//                    log.info("CustomerDocumentCreate...commit error:" + e);
//                    log.info("restarting agent....");
//                    return resultRestart("Restarting Agent for CustomerDocumentCreate");
//                }

                //tempPath = Conf.Paths.MainPath + "/" + uniqueId;
                //Utils.loadDirectory(tempPath);
                this.helper = new ProcessHelper(Utils.session);
                log.info("----CustomerDocumentCreate Agent Started -----:" + mainDocument.getID());
                this.archivingDoc(mainDocument);
                mainDocument.setDescriptorValue("ObjectState","New");
                mainDocument.commit();
                log.info("----CustomerDocumentCreate Agent Finished -----");
            } catch (Exception e) {
                log.error("Exception Caught");
                log.error(e.getMessage());
                return resultError(e.getMessage());
            }
        }
        return resultSuccess("Agent Finished Succesfully");
    }
    private void archivingDoc(IDocument customerDoc) throws Exception {
        String category = customerDoc.getDescriptorValue(Conf.Descriptors.Categories);
        //String categoryID = Utils.getCategoryIDFromGVlist(category);
        IFolder custFolder = Utils.getCustomerFolder(customerDoc, new ProcessHelper(Utils.session));
        if(custFolder == null){
            //throw new Exception("Project folder not found.");
            custFolder = Utils.newCustomerFolderFromDoc(customerDoc);
            if(custFolder != null) {
                helper.mapDescriptorsFromObjectToObject(customerDoc , custFolder , true);
                custFolder.commit();
            }
        }
        if(custFolder != null) {
            Utils.addToNode(custFolder, customerDoc);
        }
    }
    private void archiveNewDocFromTemp(IDocument doc) throws Exception {
        String tmpPath = Utils.exportDocuments(doc, tempPath);
        String category = doc.getDescriptorValue(Conf.Descriptors.Categories);
        String categoryID = Utils.getCategoryIDFromGVlist(category);
        IInformationObject customerInfo = Utils.getCustomerDoc(doc, categoryID, this.helper);
        IDocument customerDoc = null;
        if(customerInfo == null){
            customerDoc = Utils.newFileToDocumentClass(tmpPath,categoryID);
        }else{
            customerDoc = (IDocument) customerInfo;
        }
        helper.mapDescriptorsFromObjectToObject(doc , customerDoc , true);
        customerDoc.commit();
    }

}
