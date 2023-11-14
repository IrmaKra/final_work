package lt.irma.pom.pages.ultimateQaPage;

import lt.irma.pom.pages.Common;
import lt.irma.pom.pages.Locator;

public class ForgotPasswordPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void clickOnButtonForgotPassword() {
        Common.clickOnElement(Locator.UltimateQa.ForgotPassword.inputIsButtonForgotPasswordSelected);
    }

    public static String readForgotPasswordBoxMessage() {
        return Common.getTextFromElement(Locator.UltimateQa.ForgotPassword.textMessage);
    }

}
