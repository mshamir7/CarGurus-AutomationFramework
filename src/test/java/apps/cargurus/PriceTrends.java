package apps.cargurus;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;
import pages.cargurus.UsedCarPriceTrendsPage;

public class PriceTrends extends CommonAPI {

    @Test
    public void priceTrends(){
        HomePage homePage= new HomePage(getDriver());
        UsedCarPriceTrendsPage usedCarPriceTrendsPage = new UsedCarPriceTrendsPage(getDriver());
        homePage.hoverOverResearchMenu(getDriver());
        homePage.clickResearchMenuPriceTrendsLink();
        usedCarPriceTrendsPage.clearStartDateTextBox();
        usedCarPriceTrendsPage.typeStartDateTextBox("5/1/2021");
        usedCarPriceTrendsPage.clearEndDateTextBox();
        usedCarPriceTrendsPage.typeEndDateTextBox("6/8/2022");
        usedCarPriceTrendsPage.clickUpdateChartBtn();
        Assert.assertEquals("Used Car Price Trends - CarGurus", getDriver().getTitle());
    }
}
