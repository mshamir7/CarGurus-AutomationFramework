package apps.cargurus;

import base.CommonAPI;

public class Testing extends CommonAPI {

    /*@Test
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

        //Update Zipcode From SEARCH RESULTS PAGE TC022

        waitFor(2);
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

    }*/

}
