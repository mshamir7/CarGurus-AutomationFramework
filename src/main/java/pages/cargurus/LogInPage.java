package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogInPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(LogInPage.class);

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
        LOG.info("email entered");
    }
    public void enterEmailNextBtn(){
        click(emailNextBtn);
        LOG.info("next button clicked");
    }
    public void enterPassword(String text){
        type(enterPasswordTextBox, text);
        LOG.info("password entered");
    }
    public void enterPasswordSignInBtn(){
        click(passwordSignIntBtn);
        LOG.info("sign in button clicked");
    }

    public String invalidPasswordErrorText(){
        LOG.info("get invalid password error text");
        return getElementText(invalidPasswordErrorMessage);
    }
}
