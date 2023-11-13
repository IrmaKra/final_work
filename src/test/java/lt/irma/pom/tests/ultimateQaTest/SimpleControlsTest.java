package lt.irma.pom.tests.ultimateQaTest;

import lt.irma.pom.pages.ultimateQaPage.SimpleControlsPage;
import lt.irma.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleControlsTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        SimpleControlsPage.openChrome(
                "https://ultimateqa.com/simple-html-elements-for-automation/"
        );
    }
    @Test
    public void testClickOnCheckBox() {
        String expectedMessage = "Button success";
        String actualMessage;

        SimpleControlsPage.checkOnCheckBox();
        actualMessage = SimpleControlsPage.readSingleCheckBoxMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

}
