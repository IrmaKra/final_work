package lt.irma.pom.pages.ultimateQaPage;

import lt.irma.pom.pages.Common;
import lt.irma.pom.pages.Locator;

public class UltimateQaSearchPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void writeInFieldSearch(String fieldSearch) {
        Common.sendKeysToElement(
                Locator.UltimateQa. UltimateQaSearch.inputSearchText,
                fieldSearch);
    }

    public static void clickOnButtonSearch() {
        Common.clickOnElement(Locator.UltimateQa. UltimateQaSearch.buttonSearch);
    }

    public static String readResultsOfSearch() {
        return Common.getTextFromElement(Locator.UltimateQa.UltimateQaSearch.searchResults);
    }

}
