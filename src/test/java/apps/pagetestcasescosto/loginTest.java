package apps.pagetestcasescosto;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.costco.loginPage;

public class loginTest extends CommonAPI {

@Test
    public void signInOrRegister(){
    loginPage logtoPage = new loginPage (getDriver());
    logtoPage.clickTosignInTab();
    logtoPage.setname("dilruba@shaw.ca");
    logtoPage.setpassword("Abcd@2022");
    logtoPage.clickSignInBtn();
}






}









