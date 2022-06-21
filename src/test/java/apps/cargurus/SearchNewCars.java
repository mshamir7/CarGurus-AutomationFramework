package apps.cargurus;

import base.CommonAPI;
import org.openqa.selenium.By;
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
        Assert.assertEquals("New Pickup Truck for Sale in Forest Hills, NY - CarGurus", actual);
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
        String expectedMinPrice = "30000";
        String actualMinPrice = getDriver().findElement(By.id("minPrice")).getText();
        String expectedMaxPrice = "50000";
        String actualMaxPrice = getDriver().findElement(By.id("maxPrice")).getText();
        Assert.assertEquals(expectedMinPrice, actualMinPrice);
        Assert.assertEquals(expectedMaxPrice, actualMaxPrice);
    }
}
