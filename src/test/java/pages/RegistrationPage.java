package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import utility.BrowserDriver;

public class RegistrationPage extends BrowserDriver {
    public static String registration_heading_xpath = "/html/body/center/h1";

    public static void registrationHeading_visibility() throws InterruptedException{
        Thread.sleep(1000);
        String expectedRegistrationHeading = "User Registration Page";
        String actualRegistrationHeading = driver.findElement(By.xpath(registration_heading_xpath)).getText();
        Assert.assertEquals(expectedRegistrationHeading, actualRegistrationHeading);
    }
}
