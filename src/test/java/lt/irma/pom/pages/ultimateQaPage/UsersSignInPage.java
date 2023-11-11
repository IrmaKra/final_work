package lt.irma.pom.pages.ultimateQaPage;

import lt.irma.pom.pages.Common;
import lt.irma.pom.pages.Locator;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UsersSignInPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void writeEmail(String email) {
        Common.sendKeysToElement(
                Locator.UltimateQa.UsersSignIn.inputEmail,
                email);
    }

    public static void writePassword(String password) {
        Common.sendKeysToElement(
                Locator.UltimateQa.UsersSignIn.inputPassword,
                password);
    }

    public static void clickOnButtonSignIn() {
        Common.clickOnElement(Locator.UltimateQa.UsersSignIn.buttonSignIn);
    }

    public static String readError() {
        return Common.getTextFromElement(By.xpath("//li[@class='form-error__list-item']"));
    }
}
