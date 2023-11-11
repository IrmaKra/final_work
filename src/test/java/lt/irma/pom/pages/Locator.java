package lt.irma.pom.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class UltimateQa {
        public static class UsersSignIn {
            public static By inputEmail = By.xpath("//input[@id='user[email]']");
            public static By inputPassword = By.xpath("//input[@id='user[password]']");
            public static By buttonSignIn = By.xpath("//button[@type='submit']");

        }
    }
}
