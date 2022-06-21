package apps.cargurus;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.DeliveryPage;
import pages.cargurus.HomePage;

public class InstantMarketValue extends CommonAPI {

    @Test
    public void instantMarketValue(){
        HomePage homePage = new HomePage(getDriver());
        DeliveryPage deliveryPage = new DeliveryPage(getDriver());
        homePage.hoverOverBuyMenu(getDriver());
        homePage.clickDeliveryLink();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView", getDriver().findElement(By.xpath("//h3[contains(text(),'How much does it cost?')]")));
        deliveryPage.clickInstantMarketValueIMVLink();
        Assert.assertTrue(getDriver().findElement(By.xpath("//h1[contains(text(),'What is IMV?')]")).isDisplayed());
    }
}
