package apps.cargurus;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;
import pages.cargurus.SearchResultPage;

public class CertifiedPreOwnedCar extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CertifiedPreOwnedCar.class);

    @Test
    public void searchCertifiedPreOwnedCars() {
        LOG.info("CertifiedPreOwnedCar:" + "\n"+"searchCertifiedPreOwnedCars Test");
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.clickCertifiedPreownedCarTab();
        homePage.selectCertifiedPreownedCarAllMakesDropDownList("INFINITI");
        homePage.selectCertifiedPreownedCarAllModelsDropDownList("Q60");
        homePage.typeCertifiedPreownedCarZipCode("11375");
        Assert.assertEquals(getDriver().getTitle(), "Certified INFINITI Q60 For Sale Forest Hills, NY - CarGurus");
    }
}
