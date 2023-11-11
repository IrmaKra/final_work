package lt.irma.pom.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
    //    private static WebDriver driver;
    private static ThreadLocal <WebDriver> drivers = new ThreadLocal<>();

    public static void setChromeDriver() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--force-device-scale-factor=0.75");
        options.addArguments("--start-maximized");

//        driver = new ChromeDriver();
        drivers.set(new ChromeDriver(options));
        drivers.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public static void setFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        drivers.set(new FirefoxDriver());
    }

    public static WebDriver getDriver() {
//        return driver;
        return drivers.get();
    }

    public static void quitDriver() {
//        driver.quit();
        drivers.get().quit();
        drivers.remove();
    }
}
