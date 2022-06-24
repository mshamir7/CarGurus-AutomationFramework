package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchResultPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(SearchResultPage.class);

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

    @FindBy(xpath = "//*[@id='zip']")
    private WebElement zipCode;

    @FindBy(css = "input[id = 'zip']")
    private WebElement typeZipCodeText;

    @FindBy(xpath = "//*[@id='zip']")
    private WebElement clearZipCodeText;

    @FindBy(css = "button[class = 'BnSO43 AQU0eZ QEqQC1']")
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

    @FindBy(xpath = "//*[@id='react-tabs-5']/form/button")
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
        LOG.info("get Search Result Header Text Used Car Title");
        return getElementText(searchResultHeaderTextUsedCarTitle);
    }

    public String getSearchResultHeaderTextZipCodeLocation() {
        LOG.info("get Search Result Header Text ZipCode Location");
        return getElementText(searchResultHeaderTextZipCodeLocation);
    }

    public String getSearchResultHeaderTextUsedCarBodyStyle() {
        LOG.info("get Search Result Header Text Used Car Body Style");
        return getElementText(searchResultHeaderTitleUsedCarBodyStyle);
    }

    public String getSearchResultHeaderTextByPrice() {
        LOG.info("get Search Result Header Text By Price");
        return getElementText(searchResultHeaderTextByPrice);
    }

    public String getSearchPageTitle(){
        LOG.info("get search page title");
        return getPageTitle();
    }

    public void clearZipCodeTextBox(){
        clear(zipCode);
        LOG.info("Zipcode text box cleared");
    }
    public void typeAndUpdateZipCode(String text) {
        type(zipCode, text);
        LOG.info("type Zipcode");
    }

    public void clickUpdateZip(){
        click(updateBtn);
        LOG.info("click update zip");
    }

    public boolean assertErrorMessageBanner(){
        LOG.info("assert Error Message Banner");
       return isPresent(errorMessageBanner);
    }

    public void clickBodyStyleTab(){
        click(bodyStyleTab);
        LOG.info("body style tab clicked");
    }

    public void selectBodyStyleDropDownList(String option){
        selectFromDropdown(bodyStyleDropDownList, option);
        LOG.info("Body Style Drop Down List option selected");
    }

    public void typeAndEnterZip(String text){
        typeAndEnter(zipCode, text);
        LOG.info("type Zipcode");
    }

    public void typeUpdatedZip(String text){
        type(typeZipCodeText, text);
        LOG.info("type and enter Zipcode");
    }

    public void clearUpdateZip() {
        clear(clearZipCodeText);
        LOG.info("Zipcode cleared");
    }

    public void clickByPriceTab(){
        click(byPriceTab);
        LOG.info("by price tab clicked");
    }

    public void clearMinPriceTextBox(){
        clear(minPriceTextBox);
        LOG.info("Min price text box cleared");
    }

    public void typeMinPrice(String text){
        type(minPriceTextBox, text);
        LOG.info("type Min price");
    }

    public void clearMaxPriceTextBox(){
        clear(maxPriceTextBox);
        LOG.info("Max price text box cleared");
    }

    public void typeMaxPrice(String text){
        type(maxPriceTextBox, text);
        LOG.info("type Max price");
    }

    public void typeAndEnterZipCode(String text){
        typeAndEnter(zipCode, text);
        LOG.info("type And Enter ZipCode");
    }

    public void clickSearchButton(){
        click(searchBtn);
        LOG.info("search button clicked");
    }

    public void clickRequestInfoBtn(){
        click(requestInfoBtn);
        LOG.info("request info button clicked");
    }

    public  void typeRequestInfoFirstName(String text){
        type(requestInfoFirstName, text);
        LOG.info("type request info first name");
    }

    public void typeRequestInfoLastName(String text){
        type(requestInfoLastName, text);
        LOG.info("type last name");
    }

    public void typeRequestInfoPostalCode(String text){
        type(requestInfoPostalCode, text);
        LOG.info("type zipcode");
    }

    public void typeRequestInfoEmailAddress(String text){
        type(requestInfoEmailAddress, text);
        LOG.info("type email address");
    }
}
