package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

    //USED CAR OBJECTS: -------------------------------------------------------------------------------------------------------------------------------------
    @FindBy(css = ".navTitle")
    private WebElement signInBtn;

    @FindBy(css = "#account-menu-control")
    private WebElement profileMenuDropDown;

    @FindBy(xpath = "//*[@id='authLink']")
    private WebElement signOutProfileDropDown;

    @FindBy(xpath = "//*[@id='account-menu-username']")
    private WebElement accountUserName;

    @FindBy(css = "#carPickerUsed_makerSelect")
    private WebElement usedCarMakeDropdownListOption;

    @FindBy(css = "#carPickerUsed_modelSelect")
    private WebElement usedCarModelDropdownListOption;

    @FindBy(css = "#dealFinderZipUsedId_dealFinderForm")
    private WebElement usedCarMakeModelZip;

    @FindBy(css = "#dealFinderForm_0")
    private WebElement usedCarMakeModelSearchBtn;

    @FindBy(xpath = "//*[text()='By Body Style']")
    private WebElement usedCarByBodyStyleTabLink;

    @FindBy(xpath = "//*[@id='dealFinderFormBody']/fieldset/div[1]/div/div[2]")
    private WebElement usedCarByBodyStyleSedanOption;

    @FindBy(css = "#dealFinderFormBody_0")
    private WebElement usedCarByBodyStyleSearchButton;

    @FindBy(css = "#dealFinderZipUsedId_dealFinderFormBody")
    private WebElement usedCarByBodyStyleZipCode;

    @FindBy(xpath = "//*[@id='usedSearch']/label[3]/span")
    private WebElement usedCarByPriceTabLink;

    @FindBy(xpath = "//*[@id='dealFinderFormPrice']/fieldset/div/div[1]/select")
    private WebElement usedCarByPriceDropdownListMin;

    @FindBy(xpath = "//*[@id='dealFinderFormPrice']/fieldset/div/div[2]/select")
    private WebElement usedCarByPriceDropdownListMax;

    @FindBy(css = "#dealFinderZipUsedId_dealFinderFormPrice")
    private WebElement usedCarByPriceZip;

    @FindBy(css = "#dealFinderFormPrice_0")
    private WebElement usedCarByPriceSearchButton;

    //NEW CAR OBJECTS: --------------------------------------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//*[text()='New Car']")
    private WebElement newCarTab;

    @FindBy(css = "#carPickerNew_makerSelect")
    private WebElement newCarByMakeModelMakeDropDownList;

    @FindBy(css = "#carPickerNew_modelSelect")
    private WebElement newCarByMakeModelModelDropDownList;

    @FindBy(css = "#dealFinderZipNewId")
    private WebElement newCarMakeModelZipcode;

    @FindBy(css = "#newCarSearchForm_0")
    private WebElement newCarMakeModelSearchBtn;

    @FindBy(xpath = "//*[@id=\"newSearchTabs\"]/label[2]/span")
    private WebElement newCarByBodyStyleTabLink;

    @FindBy(xpath = "//*[@id=\"dealFinderFormBodyNew\"]/fieldset/div[1]/div/div[3]")
    private WebElement newCarByBodyStylePickupTruckOption;

    @FindBy(css = "#dealFinderZipUsedId_dealFinderFormBodyNewCar")
    private WebElement newCarByBodyStyleZipCode;

    @FindBy(xpath = "//*[@id='newSearchTabs']/label[3]/span")
    WebElement newCarByPriceTabLink;

    @FindBy(xpath = "//*[@id='dealFinderFormPriceNew']/fieldset/div/div[1]/select")
    WebElement newCarByPriceDropDownListMin;

    @FindBy(xpath = "//*[@id='dealFinderFormPriceNew']/fieldset/div/div[2]/select")
    WebElement newCarByPriceDropDownListMax;

    @FindBy(css = "#dealFinderZipUsedId_dealFinderFormPriceNew")
    WebElement newCarByPriceZipCode;

    @FindBy(xpath = "//*[text()='Certified Pre-Owned']")
    WebElement certifiedPreownedCarTab;

    @FindBy(xpath = "//*[@id='carPickerCpo_makerSelect']" )
    WebElement certifiedPreownedCarAllMakesDropDownList;

    @FindBy(xpath = "//*[@id='carPickerCpo_modelSelect']")
    WebElement certifiedPreownedCarAllModelsDropDownList;

    @FindBy(css = "#dealFinderZipCPOId")
    WebElement certifiedPreownedCarZipCode;


    //SELL MENU OBJECTS: ------------------------------------------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//*[text()='Sell']")
    WebElement hoverOverSell;

    @FindBy(xpath = "//*[text()='Car Values']")
    WebElement carValuesLink;



    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    //USED CAR METHODS: --------------------------------------------------------------------------------------------------------------------------------------
    public void clickSignInBtn() {
        click(signInBtn);
    }

    public void clickProfileMenuDropDown() {
        click(profileMenuDropDown);
    }

    public void signOutProfileUsingDropDown() {
        click(signOutProfileDropDown);
    }

    public String getAccountUserName() {
        return getElementText(accountUserName);
    }

    public void selectUsedCarMakeDropDownList(String option) {
        selectFromDropdown(usedCarMakeDropdownListOption, option);
    }

    public void selectUsedCarModelDropDownList(String option) {
        selectFromDropdown(usedCarModelDropdownListOption, option);
    }

    public void typeUsedCarMakeModelZipCode(String zipcode) {
        type(usedCarByBodyStyleZipCode, zipcode);
    }

    public void clickUsedCarMakeModelSearchBtn() {
        click(usedCarMakeModelSearchBtn);
    }

    public void clickUsedCarByBodyStyle() {
        click(usedCarByBodyStyleTabLink);
    }

    public void clickUsedCarByBodyStyleSedanOption() {
        click(usedCarByBodyStyleSedanOption);
    }

    public void clickUsedCarByBodyStyleSearchBtn() {
        click(usedCarByBodyStyleSearchButton);
    }

    public void typeByBodyStyleZipCode(String zipcode) {
        type(usedCarByBodyStyleZipCode, zipcode);
    }

    public void clickUsedCarByPriceTabLink() {
        click(usedCarByPriceTabLink);
    }

    public void selectUsedCarByPriceDropdownListMin(String option) {
        selectFromDropdown(usedCarByPriceDropdownListMin, option);
    }

    public void selectUsedCarByPriceDropdownListMax(String option) {
        selectFromDropdown(usedCarByPriceDropdownListMax, option);
    }

    public void typeUsedCarByPriceZipCode(String zipcode) {
        type(usedCarByPriceZip, zipcode);
    }

    public void clickUsedCarPriceSearchButton() {
        click(usedCarByPriceSearchButton);
    }

    //NEW CAR METHODS: ---------------------------------------------------------------------------------------------------------------------------------------

    public void clickNewCarTab() {
        click(newCarTab);
    }

    public void selectNewCarByMakeModelMakeDropDownList(String option) {
        selectFromDropdown(newCarByMakeModelMakeDropDownList, option);
    }

    public void selectNewCarByMakeModelModelDropDownList(String option) {
        selectFromDropdown(newCarByMakeModelModelDropDownList, option);
    }

    public void typeNewCarMakeModelZipcode(String text) {
        type(newCarMakeModelZipcode, text);
    }

    public void clickNewCarMakeModelSearchBtn() {
        click(newCarMakeModelSearchBtn);
    }

    public void clickNewCarByBodyStyleTabLink() {
        click(newCarByBodyStyleTabLink);
    }

    public void clickNewCarByBodyStylePickupTruckOption() {
        click(newCarByBodyStylePickupTruckOption);
    }

    public void typeNewCarByBodyStyleZipCode(String text) {
        typeAndEnter(newCarByBodyStyleZipCode, text);
    }

    public void clickNewCarByPriceTabLink(){
        click(newCarByPriceTabLink);
    }

    public void selectNewCarByPriceDropDownListMin(String option){
        selectFromDropdown(newCarByPriceDropDownListMin, option);
    }

    public void selectNewCarByPriceDropDownListMax(String option){
        selectFromDropdown(newCarByPriceDropDownListMax, option);
    }

    public void typeNewCarByPriceZipCode(String text){
        typeAndEnter(newCarByPriceZipCode, text);
    }

    public void clickCertifiedPreownedCarTab(){
        click(certifiedPreownedCarTab);
    }

    public void selectCertifiedPreownedCarAllMakesDropDownList(String option){
        selectFromDropdown(certifiedPreownedCarAllMakesDropDownList, option);
    }

    public void selectCertifiedPreownedCarAllModelsDropDownList(String option){
        selectFromDropdown(certifiedPreownedCarAllModelsDropDownList, option);
    }

    public void typeCertifiedPreownedCarZipCode(String text){
        typeAndEnter(certifiedPreownedCarZipCode, text);
    }

    //SELL MENU METHODS: ----------------------------------------------------------------------------------------------------------------------------------
    public void hoverOverSellMenu(WebDriver driver){
        hoverOver(driver, hoverOverSell);
    }

    public void clickCarValuesLink(){
        click(carValuesLink);
    }
}