package apps.cargurus;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;
import pages.cargurus.SearchResultPage;
import pages.cargurus.ShoppingForAUsedCarPage;
import utility.ConnectDB;
import utility.ExcelReader;
import utility.Utility;

import java.util.List;

public class FilterSearchResultsUsedCars extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(FilterSearchResultsUsedCars.class);

    @Test
    public void searchUsedCars() {
        LOG.info("Login:" + "\n"+"searchUsedCars Test");
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
        String actualSearchTitleText = getDriver().findElement(By.xpath("//body/main[@id='main']/div[@id='cargurus-listing-search']/div[1]/div[1]/div[1]/h1[1]")).getText();
        Assert.assertEquals("Used Acura ILX for Sale in Forest Hills, NY", actualSearchTitleText);
    }

    //Update Zipcode From SEARCH RESULTS PAGE TC022

    @Test
    public void updateZipCodeFromSearchResultsPage() {
        LOG.info("Login:" + "\n"+"updateZipCodeFromSearchResultsPage Test");
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        ShoppingForAUsedCarPage shoppingForAUsedCarPage = new ShoppingForAUsedCarPage(getDriver());
        homePage.clickHeaderBuyBtn();
        shoppingForAUsedCarPage.selectAllMakesDropDownList("Acura");
        shoppingForAUsedCarPage.selectAllModelsDropDownList("ILX");
        shoppingForAUsedCarPage.typeMinPriceTextBox("20000");
        shoppingForAUsedCarPage.typeMaxPriceTextBox("35000");
        shoppingForAUsedCarPage.typeZipCode("11375");
        shoppingForAUsedCarPage.selectRadius("50 mi");
        shoppingForAUsedCarPage.clickSearchBtn();
        searchResultPage.clearZipCodeTextBox();
        searchResultPage.typeAndUpdateZipCode("11565");
        searchResultPage.clickUpdateZip();
        String actualUpdateSearchTitleText = getDriver().findElement(By.xpath("//body/main[@id='main']/div[@id='cargurus-listing-search']/div[1]/div[1]/div[1]/h1[1]")).getText();
        // Assert.assertEquals("Used Acura ILX for Sale in Malverne, NY", actualUpdateSearchTitleText);
    }


    //ERROR MESSAGE DISPLAYED USING INVALID ZIPCODE TC023

   @Test
    public void invalidZipCodeErrorMessage() {
        LOG.info("Login:" + "\n"+"invalidZipCodeErrorMessage Test");
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        ShoppingForAUsedCarPage shoppingForAUsedCarPage = new ShoppingForAUsedCarPage(getDriver());
        homePage.clickHeaderBuyBtn();
        shoppingForAUsedCarPage.selectAllMakesDropDownList("Acura");
        shoppingForAUsedCarPage.selectAllModelsDropDownList("ILX");
        shoppingForAUsedCarPage.typeMinPriceTextBox("20000");
        shoppingForAUsedCarPage.typeMaxPriceTextBox("35000");
        shoppingForAUsedCarPage.typeZipCode("11375");
        shoppingForAUsedCarPage.selectRadius("50 mi");
        shoppingForAUsedCarPage.clickSearchBtn();
        searchResultPage.clearZipCodeTextBox();
        searchResultPage.typeAndUpdateZipCode("00000");
        searchResultPage.clickUpdateZip();
        // Assert.assertTrue(searchResultPage.assertErrorMessageBanner());
    }


    //FILTER SEARCH BY BODY STYLE FROM SEARCH RESULTS PAGE TC024

    @Test
    public void filterByBodyStyleSearchResultsPage() {
        LOG.info("Login:" + "\n"+"filterByBodyStyleSearchResultsPage Test");
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
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
        searchResultPage.clickBodyStyleTab();
        searchResultPage.selectBodyStyleDropDownList("Sedan");
        searchResultPage.clearZipCodeTextBox();
        searchResultPage.typeAndEnterZip("11565");
        String actualText = getDriver().findElement(By.xpath("//em[contains(text(),'Sedans')]")).getText();
        Assert.assertEquals("Sedans", actualText);
        String actualText1 = getDriver().findElement(By.xpath("//em[contains(text(),'Malverne, NY')]")).getText();
        Assert.assertEquals("Malverne, NY", actualText1);
    }

    //FILTER SEARCH BY PRICE FROM SEARCH RESULTS PAGE TC025

   @Test
    public void filterByPriceSearchResultsPage() {
        LOG.info("Login:" + "\n"+"filterByPriceSearchResultsPage Test");
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        ShoppingForAUsedCarPage shoppingForAUsedCarPage = new ShoppingForAUsedCarPage(getDriver());
        homePage.clickHeaderBuyBtn();
        shoppingForAUsedCarPage.selectAllMakesDropDownList("Acura");
        shoppingForAUsedCarPage.selectAllModelsDropDownList("ILX");
        shoppingForAUsedCarPage.typeMinPriceTextBox("20000");
        shoppingForAUsedCarPage.typeMaxPriceTextBox("35000");
        shoppingForAUsedCarPage.typeZipCode("11375");
        shoppingForAUsedCarPage.selectRadius("50 mi");
        shoppingForAUsedCarPage.clickSearchBtn();
        searchResultPage.clickByPriceTab();
        searchResultPage.clearMinPriceTextBox();
        searchResultPage.typeMinPrice("15000");
        searchResultPage.clearMaxPriceTextBox();
        searchResultPage.typeMaxPrice("25000");
        searchResultPage.clearZipCodeTextBox();
        searchResultPage.typeAndEnterZipCode("11565");
        // searchResultPage.clickSearchButton();
        String actual = getDriver().findElement(By.xpath("//div[contains(text(),'Price Search')]")).getText();
        Assert.assertEquals("Price Search", actual);
    }


    //NAVIGATE TO REQUEST INFO DIALOG BOX TC026
   @Test
    public void requestInfoDialogueBox() {
        LOG.info("Login:" + "\n"+"requestInfoDialogueBox Test");
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        ShoppingForAUsedCarPage shoppingForAUsedCarPage = new ShoppingForAUsedCarPage(getDriver());
        homePage.clickHeaderBuyBtn();
        shoppingForAUsedCarPage.selectAllMakesDropDownList("Acura");
        shoppingForAUsedCarPage.selectAllModelsDropDownList("ILX");
        shoppingForAUsedCarPage.typeMinPriceTextBox("20000");
        shoppingForAUsedCarPage.typeMaxPriceTextBox("35000");
        shoppingForAUsedCarPage.typeZipCode("11375");
        shoppingForAUsedCarPage.selectRadius("50 mi");
        shoppingForAUsedCarPage.clickSearchBtn();
        searchResultPage.clickRequestInfoBtn();
        searchResultPage.typeRequestInfoFirstName("John");
        searchResultPage.typeRequestInfoLastName("Smith");
        searchResultPage.typeRequestInfoPostalCode("11565");
        searchResultPage.typeRequestInfoEmailAddress("abcd1234@gmail.com");
        Assert.assertTrue(getDriver().findElement(By.xpath("//span[contains(text(),'Send')]")).isDisplayed());
    }
}

