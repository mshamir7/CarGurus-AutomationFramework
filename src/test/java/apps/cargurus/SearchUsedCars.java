package apps.cargurus;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;
import pages.cargurus.SearchResultPage;

public class SearchUsedCars extends CommonAPI {

    @Test
    public void byMakeAndModelUsed() {
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.selectUsedCarMakeDropDownList("Acura");
        homePage.selectUsedCarModelDropDownList("ILX");
        homePage.typeUsedCarMakeModelZipCode("11375");
        homePage.clickUsedCarMakeModelSearchBtn();
        String actualCar = searchResultPage.getSearchResultHeaderTextUsedCarTitle();
        Assert.assertEquals("Acura ILX", actualCar);
        String actualZipCodeLocation = searchResultPage.getSearchResultHeaderTextZipCodeLocation();
        Assert.assertEquals("Forest Hills, NY", actualZipCodeLocation);
    }

    @Test
    public void byBodyStyleUsed() {
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.clickUsedCarByBodyStyle();
        homePage.clickUsedCarByBodyStyleSedanOption();
        homePage.typeByBodyStyleZipCode("11375");
        homePage.clickUsedCarByBodyStyleSearchBtn();
        String acutalBodyStyle = searchResultPage.getSearchResultHeaderTextUsedCarBodyStyle();
        Assert.assertEquals("Sedans", acutalBodyStyle);
    }

    @Test
    public void byPriceUsed() {
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.clickUsedCarByPriceTabLink();
        homePage.selectUsedCarByPriceDropdownListMin("$20,000");
        homePage.selectUsedCarByPriceDropdownListMax("$35,000");
        homePage.typeUsedCarByPriceZipCode("11375");
        homePage.clickUsedCarPriceSearchButton();
        String actualByPrice = searchResultPage.getSearchResultHeaderTextByPrice();
        Assert.assertEquals("Price Search", actualByPrice);
    }
}


















