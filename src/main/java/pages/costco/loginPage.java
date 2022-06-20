package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends CommonAPI  {

    @FindBy(css ="#signInHeader")
    WebElement headerText;

    @FindBy(xpath="//*[@id='lnkCostcoLogo']/img)")
    WebElement costcoLogo;
    @FindBy(xpath="//*[@id='header_sign_in']")
    WebElement signInOrRegisterTab;


    @FindBy(name="Sign in name")
    WebElement emailaddress;
    @FindBy(name="Password")
    WebElement password;
    @FindBy(xpath ="//*[@id='next']")
    WebElement btnSignin;
    public loginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public String getHeaderText(String s){
        return getElementText(headerText);
    }
    public boolean checkLogoIsPresent(){
        return isPresent(costcoLogo);
    }
    public  void clickTosignInTab(){
        signInOrRegisterTab.click();

    }
    public void setname(String uname){
        emailaddress.sendKeys(uname);
    }

    public void setpassword(String pwd){
        password.sendKeys(pwd);
    }

    public  void clickSignInBtn()
    {
        btnSignin.click();

    }


    /*@FindBy(name="Sign in name")
    WebElement emailaddress;
    @FindBy(name="Password")
    WebElement password;
    @FindBy(xpath ="//*[@id='next']")
    WebElement btnSignin;
    // logo search
    @FindBy(css ="img.bc-logo logo-ca")
    WebElement toCheckLogo();

     */


}
