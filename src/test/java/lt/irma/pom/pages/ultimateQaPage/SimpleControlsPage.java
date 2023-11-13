package lt.irma.pom.pages.ultimateQaPage;

import lt.irma.pom.pages.Common;
import lt.irma.pom.pages.Locator;

public class SimpleControlsPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void checkOnCheckBox() {
        Common.clickOnElement(Locator.UltimateQa.SimpleControls.inputIsBoxSelected);
    }

    public static String readSingleCheckBoxMessage() {
        return Common.getTextFromElement(Locator. UltimateQa.SimpleControls.divTxtButton);
    }

    }
