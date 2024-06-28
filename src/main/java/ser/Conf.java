package ser;


import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Conf {
    public static class Paths {
        public static final String MainPath = "C:/tmp2/GIB";
        //hello
    }
    public static class Licences{
        public static final String SPIRE_XLS = "XF0BAJOfSVJ6sw8TuTirgf9bo3BKkyPAbKRGLghup0t41I4JxXOS9D0G0AoHnfxP2lRRCH42qefAkbhn1e1X82GnwfVezKuihOE3lVhhpq1ZIYQ7W6KE51Xg6LES0p1Mwdzlc3hb3pPc9jF5BsB/A18RQ1CSz4cwpBd3NDMxEnTCOaWNtUMzOZDO7AhCsHcIEwyj67WdyVOUjuTeDftD7mHsnjWyPTpRw+CZHFLkio8rRIaOOJ8ZGedeQU2a4sn8+NeYy73a6Konq5xBZcEzAdQo05Z8EuuYtW5/DSexdj8vqqyfn0OtEz6iYiQuUaS+/qOSivjAUKAuzbVlq2U/x7muOtHDJO+U56kIbLk24whEhekV19ptLmToWbNelIixCTesrqB17Dv9dXyozKzBln8GIYDfRuwtfiFWMn/VPAPUBiyB0FRzUWE2rMTQEWtgDYH6kakoqQcJi/zyHCx+Ey9mLsk3+n3S/hTBOyTXFDGpXromWz6BiQHgE5OicVcgrG6NCXeBJRhFIhi8P+MI4+oxgcMN+2kDp4YJt2MfQNYKjbugJAEAovJorm/flgY4kn9TaBnxVUZgzX5zudw434j5UZpj1kCQew65rYiMoQYtsw+o6NKT1dZvKYM0f1GtlHFXIcefihEMVGcbhkV3qex4GxQWMt8Ubtn2Nvled8gTpR/SPb3Ui3aJuIuFt7VQZ/FfMglpIAjkLXayHr/466i9YmQjkyD/Fhk2GYuRTMvbbYl+7NC4RMhUT0ny7a4nyyHc9wv7rhyvduw/xInGbiiWpio7KyRDeTyb2LPP1w8f/FaiFBxyk3/NmJq6dmZ8PeV3lA+GVV7mxGf1prdD5tMivKawFsR05M4bwIp7eXt7htqEICig9AuqezADMiAL1uVtne0m4CZ81asp4Hn9UXem4WDWXN4JdOsCI4E91iPATO/zRUWpk5R6VsSJspMNJhjmUumZNkGU9SjBv1QMn435HGTM5u2eC1U4EcIuU/YlPPSvCa34PRMqH201FWoOJNYP0UE4wMUJSsEmRIbhiulRISyNZqF/FezfcYIO4ujqLmGmdRD8yrnKyeTDFxEIfhXSP/tj2mZ3h89iYonhry/e8lef+N1EwRU1S8JSGeZVND8luW+3tVTkV6Er65FyFh33vvTebdGkMS2236rHtJ9WO1zOEhXjcTly2KrwrLhnIHWoVguCVOMkuWU2HIU+BqVcgR3PXWD0eS2KkD9HumdTVChndpUMaP1yfxhNjsGb/k08n3kBguG7ZOsBe5j/GxJBkvBZae90lvzDYGyKxyHA/dLqv402N5BjFsUZzGeqWXInItPsDe7aDKvk7S25johx79pcLsd3maZo2K9bJEuiT4lGf1XZoOVKoy7u8X+1BsHK8/zdmN0+uNG+PE/T8EdTTRH/CQcyWMiv/BAC+QSRIE52VQr4KH5Zfo31V4wH+jg2Qe03muVK6rr9JmwE0mokFWQEXgUmchxa5HbA1H82ro7cUVFjWLArHr5oYkHhPJYiKZXroFm/CJuWBY/NWVTvBHB3YZuLkDr2J9v29HymoTOg8WZ8i02DGgOum66/AC2HJcZCPSQ591CytBbsINhziWPqvwS4XMFsoL6OyNGqQLtXIdb3qYEd5bvgaAs=";
    }
    public static class CancelProcess {
        public static final String MainPath = "C:/tmp2/bulk/cancelprocess";
        public static final String WebBase = "http://localhost/webcube/";
    }
    public static class Customer {
        public static final String TmpPath = "C:/tmp2/GIB/tmpdocs/";
        public static final String TamplatePath = "C:/tmp2/templates/deleteprocess";
        public static final String WebBase = "http://localhost/webcube/";
    }
    public static class Databases{
        public static final String GIBDocument = "GIB_DOCS";
        public static final String GIBDRecord = "GIB_CUSTOMER";
        public static final String Process = "BPM";
    }
    public static class Descriptors{
        public static final String Name = "ObjectName";
        public static final String DocumentDate = "_DocumentDate";
        public static final String StoredDate = "_StoredDate";
        public static final String Categories = "Categories";
        public static final String AccountNumber = "_AccountNumber";
        public static final String CIF = "_CIF";
        public static final String TemplateName = "ObjectNumberExternal";
    }
    public static class DescriptorLiterals{
        public static final String AccountNumber = "ACCOUNTNUMBER";
        public static final String CIF = "D_CIF";

    }
    public static class ClassIDs{
        public static final String Artwork = "4fd133c1-4cf8-461e-bb09-a39c307feb50";
        public static final String CustomerRetailRec = "7087335b-cc68-42e7-8a99-b64fb4356464";
        public static final String CustomerCorpRec = "b748d145-9288-4074-97c1-cf7d8538c18e";
    }
    public static class RecordTypesID{
        public static final String corp = ClassIDs.CustomerCorpRec;
        public static final String retail = ClassIDs.CustomerRetailRec;
    }

    public static class RoleNames{
        public static final String Admins = "admins";
    }
    public static class MailTemplates{
        public static final String Project = "MAIL_WORKBASKET_LIST";
        public static final String CancelProcess = "PROCESS_CANCEL_MAIL";
    }
    public static class CancelProcessSheetIndex {
        public static final Integer Mail = 0;
    }
    public static class SheetIndex {
        public static final Integer Mail = 0;
    }
}
