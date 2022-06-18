package apps.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.automationpractice.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageClickTest extends CommonAPI {


    @Test
    public void test1() {
       HomePage homePage = new HomePage(getDriver());
        homePage.clickCartBtn();


    }


}
