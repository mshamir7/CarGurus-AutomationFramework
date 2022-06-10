package apps.cargurus;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;
import pages.cargurus.LogInPage;

import java.util.concurrent.TimeUnit;

public class recommendedCarsBasedOnSearchHistory extends CommonAPI {

    @Test
    public void viewRecommendedCarsBasedOnSearchHistory() {
        HomePage homePage = new HomePage(getDriver());
        LogInPage login = new LogInPage(getDriver());
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        waitFor(3);
        homePage.clickSignInBtn();
        login.enterEmail("ravenn587@aol.com");
        login.enterEmailNextBtn();
        login.enterPassword("Abcd1234*?");
        login.enterPasswordSignInBtn();
        waitFor(3);
        String actual = homePage.getAccountUserName();
        Assert.assertEquals("RavenN1", actual);
        waitFor(3);
        homePage.clickProfileMenuDropDown();
        homePage.clickRecommendedCarsProfileDropDownOption();
        String actualHeaderText = getDriver().findElement(By.xpath("//*[@id='cg-recommended']/div/h1")).getText();
        Assert.assertEquals("Recommended for you", actualHeaderText);

    }
}
