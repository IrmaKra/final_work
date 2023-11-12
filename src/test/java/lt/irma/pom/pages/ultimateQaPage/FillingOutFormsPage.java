package lt.irma.pom.pages.ultimateQaPage;

import lt.irma.pom.pages.Common;
import lt.irma.pom.pages.Locator;
import org.openqa.selenium.By;

public class FillingOutFormsPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void writeName(String name) {
        Common.sendKeysToElement(
                Locator.UltimateQa.FillingOutForms.inputName,
                name);
    }

    public static void writeMessage(String message) {
        Common.sendKeysToElement(
                Locator.UltimateQa.FillingOutForms.inputMessage,
                message);
    }

    public static void clickOnButtonSubmit() {
        Common.clickOnElement(Locator.UltimateQa.FillingOutForms.buttonSubmit);
    }
}
