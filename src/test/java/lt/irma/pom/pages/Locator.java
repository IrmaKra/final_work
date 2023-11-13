package lt.irma.pom.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class UltimateQa {
        public static class UsersSignIn {
            public static By inputEmail = By.xpath("//input[@id='user[email]']");
            public static By inputPassword = By.xpath("//input[@id='user[password]']");
            public static By buttonSignIn = By.xpath("//button[@type='submit']");
        }

        public static class FillingOutFormSendUsAMessage {
            public static By inputFirstName = By.xpath("//input[@id='et_pb_contact_first_0']");
            public static By inputLastName = By.xpath("//input[@id='et_pb_contact_last_0']");
            public static By inputEMailAddress = By.xpath("//input[@id='et_pb_contact_email_0']");
            public static By inputMessage = By.xpath("//textarea[@name='et_pb_contact_message_0']");
            public static By buttonSendMessage = By.xpath("//button[@type='submit']");
        }

        public static class SimpleControls {
            public static By inputIsBoxSelected = By.xpath("//a[@class='et_pb_button et_pb_promo_button']");
            public static By divTxtButton = By.xpath("//h1[@class='entry-title']");

        }

    }
}

