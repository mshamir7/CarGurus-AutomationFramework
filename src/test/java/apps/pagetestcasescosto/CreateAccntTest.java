package apps.pagetestcasescosto;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.costco.CreateAccntPage;
import pages.costco.HomePage;
import pages.costco.loginPage;

public class CreateAccntTest extends CommonAPI {


    @Test
    public  void newToCreateAccnt(){

        CreateAccntPage createAccnt =new CreateAccntPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        homePage.clickSignIn();
        waitFor(3);
        createAccnt.newToCreateAccnt();
        createAccnt.enterEmailId ("dilruba@shaw.ca");
        waitFor(3);
        createAccnt.enterpwd("Abcd@2022");
        createAccnt.enterpwdToConfirm("Abcd@2022");
        waitFor(3);
        createAccnt.clickToCreate();


    }



}
