package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends CommonAPI {

    @FindBy(xpath = "//*[@id='cargurus-listing-search']/div/div/div[2]/div[2]/div[1]/div/div")
    private WebElement searchResultHeaderTextUsedCarTitle;

    @FindBy(xpath = "//*[@id='cargurus-listing-search']/div/div/div[1]/h1/em[2]")
    private WebElement searchResultHeaderTextZipCodeLocation;

    @FindBy(xpath = "//*[@id='cargurus-listing-search']/div/div/div[2]/div[2]/div[1]/div/div")
    private WebElement searchResultHeaderTitleUsedCarBodyStyle;

    @FindBy(xpath = "//*[text()='Price Search']")
    private WebElement searchResultHeaderTextByPrice;

    @FindBy(xpath = "//*[@id='cargurus-listing-search']/div/div/div[2]/div[2]/div[1]/div/div")
    private WebElement searchResultHeaderTextNewCarTitle;

    @FindBy(css = "input[name='zip']")
    private WebElement zipCode;

    @FindBy(xpath = "//button[contains(text(),'Update Zip')]")
    private WebElement updateBtn;

    @FindBy(xpath = "//body/main[@id='main']/div[@id='cargurus-listing-search']/div[1]/div[1]/div[2]/div[2]/section[1]")
    private WebElement errorMessageBanner;

    public SearchResultPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getSearchResultHeaderTextUsedCarTitle() {
        return getElementText(searchResultHeaderTextUsedCarTitle);
    }

    public String getSearchResultHeaderTextZipCodeLocation() {
        return getElementText(searchResultHeaderTextZipCodeLocation);
    }

    public String getSearchResultHeaderTextUsedCarBodyStyle() {
        return getElementText(searchResultHeaderTitleUsedCarBodyStyle);
    }

    public String getSearchResultHeaderTextByPrice() {
        return getElementText(searchResultHeaderTextByPrice);
    }

    public String getSearchPageTitle(){
        return getPageTitle();
    }

    public void clearZipCodeTextBox(){
        clear(zipCode);
    }
    public void typeAndUpdateZipCode(String text) {
        type(zipCode, text);
    }

    public void clickUpdateZip(){
        click(updateBtn);
    }

    public boolean assertErrorMessageBanner(){
       return isPresent(errorMessageBanner);
    }
}
