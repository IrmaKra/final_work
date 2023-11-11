package lt.irma.pom.pages.ultimateQaPage;

import lt.irma.pom.pages.Common;

public class UltimateQaPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void openFirefox(String url) {
        Common.setUpFirefox();
        Common.openUrl(url);
    }

    public static void closeDriver() {
        Common.quitDriver();
    }
}
