package apps.bjs;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.bjs.HomePage;
import pages.bjs.LogInPage;

public class LoginTest extends CommonAPI {

        @Test
        public void validLoginCred() {
            pages.bjs.HomePage homePage = new HomePage(getDriver());
            pages.bjs.LogInPage loginPage = new LogInPage(getDriver());
            homePage.clickSignInBtn();
            loginPage.typeEmailForLogin("kttheman1@aol.com");
            loginPage.typePasswordForLogin("Tomsun@32!");
            loginPage.clickLoginSignInBtn();

        }


    }


