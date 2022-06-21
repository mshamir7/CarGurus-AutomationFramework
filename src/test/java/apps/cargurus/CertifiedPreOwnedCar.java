package apps.cargurus;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;
import pages.cargurus.SearchResultPage;

public class CertifiedPreOwnedCar extends CommonAPI {

    @Test
    public void searchCertifiedPreOwnedCars(){
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.clickCertifiedPreownedCarTab();
        homePage.selectCertifiedPreownedCarAllMakesDropDownList("INFINITI");
        homePage.selectCertifiedPreownedCarAllModelsDropDownList("Q60");
        homePage.typeCertifiedPreownedCarZipCode("11375");
        String actualTitle = getDriver().getTitle();
        Assert.assertEquals("Certified INFINITI Q60 For Sale Forest Hills, NY - CarGurus", actualTitle);
    }
}
