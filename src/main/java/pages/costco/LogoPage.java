package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoPage extends CommonAPI {

    @FindBy(xpath = "//*[@id='header-widget']/div[2]/div/div/div/div[2]/div/div[1]/a/img")
    WebElement homeLogo;

    public LogoPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void logoAtHomePage(){
        homeLogo.click();
    }

}
