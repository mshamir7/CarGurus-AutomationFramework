package apps.cargurus;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;
import pages.cargurus.CertifiedPreOwnedCarsPage;

public class CertifiedCars extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CertifiedCars.class);

    @Test
    public void offerProcessFAQ(){
        LOG.info("SellMyCarFAQ:" + "\n"+"offerProcessFAQ Test");
        HomePage homePage = new HomePage(getDriver());
        CertifiedPreOwnedCarsPage certifiedPreOwnedCarsPage = new CertifiedPreOwnedCarsPage(getDriver());
        homePage.hoverOverBuyMenu(getDriver());
        homePage.clickCertifiedCarLink();
       // certifiedPreOwnedCarsPage.scrollIntoView();
certifiedPreOwnedCarsPage.assertByBodyStyleSedan();

       // Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id='root']/div[1]/section[2]/div[2]/details[2]/summary/h3")).isDisplayed());
      //  homePage.hoverOverSellMenu(getDriver());
      //  homePage.clickSellMyCarFAQLink();
       // sellMyCarFAQPage.assertOfferProcess();
    }
}
