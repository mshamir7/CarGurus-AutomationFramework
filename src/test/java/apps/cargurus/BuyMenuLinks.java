package apps.cargurus;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;

import java.net.MalformedURLException;

public class BuyMenuLinks extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(BuyMenuLinks.class);

    @Test
    public void newCarsCarGuruDifference() throws MalformedURLException {
        HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverBuyMenu(getDriver());
        LOG.info("hove over buy menu successful");
        homePage.clickNewCarLink();
        LOG.info("click new car link successful");
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", getDriver().findElement(By.xpath("//*[@id='callout']/div/h4")));
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id='callout']/div/ul/li[2]/a/div[2]/h4")).isDisplayed());
    }

    //@Test
    public void certifiedCarsTipsAndAdvice() throws MalformedURLException {
        HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverBuyMenu(getDriver());
        homePage.clickCertifiedCarLink();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", getDriver().findElement(By.xpath("//*[@id='root']/div/section[6]/article/h4")));
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id='root']/div/section[6]/article/a")).isDisplayed());
    }

    //@Test
    public void buyingACarDuringCoronaVirusFAQ() throws MalformedURLException {
        HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverBuyMenu(getDriver());
        homePage.clickBuyingACarDuringCoronaVirusFAQLink();
        //JavascriptExecutor js = (JavascriptExecutor) getDriver();
        // js.executeScript("arguments[0].scrollIntoView(true);", getDriver().findElement(By.xpath("//body/main[@id='root']/div[1]/section[1]/div[1]/article[1]/div[2]/a[1]")));
        // Assert.assertTrue(getDriver().findElement(By.xpath("//h2[contains(text(),'Buying a Car During Coronavirus: Frequently Asked ')]")).isDisplayed());
    }
}
