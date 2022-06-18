package apps.pagetestcasescosto;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.costco.HomePage;

import java.net.CookieHandler;

public class DropdownTest extends CommonAPI {

    @Test(enabled = true)
    public void selectBabyOptionFromShopMenu() {
        HomePage homePage = new HomePage(getDriver());
        homePage.searchProduct("toy cars");
        homePage.clickToSearch();
        homePage.selectOptionFromShopMenuDropdown("Baby");
        waitFor(5);
    }

    @Test(enabled = false)
    public void getDropDownlist() {

        HomePage homePage = new HomePage(getDriver());
        for (String str : homePage.getHomePageDropdownOptions()) {
            System.out.println(str);
        }

    }

    @Test(enabled = false)
    public void selectComputerOptionFromDropdown() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromShopMenuDropdownWithSelectOptions("computer");
        waitFor(5);
    }

    @Test(enabled = false)
    public void selectprinterOptionFromDropdown() {
        HomePage homePage = new HomePage(getDriver());
        homePage.selectOptionFromShopMenuDropdownWithGivenText("printer");
        waitFor(5);
    }
}