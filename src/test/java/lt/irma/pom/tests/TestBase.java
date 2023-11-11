package lt.irma.pom.tests;

import lt.irma.pom.pages.Common;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {
    @BeforeMethod
    public abstract void setUp();


    @AfterMethod
    public void tearDown() {
        Common.quitDriver();
    }

}
