package foodWebsiteProject.dataAccess.util;

import org.springframework.context.i18n.LocaleContextHolder;

public class Utils {
    private static Integer idLanguage;
    public Utils() {
    }

    public static Integer getIdLanguage() {
        switch (LocaleContextHolder.getLocale().getLanguage()){
            case "en":
                idLanguage = 1; break;
            case "fr":
                idLanguage = 2; break;
            default:
                idLanguage = 0; break;
        }
        return idLanguage;
    }
}
