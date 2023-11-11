package lt.irma.pom.tests.ultimateQaTest;

import lt.irma.pom.pages.ultimateQaPage.UsersSignInPage;
import lt.irma.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UsersSignInTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        UsersSignInPage.openChrome("https://courses.ultimateqa.com/users/sign_in");
    }

    @Test
    public void testUserNameAndEmail() {
        String email = "irma.krajauskiene@gmail.com";
        String password = "12IrmaKra";

        UsersSignInPage.writeEmail(email);
        UsersSignInPage.writePassword(password);
        UsersSignInPage.clickOnButtonSignIn();
    }

    @Test
    public void testNegativeUserNameAndEmail() {
        String email = "irma.krajauskiene@gmail.com";
        String password = "abcd";
        String expectedResult = "Invalid email or password.";
        String actualResult;

        UsersSignInPage.writeEmail(email);
        UsersSignInPage.writePassword(password);
        UsersSignInPage.clickOnButtonSignIn();
        actualResult = UsersSignInPage.readError();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
