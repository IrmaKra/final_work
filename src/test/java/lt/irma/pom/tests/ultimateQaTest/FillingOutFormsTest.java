package lt.irma.pom.tests.ultimateQaTest;

import lt.irma.pom.pages.ultimateQaPage.FillingOutFormsPage;
import lt.irma.pom.pages.ultimateQaPage.UsersSignInPage;
import lt.irma.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FillingOutFormsTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        UsersSignInPage.openChrome("https://ultimateqa.com/filling-out-forms/");
    }

    @Test
    public void testSingleFillingOutForm() {
        String name = "Irma";
        String message = "Laba diena, Lietuva!";

        FillingOutFormsPage.writeName(name);
        FillingOutFormsPage.writeMessage(message);
        FillingOutFormsPage.clickOnButtonSubmit();
    }
}
