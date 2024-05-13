package pages;

import StepDefinition.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class ProductCategoryPage extends BasePage {
    ///html/body/div[2]/div
    public static String productCategory_heading_xpath = "//*[@id=\"ShoeType\"]";

    public static void productCategory_visibility() throws InterruptedException{
        Thread.sleep(1000);
        String expected_productCategory_heading = "Formal Shoes";
        String actual_productCategory_heading = driver.findElement(By.xpath(productCategory_heading_xpath)).getText();
        Assert.assertEquals(expected_productCategory_heading, actual_productCategory_heading);
    }
}
