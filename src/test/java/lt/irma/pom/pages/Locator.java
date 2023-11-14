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
        public static class UltimateQaSearch {
            public static By inputSearchText = By.xpath("//input[@class='et_pb_s']");

            public static By buttonSearch = By.xpath("//input[@class='et_pb_searchsubmit']");
            public static By searchResults = By.xpath("//a[@href='https://ultimateqa.com/blog/']");

        }

        public static class DropdownLearning {
            public static By selectOptionFromSubmeniu = By.xpath("//input[@id='et_pb_contact_first_0']");


            public static By setInputById(String attributeId) {
//                return By.xpath("//input[@id='%s']".formatted(attributeId));
                return By.xpath("//input[@id='" + attributeId + "']");
            }
        }

        public static class SimpleControls {
            public static By inputIsBoxSelected = By.xpath("//a[@class='et_pb_button et_pb_promo_button']");
            public static By divTxtButton = By.xpath("//h1[@class='entry-title']");

        }

    }
}

