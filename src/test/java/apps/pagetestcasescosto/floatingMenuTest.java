package apps.pagetestcasescosto;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.costco.HomePage;
import pages.costco.loginPage;

public class floatingMenuTest extends CommonAPI {

    @Test(enabled = false)
    public void floatingMenu(){
        HomePage homePage =new HomePage(getDriver());
        loginPage loginPage= new loginPage(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        homePage.clickSignIn();
        String text = loginPage.getHeaderText("//*[@id='signInHeader']");
        Assert.assertEquals("Sign In | Costco", text);
    }
    @Test
    public void validateLoginPage(){
        HomePage homePage = new HomePage(getDriver());
        loginPage loginPage = new loginPage(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        homePage.clickSignIn();
        Assert.assertFalse(loginPage.checkLogoIsPresent());
        //loginPage.checkLogoIsPresent();
        }



    }


