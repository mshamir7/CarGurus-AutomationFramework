package apps.cargurus;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;

public class SellMenuLinks extends CommonAPI {

    @Test
    public void sellMyCarLink(){
        HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverSellMenu(getDriver());
        homePage.clickSellMyCarLink();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", getDriver().findElement(By.xpath("//h1[contains(text(),'3 simple steps.')]")));
        Assert.assertTrue(getDriver().findElement(By.xpath("//h1[contains(text(),'3 simple steps.')]")).isDisplayed());
    }

    @Test
    public void sellMyCarFAQLink(){
        HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverSellMenu(getDriver());
        homePage.clickSellMyCarFAQLink();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", getDriver().findElement(By.xpath("//*[@id='root']/div[1]/section[2]/h2")));
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id='root']/div[1]/section[2]/h2")).isDisplayed());
    }

    @Test
    public void dealerSignUpLink(){
        HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverSellMenu(getDriver());
        homePage.clickDealerSignUpLink();
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id='contentBody']/header/div[1]/div/div[2]/div/div[1]/div[1]/h3")).isDisplayed());
    }
}
