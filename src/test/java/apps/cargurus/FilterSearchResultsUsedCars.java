package apps.cargurus;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;
import pages.cargurus.SearchResultPage;
import pages.cargurus.ShoppingForAUsedCarPage;

public class FilterSearchResultsUsedCars extends CommonAPI {

    @Test
    public void searchUsedCarsFromShoppingForAUsedCarPage() {
        HomePage homePage = new HomePage(getDriver());
        ShoppingForAUsedCarPage shoppingForAUsedCarPage = new ShoppingForAUsedCarPage(getDriver());
        homePage.clickHeaderBuyBtn();
        shoppingForAUsedCarPage.selectAllMakesDropDownList("Acura");
        shoppingForAUsedCarPage.selectAllModelsDropDownList("ILX");
        shoppingForAUsedCarPage.typeMinPriceTextBox("20000");
        shoppingForAUsedCarPage.typeMaxPriceTextBox("35000");
        shoppingForAUsedCarPage.typeZipCode("11375");
        shoppingForAUsedCarPage.selectRadius("50 mi");
        shoppingForAUsedCarPage.clickSearchBtn();
        waitFor(2);
        String actualSearchTitleText = getDriver().findElement(By.xpath("//body/main[@id='main']/div[@id='cargurus-listing-search']/div[1]/div[1]/div[1]/h1[1]")).getText();
        Assert.assertEquals("Used Acura ILX for Sale in Forest Hills, NY", actualSearchTitleText);
        waitFor(2);


    //Update Zipcode From SEARCH RESULTS PAGE TC022

        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        searchResultPage.clearZipCodeTextBox();
        searchResultPage.typeAndUpdateZipCode("11565");
        searchResultPage.clickUpdateZip();
        waitFor(2);
        String actualUpdateSearchTitleText = getDriver().findElement(By.xpath("//body/main[@id='main']/div[@id='cargurus-listing-search']/div[1]/div[1]/div[1]/h1[1]")).getText();
        Assert.assertEquals("Used Acura ILX for Sale in Malverne, NY", actualUpdateSearchTitleText);


    //ERROR MESSAGE DISPLAYED USING INVALID ZIPCODE TC023


        searchResultPage.clearZipCodeTextBox();
        searchResultPage.typeAndUpdateZipCode("00001");
        searchResultPage.clickUpdateZip();
        waitFor(2);
        Assert.assertTrue(searchResultPage.assertErrorMessageBanner());



    //FILTER SEARCH BY BODY STYLE FROM SEARCH RESULTS PAGE TC024


        searchResultPage.clickBodyStyleTab();
        searchResultPage.selectBodyStyleDropDownList("Sedan");
        searchResultPage.clearZipCodeTextBox();
        searchResultPage.typeAndEnterZip("11565");
        String actualText = getDriver().findElement(By.xpath("//em[contains(text(),'Sedans')]")).getText();
        Assert.assertEquals("Sedans", actualText);
        String actualText1 = getDriver().findElement(By.xpath("//em[contains(text(),'Malverne, NY')]")).getText();
        Assert.assertEquals("Malverne, NY", actualText1);


    //FILTER SEARCH BY PRICE FROM SEARCH RESULTS PAGE TC025


        searchResultPage.clickByPriceTab();
        searchResultPage.clearMinPriceTextBox();
        waitFor(2);
        searchResultPage.typeMinPrice("15000");
        searchResultPage.clearMaxPriceTextBox();
        waitFor(2);
        searchResultPage.typeMaxPrice("25000");
        searchResultPage.clearZipCodeTextBox();
        searchResultPage.typeZipCode("11565");
        searchResultPage.clickSearchBtn();
        String acutal = getDriver().findElement(By.xpath("//div[contains(text(),'Price Search')]")).getText();
        Assert.assertEquals("Price Search", acutal);

    // NAVIGATE TO REQUEST INFO DIALOG BOX TC026

        searchResultPage.clickRequestInfoBtn();
        searchResultPage.typeRequestInfoFirstName("John");
        searchResultPage.typeRequestInfoLastName("Smith");
        searchResultPage.typeRequestInfoPostalCode("11565");
        searchResultPage.typeRequestInfoEmailAddress("abcd1234@gmail.com");
        Assert.assertTrue(getDriver().findElement(By.xpath("//span[contains(text(),'Send')]")).isDisplayed());
    }
}
