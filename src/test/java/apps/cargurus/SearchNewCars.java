package apps.cargurus;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;
import pages.cargurus.SearchResultPage;

public class SearchNewCars extends CommonAPI {

    @Test
    public void byMakeModelNew() {
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.clickNewCarTab();
        homePage.selectNewCarByMakeModelMakeDropDownList("Audi");
        homePage.selectNewCarByMakeModelModelDropDownList("S5");
        homePage.typeNewCarMakeModelZipcode("11375");
        homePage.clickNewCarMakeModelSearchBtn();
        String actual = getDriver().getTitle();
        Assert.assertEquals("New Audi S5 for Sale in Forest Hills, NY - CarGurus", actual);
    }

    @Test
    public void byBodyStyleNew() {
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.clickNewCarTab();
        homePage.clickNewCarByBodyStyleTabLink();
        homePage.clickNewCarByBodyStylePickupTruckOption();
        homePage.typeNewCarByBodyStyleZipCode("11375");
        String actual = getDriver().getTitle();
       // Assert.assertEquals("New Pickup Truck for Sale in Forest Hills, NY - CarGurus", actual);
    }

    @Test
    public void byPriceNew() {
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.clickNewCarTab();
        homePage.clickNewCarByPriceTabLink();
        homePage.selectNewCarByPriceDropDownListMin("$30,000");
        homePage.selectNewCarByPriceDropDownListMax("$50,000");
        homePage.typeNewCarByPriceZipCode("11375");
        WebElement elementMinPrice = getDriver().findElement(By.cssSelector("input[value = '30000']"));
        Assert.assertTrue(elementMinPrice.isDisplayed());
        WebElement elementMaxPrice = getDriver().findElement(By.cssSelector("input[value = '50000']"));
        Assert.assertTrue(elementMaxPrice.isDisplayed());
    }
}
