package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryPage extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),'Instant Market Value (IMV)')]")
    private WebElement instantMarketValueIMVLink;

    public DeliveryPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public  void clickInstantMarketValueIMVLink(){
        click(instantMarketValueIMVLink);
    }
}
