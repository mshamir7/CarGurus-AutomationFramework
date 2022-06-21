package apps.cargurus;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;
import pages.cargurus.WhatsMyCarWorthPage;

public class CarValues extends CommonAPI {

    @Test
    public void sellMenuCarValues(){
        HomePage homePage = new HomePage(getDriver());
        WhatsMyCarWorthPage whatsMyCarWorthPage = new WhatsMyCarWorthPage(getDriver());
        homePage.hoverOverSellMenu(getDriver());
        homePage.clickCarValuesLink();
        whatsMyCarWorthPage.selectPurposeDropDownList("Trading in a car");
        whatsMyCarWorthPage.selectMakeDropDownList("Honda");
        whatsMyCarWorthPage.selectModelDropDownList("Accord");
        whatsMyCarWorthPage.selectYearDropDownList("2016");
        whatsMyCarWorthPage.selectTrimDropDownList("Sport");
        whatsMyCarWorthPage.typeCarValuesZipCode("11375");
        whatsMyCarWorthPage.typeCarValuesPrice("20000");
        Assert.assertTrue(whatsMyCarWorthPage.assertPriceReportAssertionLogo());
    }
}
