package apps.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCartTest extends CommonAPI {

    @Test

    public void test1() {
        System.setProperty("webdriver.chrome.driver", "/Users/kevinschool/IdeaProjects/BootCampProject/driver/mac/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationpractice.com");
        String expectedTitle = "My Store";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        driver.findElement(By.id("replace-2x img-responsive")).click();
        String expectedTitle1 = "Blouse - My Store";
        String actualTitle1 = driver.getTitle();
        Assert.assertEquals(expectedTitle1, actualTitle1);
        driver.findElement(By.id("add_to_cart")).click();
        driver.findElement(By.id("shopping_cart")).click();
        String expectedCartTitle = "Order - My Store";
        String actualCartTitle = driver.getTitle();
        Assert.assertEquals(expectedCartTitle, actualCartTitle);
        driver.close();
    }




}
