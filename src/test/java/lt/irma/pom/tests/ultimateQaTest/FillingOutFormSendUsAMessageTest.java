package lt.irma.pom.tests.ultimateQaTest;

import lt.irma.pom.pages.ultimateQaPage.FillingOutFormSendUsAMessagePage;
import lt.irma.pom.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FillingOutFormSendUsAMessageTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        FillingOutFormSendUsAMessagePage.openChrome("https://ultimateqa.com/contact/");
    }

    @Test
    public void testSingleFillingOutForm() {
        String firstName = "Irma";
        String lastName = "Krajauskiene";
        String eMailAddress = "irma.krajauskiene@gmail.com";
        String message = "I love this site!";

        FillingOutFormSendUsAMessagePage.writeFirstName(firstName);
        FillingOutFormSendUsAMessagePage.writeLastName(lastName);
        FillingOutFormSendUsAMessagePage.writeEMailAddress(eMailAddress);
        FillingOutFormSendUsAMessagePage.writeMessage(message);
        FillingOutFormSendUsAMessagePage.clickOnButtonSendMessage();
    }

}
