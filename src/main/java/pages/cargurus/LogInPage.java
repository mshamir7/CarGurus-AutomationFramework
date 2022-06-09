package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends CommonAPI {

    @FindBy(css = "#registerEmail")
    WebElement enterEmailTextBox;

    @FindBy(xpath = "//*[text()= 'Next']")
    WebElement emailNextBtn;

    @FindBy(css = "#loginPassword")
    WebElement enterPasswordTextBox;

    @FindBy(xpath = "//*[text()='Sign in']")
    WebElement passwordSignIntBtn;

    @FindBy(xpath = "//*[text()='Incorrect email address or password']")
    WebElement invalidPasswordErrorMessage;

    public LogInPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String text){
        type(enterEmailTextBox, text);
    }
    public void enterEmailNextBtn(){
        click(emailNextBtn);
    }
    public void enterPassword(String text){
        type(enterPasswordTextBox, text);
    }
    public void enterPasswordSignInBtn(){
        click(passwordSignIntBtn);
    }

    public String invalidPasswordErrorText(){
        return getElementText(invalidPasswordErrorMessage);
    }
}
