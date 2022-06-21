package apps.cargurus;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;
import pages.cargurus.LogInPage;

import java.util.concurrent.TimeUnit;

public class Login extends CommonAPI {

    @Test
    public void loginValidCred() {
        HomePage homePage = new HomePage(getDriver());
        LogInPage login = new LogInPage(getDriver());
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

        //Sign out of user profile

        homePage.clickProfileMenuDropDown();
        waitFor(3);
        homePage.signOutProfileUsingDropDown();
        // Assert.assertEquals("Sell your car | It’s free & 100% online | CarGurus - CarGurus", driver.getTitle());
    }

    @Test
    public void loginInvalidCred() {
        HomePage homePage = new HomePage(getDriver());
        LogInPage login = new LogInPage(getDriver());
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        waitFor(3);
        homePage.clickSignInBtn();
        login.enterEmail("ravenn587@aol.com");
        login.enterEmailNextBtn();
        login.enterPassword("Abd1234*?");
        login.enterPasswordSignInBtn();
        String actual = login.invalidPasswordErrorText();
        Assert.assertEquals("Incorrect email address or password", actual);
        waitFor(5);

    }
}
