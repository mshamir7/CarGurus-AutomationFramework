package apps.cargurus;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;
import pages.cargurus.SearchResultPage;

import java.util.concurrent.TimeUnit;

public class SearchUsedCars extends CommonAPI {

    @Test
    public void byMakeAndModelUsed() {
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage.selectUsedCarMakeDropDownList("Acura");
        homePage.selectUsedCarModelDropDownList("ILX");
        homePage.typeUsedCarMakeModelZipCode("11375");
        homePage.clickUsedCarMakeModelSearchBtn();
        waitFor(3);
        String acutalCar = searchResultPage.getSearchResultHeaderTextUsedCarTitle();
        Assert.assertEquals("Acura ILX", acutalCar);
        String actualZipCodeLocation = searchResultPage.getSearchResultHeaderTextZipCodeLocation();
        Assert.assertEquals("Forest Hills, NY", actualZipCodeLocation);
    }

    //@Test
    public void byBodyStyleUsed() {
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.clickUsedCarByBodyStyle();
        homePage.clickUsedCarByBodyStyleSedanOption();
        homePage.typeByBodyStyleZipCode("11375");
        homePage.clickUsedCarByBodyStyleSearchBtn();
        waitFor(2);
        String acutalBodyStyle = searchResultPage.getSearchResultHeaderTextUsedCarBodyStyle();
        Assert.assertEquals("Sedans", acutalBodyStyle);
    }

    //@Test
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
