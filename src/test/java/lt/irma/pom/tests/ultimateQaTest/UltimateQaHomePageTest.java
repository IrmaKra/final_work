package lt.irma.pom.tests.ultimateQaTest;

import lt.irma.pom.pages.ultimateQaPage.UltimateQaHomePagePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class UltimateQaHomePageTest {

    @Test
    public void testWebDriverWithChrome() {

        UltimateQaHomePagePage.openChrome("https://ultimateqa.com/");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testWebDriverDemoWithFirefox() {
        UltimateQaHomePagePage.openFirefox("https://ultimateqa.com/");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown() {
        UltimateQaHomePagePage.closeDriver();
    }

}

