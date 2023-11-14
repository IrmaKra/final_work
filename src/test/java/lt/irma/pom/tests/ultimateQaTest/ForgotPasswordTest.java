package lt.irma.pom.tests.ultimateQaTest;

import lt.irma.pom.pages.ultimateQaPage.ForgotPasswordPage;
import lt.irma.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        ForgotPasswordPage.openChrome(
                "https://courses.ultimateqa.com/users/sign_in"
        );
    }

    @Test
    public void testClickOnButtForgotPassword() {
        String expectedMessage = "Forgot your Password?";
        String actualMessage;

        ForgotPasswordPage.clickOnButtonForgotPassword();
        actualMessage = ForgotPasswordPage.readForgotPasswordBoxMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

}
