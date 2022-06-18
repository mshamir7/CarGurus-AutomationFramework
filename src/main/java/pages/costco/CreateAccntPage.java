package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Type;

public class CreateAccntPage extends CommonAPI {

    @FindBy(xpath="//*[@id='next']")
    WebElement createAcctbtn;
    @FindBy(xpath="//*[@id='email']")
    WebElement emailIdBtn;
    @FindBy(xpath = "//*[@id='newPassword']")
    WebElement pwdBtn;
    @FindBy(xpath = "//*[@id='reenterPassword']")
    WebElement confirmPwdBtn;
    @FindBy(xpath = "//*[@id='continue']")
    WebElement BtnToCreateAcct;
    public CreateAccntPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void newToCreateAccnt(){
        click(createAcctbtn);
    }
    public void enterEmailId (String text ){

        type(emailIdBtn, text);
    }
    public void  enterpwd (String text ){
        type(pwdBtn, text);

    }
    public void enterpwdToConfirm(String text){
        type(confirmPwdBtn, text);

    }
    public void clickToCreate( ){
        BtnToCreateAcct.click();
    }
}
