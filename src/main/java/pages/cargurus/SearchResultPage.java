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
}
