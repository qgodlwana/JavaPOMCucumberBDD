package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class SignInPage extends BrowserDriver {
    public static String username_text_xpath = "//*[@id=\"usr\"]";
    public static String password_text_xpath = "//*[@id=\"pwd\"]";
    public static String login_btn_xpath = "//*[@id=\"second_form\"]/input";
    public static String registration_btn_xpath = "//*[@id=\"NewRegistration\"]";

    public static void enter_username(){
        driver.findElement(By.xpath(username_text_xpath)).sendKeys("sa");
    }
    public static void enter_password(){
        driver.findElement(By.xpath(password_text_xpath)).sendKeys("sa");
    }
    public static void click_login_btn() throws  InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath(login_btn_xpath)).click();
    }
    public static void click_newRegistration_btn() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath(registration_btn_xpath)).click();
    }
}