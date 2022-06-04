package apps.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends CommonAPI {

    @Test

    public void invalidLoginTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/kevinschool/IdeaProjects/BootCampProject/driver/mac/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationpractice.com");
        String expectedTitle = "My Store";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        driver.findElement(By.id("login")).click();
        String expectedTitle1 = "Login - My Store";
        String actualTitle1 = driver.getTitle();
        Assert.assertEquals(expectedTitle1, actualTitle1);
        driver.findElement(By.id("email")).sendKeys("user@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("123456");

    }

    @Test

    public void validLoginTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/kevinschool/IdeaProjects/BootCampProject/driver/mac/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationpractice.com");
        String expectedTitle1 = "My Store";
        String actualTitle1 = driver.getTitle();
        Assert.assertEquals(expectedTitle1, actualTitle1);
        driver.findElement(By.id("login")).click();
        String expectedTitle2 = "Login - My Store";
        String actualTitle2 = driver.getTitle();
        Assert.assertEquals(expectedTitle2, actualTitle2);
        driver.findElement(By.id("email")).sendKeys("pnttesting@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("abc123");
        driver.findElement(By.id("login")).click();
        String expectedTitle21 = "My account - My Store";
        String actualTitle21 = driver.getTitle();
        Assert.assertEquals(expectedTitle21, actualTitle21);


    }

}