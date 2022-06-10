package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingForAUsedCarPage extends CommonAPI {


    @FindBy(xpath = "//a[contains(text(),'Cheap Manual Cars for Sale')]")
    WebElement cheapManualCarsForSaleLink;

    @FindBy(xpath = "//*[@id='faq_9_heading']/a/span")
    WebElement scrollToViews;


    public ShoppingForAUsedCarPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void scrollToViewElement(){
        scrollToView(scrollToViews);
    }

    public void clickCheapManualCarsForSaleLink(){
        click(cheapManualCarsForSaleLink);
    }
}
