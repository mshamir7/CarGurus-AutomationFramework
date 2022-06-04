package apps.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends CommonAPI {

    @Test

    public void test1() {
        System.setProperty("webdriver.chrome.driver", "/Users/kevinschool/IdeaProjects/BootCampProject/driver/mac/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationpractice.com");
        String expectedTitle = "My Store";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        driver.findElement(By.id("search_query_top")).sendKeys("shirt");
        driver.findElement(By.id("btn btn-default button-search")).click();
        String expectedSearchTitle = "Search - My Store";
        String actualSearchTitle = driver.getTitle();
        Assert.assertEquals(expectedSearchTitle, actualSearchTitle);
        driver.close();
    }

    @Test

    public void test2() {
        System.setProperty("webdriver.chrome.driver", "/Users/kevinschool/IdeaProjects/BootCampProject/driver/mac/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationpractice.com");
        String expectedTitle1 = "My Store";
        String actualTitle1 = driver.getTitle();
        Assert.assertEquals(expectedTitle1, actualTitle1);
        driver.findElement(By.id("search_query_top")).sendKeys("blouse");
        driver.findElement(By.id("btn btn-default button-search")).click();
        String expectedSearchTitle1 = "Blouse - My Store";
        String actualSearchTitle1 = driver.getTitle();
        Assert.assertEquals(expectedSearchTitle1, actualSearchTitle1);
        driver.close();


    }


}
