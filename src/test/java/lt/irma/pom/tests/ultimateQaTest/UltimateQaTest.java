package lt.irma.pom.tests.ultimateQaTest;

import lt.irma.pom.pages.ultimateQaPage.UltimateQaPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class UltimateQaTest {

    @Test
    public void testWebDriverWithChrome() {

        UltimateQaPage.openChrome("https://ultimateqa.com/");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testWebDriverDemoWithFirefox() {
        UltimateQaPage.openFirefox("https://ultimateqa.com/");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown() {
        UltimateQaPage.closeDriver();
    }
}

