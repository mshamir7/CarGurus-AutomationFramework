package apps.cargurus;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;

public class HomePageFeatures extends CommonAPI {

    @Test
    public void recommendedForYou() {

        HomePage homePage = new HomePage(getDriver());
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", getDriver().findElement(By.cssSelector("button[class='c2dVinFormSubmit c2d-banner-cta']")));
        homePage.clickRecommendedForYouListing();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("h1[class='IpF2YF']")).isDisplayed());
    }

    @Test
    public void recentActivity() {
        HomePage homePage = new HomePage(getDriver());
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", getDriver().findElement(By.xpath("//h2[contains(text(),'Recent activity')]")));
        homePage.clickRecentActivityListing();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("h1[class='IpF2YF']")).isDisplayed());
    }

    @Test
    public void recentPriceDrops() {
        HomePage homePage = new HomePage(getDriver());
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", getDriver().findElement(By.xpath("//h2[contains(text(),'Recent price drops')]")));
        homePage.clickRecentPriceDropsListing();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("h1[class='IpF2YF']")).isDisplayed());
    }

    @Test
    public void modelsYouMayLike() {
        HomePage homePage = new HomePage(getDriver());
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", getDriver().findElement(By.xpath("//h2[contains(text(),'Models you may like')]")));
        homePage.clickModelsYouMayLike();
        Assert.assertTrue(getDriver().findElement(By.xpath("//span[contains(text(),'Email me price drops and new listings for these re')]")).isDisplayed());
    }

    @Test
    public void familyFriendlyTrendingSearch() {
        HomePage homePage = new HomePage(getDriver());
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", getDriver().findElement(By.xpath("//h2[contains(text(),'Trending searches')]")));
        homePage.clickFamilyFriendlyTrendingSearch();
        Assert.assertTrue(getDriver().findElement(By.xpath("//span[contains(text(),'Email me price drops and new listings for these re')]")).isDisplayed());
    }

}
