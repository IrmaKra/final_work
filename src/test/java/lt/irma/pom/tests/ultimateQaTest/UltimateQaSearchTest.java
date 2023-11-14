package lt.irma.pom.tests.ultimateQaTest;

import lt.irma.pom.pages.ultimateQaPage.UltimateQaSearchPage;
import lt.irma.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UltimateQaSearchTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        UltimateQaSearchPage.openChrome("https://ultimateqa.com/");
    }

    @Test
    public void testUltimateQaSearch() {
        String fieldSearch = "blog";
        String expectedSearch = "Blog";
        String actualSearch;

        UltimateQaSearchPage.writeInFieldSearch(fieldSearch);
        UltimateQaSearchPage.clickOnButtonSearch();
        actualSearch = UltimateQaSearchPage.readResultsOfSearch();

        Assert.assertEquals(actualSearch, expectedSearch);
    }

}
