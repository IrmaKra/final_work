package lt.irma.pom.pages.ultimateQaPage;

import lt.irma.pom.pages.Common;
import lt.irma.pom.pages.Locator;

public class FillingOutFormSendUsAMessagePage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void writeFirstName(String firstName) {
        Common.sendKeysToElement(
                Locator.UltimateQa.FillingOutFormSendUsAMessage.inputFirstName,
                firstName);
    }

    public static void writeLastName(String lastName) {
        Common.sendKeysToElement(
                Locator.UltimateQa.FillingOutFormSendUsAMessage.inputLastName,
                lastName);
    }

    public static void writeEMailAddress(String eMailAddress) {
        Common.sendKeysToElement(
                Locator.UltimateQa.FillingOutFormSendUsAMessage.inputEMailAddress,
                eMailAddress);
    }

    public static void writeMessage(String message) {
        Common.sendKeysToElement(
                Locator.UltimateQa.FillingOutFormSendUsAMessage.inputMessage,
                message);
    }

    public static void clickOnButtonSendMessage() {
        Common.clickOnElement(Locator.UltimateQa.FillingOutFormSendUsAMessage.buttonSendMessage);
    }

}
