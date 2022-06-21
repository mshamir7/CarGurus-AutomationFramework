package apps.cargurus;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;
import pages.cargurus.SearchForDealersPage;

public class DealerShipsNearMe extends CommonAPI {

    @Test
    public void findDealerShipNearMe(){
        HomePage homePage = new HomePage(getDriver());
        SearchForDealersPage searchForDealersPage = new SearchForDealersPage(getDriver());
        homePage.hoverOverBuyMenu(getDriver());
        homePage.clickBuyMenuDealershipNearMeLink();
        searchForDealersPage.typeLocationTextBox("Forest Hills, NY 11375");
        searchForDealersPage.selectDistanceDropDownList("25 mi");
        searchForDealersPage.selectDealershipDropDownList("Acura");
        searchForDealersPage.clickSearchDealershipSearchBtn();
        String actual = getDriver().findElement(By.xpath("//*[@id='root']/div[4]/section[1]/div[1]/h1")).getText();
        Assert.assertEquals("Acura dealerships near me (Forest Hills, Queens, NY 11375)", actual);
    }
}
