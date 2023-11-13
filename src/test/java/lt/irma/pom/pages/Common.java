package lt.irma.pom.pages;

import lt.irma.pom.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Common {
    public static void setUpChrome() {
        Driver.setChromeDriver();
    }

    public static void setUpFirefox() {
        Driver.setFirefoxDriver();
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void quitDriver() {
        Driver.quitDriver();
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

//    private static List<WebElement> getElements(By locator) {
//        return Driver.getDriver().findElements(locator);
//    }

    public static void sendKeysToElement(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click();
    }

//    public static void clickOnElementWhenAvailableCustomised(By locator, int seconds) {
//
//        for (int i = 0; i <= (seconds * 2); i++) {
//            try {
//                Thread.sleep(500);
//                clickOnElement(locator);
//                break;
//            } catch (NoSuchElementException | InterruptedException e) {
//
//            }
//        }
//    }
//
//    public static boolean waitElementWhenAvailableCustomised(By locator, int seconds) {
//
//        for (int i = 0; i <= (seconds * 2); i++) {
//            try {
//                Thread.sleep(500);
//                if (getElement(locator).isDisplayed()) {
//                    return true;
//                }
//            } catch (NoSuchElementException | InterruptedException e) {
//
//            }
//        }
//
//        return false;
//    }

//    public static void waitElementWhenVisible(By locator, int seconds) throws TimeoutException {
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(seconds));
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//    }
//
//    public static boolean isElementSelected(By locator) {
//        return getElement(locator).isSelected();
//    }
//
//    public static boolean isElementEnabled(By locator) {
//        return getElement(locator).isEnabled();
//    }
//
//    public static List<Boolean> getStatusesOfElements(By locator) {
//        List<WebElement> elements = getElements(locator);
//        List<Boolean> statuses = new ArrayList<>();
//
//        for (WebElement element : elements) {
//            statuses.add(element.isSelected());
//        }
//
//        return statuses;
//    }
//
//    public static String getElementAttributeValue(By locator, String atributeName) {
//        return getElement(locator).getAttribute(atributeName);
//    }

//    private static Select getSelect(By locator) {
//        return new Select(getElement(locator));
//    }

//    public static void selectOptionByValue(By locator, String selectValue) {
//        getSelect(locator).selectByValue(selectValue);
//    }
//
//    public static void selectOptionByIndex(By locator, int index) {
//        getSelect(locator).selectByIndex(index);
//    }
//
}
