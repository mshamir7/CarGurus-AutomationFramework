package apps.cargurus;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;
import pages.cargurus.LogInPage;
import utility.Utility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public class Login extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(Login.class);

    Properties prop = Utility.loadProperties();

    @Test
    public void loginValidCred() {
        HomePage homePage = new HomePage(getDriver());
        LogInPage login = new LogInPage(getDriver());
        homePage.clickSignInBtn();
        LOG.info("sign in button clicked successfully");
        login.enterEmail("Ravenn587@aol.com");
        LOG.info("email entered successfully");
        login.enterEmailNextBtn();
        LOG.info("next button clicked successfully");
        String passwordDecode = Utility.decode("QWJjZDEyMzQqPw==");
        login.enterPassword(passwordDecode);
        LOG.info("password entered successfully");
        login.enterPasswordSignInBtn();
        LOG.info("sign in button clicked successfully");
        String actual = homePage.getAccountUserName();
        Assert.assertEquals("RavenN1", actual);
    }

    //Sign out of user profile
    @Test
    public void signOutOfUserProfile() {
        HomePage homePage = new HomePage(getDriver());
        LogInPage login = new LogInPage(getDriver());
        homePage.clickSignInBtn();
        login.enterEmail("Ravenn587@aol.com");
        login.enterEmailNextBtn();
        String passwordDecode = Utility.decode("QWJjZDEyMzQqPw==");
        login.enterPassword(passwordDecode);
        login.enterPasswordSignInBtn();
        homePage.clickProfileMenuDropDown();
        homePage.signOutProfileUsingDropDown();
        // Assert.assertEquals("Sell your car | It’s free & 100% online | CarGurus - CarGurus", driver.getTitle());
    }

    @Test
    public void loginInvalidCred() {
        HomePage homePage = new HomePage(getDriver());
        LogInPage login = new LogInPage(getDriver());
        homePage.clickSignInBtn();
        login.enterEmail("ravenn587@aol.com");
        login.enterEmailNextBtn();
        String passwordDecode = Utility.decode("QWJkMTIzNCo/");
        login.enterPassword(passwordDecode);
        login.enterPasswordSignInBtn();
        String actual = login.invalidPasswordErrorText();
        Assert.assertEquals("Incorrect email address or password", actual);
    }
}
