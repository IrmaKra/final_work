package lt.irma.pom.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class UltimateQa {
        public static class UsersSignIn {
            public static By inputEmail = By.xpath("//input[@id='user[email]']");
            public static By inputPassword = By.xpath("//input[@id='user[password]']");
            public static By buttonSignIn = By.xpath("//button[@type='submit']");
        }

        public static class FillingOutForms {
            public static By inputName = By.xpath("//input[@id='et_pb_contact_name_0']");
            public static By inputMessage = By.xpath("//textarea[@name='et_pb_contact_message_0']");
            public static By buttonSubmit = By.xpath("//button[@type='submit']");
        }
    }
}

