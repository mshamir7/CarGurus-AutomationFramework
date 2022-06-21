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

    @FindBy(xpath = "//input[@id='zip']")
    private WebElement zipCode;

    @FindBy(xpath = "//button[contains(text(),'Update Zip')]")
    private WebElement updateBtn;

    @FindBy(xpath = "//*[@id='cargurus-listing-search']/div/div/div[2]/div[2]/section/p/span")
    private WebElement errorMessageBanner;

    @FindBy(css = "#react-tabs-6")
    private WebElement bodyStyleTab;

    @FindBy(css = "#bodyTypeGroup")
    private WebElement bodyStyleDropDownList;

    @FindBy(css = "#react-tabs-8")
    private WebElement byPriceTab;

    @FindBy(css = "#minPrice")
    private WebElement minPriceTextBox;

    @FindBy(css = "#maxPrice")
    private WebElement maxPriceTextBox;

    @FindBy(xpath = "//body/main[@id='main']/div[@id='cargurus-listing-search']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[3]/button[1]")
    private WebElement searchBtn;

    @FindBy(css = "button[class='HaLmAx kMGxRh SUJbPV nM1LaL']")
    private WebElement requestInfoBtn;

    @FindBy(css = "input[name='firstName']")
    private WebElement requestInfoFirstName;

    @FindBy(css = "input[name='lastName']")
    private WebElement requestInfoLastName;

    @FindBy(css = "input[name='postalCode']")
    private WebElement requestInfoPostalCode;

    @FindBy(css = "input[name='emailAddress']")
    private WebElement requestInfoEmailAddress;

    @FindBy(css = "span[contains(text(),'Send')]")
    private WebElement requestInfoSendBtn;




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

    public void clickBodyStyleTab(){
        click(bodyStyleTab);
    }

    public void selectBodyStyleDropDownList(String option){
        selectFromDropdown(bodyStyleDropDownList, option);
    }

    public void typeAndEnterZip(String text){
        typeAndEnter(zipCode, text);
    }

    public void clickByPriceTab(){
        click(byPriceTab);
    }

    public void clearMinPriceTextBox(){
        clear(minPriceTextBox);
    }

    public void typeMinPrice(String text){
        type(minPriceTextBox, text);
    }

    public void clearMaxPriceTextBox(){
        clear(maxPriceTextBox);
    }

    public void typeMaxPrice(String text){
        type(maxPriceTextBox, text);
    }

    public void typeZipCode(String text){
        type(zipCode, text);
    }

    public void clickSearchBtn(){
        click(searchBtn);
    }

    public void clickRequestInfoBtn(){
        click(requestInfoBtn);
    }

    public  void typeRequestInfoFirstName(String text){
        type(requestInfoFirstName, text);
    }

    public void typeRequestInfoLastName(String text){
        type(requestInfoLastName, text);
    }

    public void typeRequestInfoPostalCode(String text){
        type(requestInfoPostalCode, text);
    }

    public void typeRequestInfoEmailAddress(String text){
        type(requestInfoEmailAddress, text);
    }
}
