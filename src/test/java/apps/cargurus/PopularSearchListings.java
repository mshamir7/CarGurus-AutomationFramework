package apps.cargurus;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;
import pages.cargurus.ShoppingForAUsedCarPage;

public class PopularSearchListings extends CommonAPI {

    @Test
    public void usePopularSearchListings(){
        HomePage homePage = new HomePage(getDriver());
        ShoppingForAUsedCarPage shoppingForAUsedCarPage = new ShoppingForAUsedCarPage(getDriver());
        homePage.clickHeaderBuyBtn();
        //shoppingForAUsedCarPage.scrollToViewElement();
        shoppingForAUsedCarPage.clickCheapManualCarsForSaleLink();
        String actualTitle = getDriver().findElement(By.xpath("//*[@id='cargurus-listing-search']/div/div/div[1]/h1")).getText();
        Assert.assertEquals("Manual Cars for Sale", actualTitle);
    }
}
