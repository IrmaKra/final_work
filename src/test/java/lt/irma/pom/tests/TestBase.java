package lt.irma.pom.tests;

import lt.irma.pom.pages.Common;
import lt.irma.pom.utilities.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public abstract class TestBase {
    @BeforeMethod
    public abstract void setUp();

    @AfterMethod
    public void tearDown() {
        Common.quitDriver();
    }

}
