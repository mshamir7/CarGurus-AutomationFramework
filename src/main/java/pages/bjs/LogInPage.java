package pages.bjs;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends CommonAPI {

    @FindBy(css = "#emailLogin")
    private WebElement enterEmailIdForLogIn;

    @FindBy(css = "#inputPassword")
    private WebElement enterPasswordForLogIn;

    @FindBy(css = "button[class = 'btn sign-in-submit-btn red-btn']")
    private WebElement loginSignInBtn;


    public LogInPage(WebDriver driver) { PageFactory.initElements(driver, this); }

    public void clickLoginSignInBtn() {
        click(loginSignInBtn);
    }

    public void typeEmailForLogin (String text) {
        type(enterEmailIdForLogIn, text);
    }

    public void typePasswordForLogin (String text) {
        type(enterPasswordForLogIn, text);
    }
}
