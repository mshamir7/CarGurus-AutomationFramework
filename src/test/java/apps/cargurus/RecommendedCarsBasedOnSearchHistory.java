package apps.cargurus;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;
import pages.cargurus.LogInPage;

public class RecommendedCarsBasedOnSearchHistory extends CommonAPI {

    @Test
    public void viewRecommendedCarsBasedOnSearchHistory() {
        HomePage homePage = new HomePage(getDriver());
        LogInPage login = new LogInPage(getDriver());
        homePage.clickSignInBtn();
        login.enterEmail("ravenn587@aol.com");
        login.enterEmailNextBtn();
        login.enterPassword("Abcd1234*?");
        login.enterPasswordSignInBtn();
        String actual = homePage.getAccountUserName();
        Assert.assertEquals("RavenN1", actual);
        homePage.clickProfileMenuDropDown();
        homePage.clickRecommendedCarsProfileDropDownOption();
        String actualHeaderText = getDriver().findElement(By.xpath("//*[@id='cg-recommended']/div/h1")).getText();
        Assert.assertEquals("Recommended for you", actualHeaderText);
    }
}
