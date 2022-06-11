package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingForAUsedCarPage extends CommonAPI {


    @FindBy(xpath = "//a[contains(text(),'Cheap Manual Cars for Sale')]")
    private WebElement cheapManualCarsForSaleLink;

    @FindBy(xpath = "//*[@id='faq_9_heading']/a/span")
    private WebElement scrollToViews;

    @FindBy(xpath = "//select[@id='Select Make']")
    private WebElement allMakesDropDownList;

    @FindBy(xpath = "//select[@id='Select Model']")
    private WebElement allModelsDropDownList;

    @FindBy(css = "input[name='minPrice']")
    private WebElement minPriceTextBox;

    @FindBy(css = "input[name='maxPrice']")
    private WebElement maxPriceTextBox;

    @FindBy(css = "input[name='zip']")
    private WebElement zipCode;

    @FindBy(xpath = "//select[@id='radius']")
    private WebElement radius;

    @FindBy(xpath = "//body/div[1]/main[1]/section[2]/div[1]/form[1]/button[1]")
    private WebElement searchBtn;


    public ShoppingForAUsedCarPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void scrollToViewElement() {
        scrollToView(scrollToViews);
    }

    public void clickCheapManualCarsForSaleLink() {
        click(cheapManualCarsForSaleLink);
    }

    public void selectAllMakesDropDownList(String option) {
        selectFromDropdown(allMakesDropDownList, option);
    }

    public void selectAllModelsDropDownList(String option) {
        selectFromDropdown(allModelsDropDownList, option);
    }

    public void typeMinPriceTextBox(String text) {
        type(minPriceTextBox, text);
    }

    public void typeMaxPriceTextBox(String text) {
        type(maxPriceTextBox, text);
    }

    public void typeZipCode(String text) {
        type(zipCode, text);
    }

    public void selectRadius(String option) {
        selectFromDropdown(radius, option);
    }

    public void clickSearchBtn(){
        click(searchBtn);
    }
}
