package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(HomePage.class);

    @FindBy(css = ".navTitle")
    private WebElement signInBtn;


    @FindBy(xpath = "//*[@id='authLink']")
    private WebElement signOutProfileDropDown;

    @FindBy(xpath = "//*[@id='account-menu-username']")
    private WebElement accountUserName;

    @FindBy(xpath = "//body/div[1]/nav[1]/div[1]/ul[2]/li[1]/div[1]/span[1]/a[1]/*[1]")
    private WebElement addCarReviewBtn;

    @FindBy(xpath = "//body/main[@id='main']/div[2]/div[3]/div[2]/div[1]/section[1]/div[2]/div[2]/a[1]/div[1]/div[1]/img[1]")
    private WebElement recommendedForYouListing;

    @FindBy(xpath = "//body/main[@id='main']/div[2]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    private WebElement recentActivityListing;

    @FindBy(xpath = "//body/main[@id='main']/div[2]/div[3]/div[4]/div[1]/section[1]/div[2]/div[1]/a[1]/div[1]/div[1]/img[1]")
    private WebElement recentPriceDropsListing;

    @FindBy(xpath = "//body/main[@id='main']/div[2]/div[3]/div[4]/div[1]/section[1]/div[2]/div[1]/a[1]/div[1]/div[1]/img[1]")
    private WebElement modelsYouMayLike;

    @FindBy(xpath = "//div[contains(text(),'Family friendly')]")
    private WebElement familyFriendlyBtn;





    //USED CAR OBJECTS: -------------------------------------------------------------------------------------------------------------------------------------

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
    private WebElement newCarByPriceTabLink;

    @FindBy(xpath = "//*[@id='dealFinderFormPriceNew']/fieldset/div/div[1]/select")
    private WebElement newCarByPriceDropDownListMin;

    @FindBy(xpath = "//*[@id='dealFinderFormPriceNew']/fieldset/div/div[2]/select")
    private WebElement newCarByPriceDropDownListMax;

    @FindBy(css = "#dealFinderZipUsedId_dealFinderFormPriceNew")
    private WebElement newCarByPriceZipCode;

    @FindBy(xpath = "//*[text()='Certified Pre-Owned']")
    private WebElement certifiedPreownedCarTab;

    @FindBy(xpath = "//*[@id='carPickerCpo_makerSelect']" )
    private WebElement certifiedPreownedCarAllMakesDropDownList;

    @FindBy(xpath = "//*[@id='carPickerCpo_modelSelect']")
    private WebElement certifiedPreownedCarAllModelsDropDownList;

    @FindBy(css = "#dealFinderZipCPOId")
    private WebElement certifiedPreownedCarZipCode;


    //SELL MENU OBJECTS: --------------------------------------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//*[text()='Sell']")
    private WebElement hoverOverSell;

    @FindBy(xpath = "//*[@id='headerNav']/div/ul[1]/li[2]/div/div/div[2]/ul/li[2]/a/span")
    private WebElement carValuesLink;

    @FindBy(xpath = "//*[@id='headerNav']/div/ul[1]/li[2]/div/div/div[2]/ul/li[1]/a/span")
    private WebElement sellMyCarLink;

    @FindBy(xpath = "//*[@id='headerNav']/div/ul[1]/li[2]/div/div/div[2]/ul/li[3]/a/span")
    private WebElement sellMyCarFAQLink;

    @FindBy(xpath = "//*[@id='headerNav']/div/ul[1]/li[2]/div/div/div[3]/ul/li/a/span")
    private WebElement dealerSignUpLink;




    //RESEARCH MENU OBJECTS: ----------------------------------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//*[text()='Research']")
    private WebElement hoverOverResearchMenu;

    @FindBy(xpath = "//*[@id='headerNav']/div/ul[1]/li[4]/div/div/div[4]/ul/li[1]/a/span")
    private WebElement testDriveReviewsLink;

    @FindBy(xpath = "//*[@id='headerNav']/div/ul[1]/li[4]/div/div/div[5]/ul/li/a/span")
    private WebElement generalQuestionsLink;

    @FindBy(xpath = "//*[@id='headerNav']/div/ul[1]/li[4]/div/div/div[4]/ul/li[2]/a/span")
    private WebElement researchMenuPriceTrendsLink;


    //BUY MENU OBJECTS: ----------------------------------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//*[@id='wai_snm_cnl_buy']/span")
    private WebElement clickHeaderBuyBtn;

    @FindBy(xpath = "//*[@id='wai_snm_cnl_buy']/span")
    private WebElement hoverOverBuyMenu;

    @FindBy(xpath = "//*[@id='headerNav']/div/ul[1]/li[1]/div/div/div[2]/ul/li[1]/a/span")
    private WebElement buyMenuDealershipNearMeLink;

    @FindBy(xpath = "//span[contains(text(),'Delivery')]")
    private WebElement deliveryLink;

    @FindBy(xpath = "//*[@id='headerNav']/div/ul[1]/li[1]/div/div/div[1]/ul/li[2]/a/span")
    private WebElement newCarLink;

    @FindBy(xpath = "//*[@id='headerNav']/div/ul[1]/li[1]/div/div/div[1]/ul/li[3]/a/span")
    private WebElement certifiedCarLink;

    @FindBy(xpath = "//*[@id='headerNav']/div/ul[1]/li[1]/div/div/div[1]/ul/li[3]/a/span")
    private WebElement buyingACarDuringCoronaVirusFAQLink;




    //FINANCE MENU OBJECTS: --------------------------------------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//span[contains(text(),'Finance')]")
    private WebElement clickHeaderFinanceBtn;

    @FindBy(xpath = "//span[contains(text(),'Prequalify for Financing')]")
    private WebElement preQualifyForFinancingLink;

    @FindBy(xpath = "//*[@id='headerNav']/div/ul[1]/li[3]/div/div/div[3]/ul/li[3]/a/span")
    private WebElement financeFAQLink;

    @FindBy(xpath = "//*[@id='headerNav']/div/ul[1]/li[3]/div/div/div[4]/ul/li/a/span")
    private WebElement loanCalculatorLink;




    //PROFILE DROPDOWN LIST OBJECTS: -----------------------------------------------------------------------------------------------------------------------------

    @FindBy(css = "#account-menu-control")
    private WebElement profileMenuDropDown;

    @FindBy(xpath = "//*[@id='account-menu-content']/ul/li[4]/a")
    private WebElement recommendedCarsProfileDropDownOption;



    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void clickSignInBtn() {
        click(signInBtn);
        LOG.info("sign in button clicked");
    }

    public void signOutProfileUsingDropDown() {
        click(signOutProfileDropDown);
        LOG.info("Clicked Profile DropDown");
    }

    public String getAccountUserName() {
        LOG.info("Get Account username success");
        return getElementText(accountUserName);
    }

    public void clickAddCarReviewBtn(){
        click(addCarReviewBtn);
        LOG.info("add car review button clicked");
    }

    public void clickRecommendedForYouListing(){
        click(recommendedForYouListing);
        LOG.info("recommended for you listing clicked");
    }

    public void clickRecentActivityListing(){
        click(recentActivityListing);
        LOG.info("recent activity listing clicked");
    }

    public void clickRecentPriceDropsListing(){
        click(recentPriceDropsListing);
        LOG.info("recent price drop listing clicked");
    }

    public void clickModelsYouMayLike(){
        click(modelsYouMayLike);
        LOG.info("models you may like clicked");
    }

    public void clickFamilyFriendlyTrendingSearch(){
        click(familyFriendlyBtn);
        LOG.info("family friend trending search clicked");
    }




    //USED CAR METHODS: --------------------------------------------------------------------------------------------------------------------------------------

    public void selectUsedCarMakeDropDownList(String option) {
        selectFromDropdown(usedCarMakeDropdownListOption, option);
        LOG.info("used car dropdown list option selected");
    }

    public void selectUsedCarModelDropDownList(String option) {
        selectFromDropdown(usedCarModelDropdownListOption, option);
        LOG.info("used car model dropdown list option selected");
    }

    public void typeUsedCarMakeModelZipCode(String zipcode) {
        type(usedCarMakeModelZip, zipcode);
        LOG.info("type used car make model Zipcode");
    }

    public void clickUsedCarMakeModelSearchBtn() {
        click(usedCarMakeModelSearchBtn);
        LOG.info("search button clicked");
    }

    public void clickUsedCarByBodyStyle() {
        click(usedCarByBodyStyleTabLink);
        LOG.info("used car by body style link clicked");
    }

    public void clickUsedCarByBodyStyleSedanOption() {
        click(usedCarByBodyStyleSedanOption);
        LOG.info("By body style sedan option clicked");
    }

    public void clickUsedCarByBodyStyleSearchBtn() {
        click(usedCarByBodyStyleSearchButton);
        LOG.info("search button clicked");
    }

    public void typeByBodyStyleZipCode(String zipcode) {
        type(usedCarByBodyStyleZipCode, zipcode);
        LOG.info("type by body style zipcode");
    }

    public void clickUsedCarByPriceTabLink() {
        click(usedCarByPriceTabLink);
        LOG.info("used car by price tab clicked");
    }

    public void selectUsedCarByPriceDropdownListMin(String option) {
        selectFromDropdown(usedCarByPriceDropdownListMin, option);
        LOG.info("used car by Min price dropdown list option selected");
    }

    public void selectUsedCarByPriceDropdownListMax(String option) {
        selectFromDropdown(usedCarByPriceDropdownListMax, option);
        LOG.info("used car by Max price dropdown list option selected");
    }

    public void typeUsedCarByPriceZipCode(String zipcode) {
        type(usedCarByPriceZip, zipcode);
        LOG.info("type used car by price zipcode");
    }

    public void clickUsedCarPriceSearchButton() {
        click(usedCarByPriceSearchButton);
        LOG.info("search button clicked");
    }

    //NEW CAR METHODS: ---------------------------------------------------------------------------------------------------------------------------------------

    public void clickNewCarTab() {
        click(newCarTab);
        LOG.info("new car tab clicked");
    }

    public void selectNewCarByMakeModelMakeDropDownList(String option) {
        selectFromDropdown(newCarByMakeModelMakeDropDownList, option);
        LOG.info("new car by make model dropdown list option selected");
    }

    public void selectNewCarByMakeModelModelDropDownList(String option) {
        selectFromDropdown(newCarByMakeModelModelDropDownList, option);
        LOG.info("new car by make model drop down list option selected");
    }

    public void typeNewCarMakeModelZipcode(String text) {
        type(newCarMakeModelZipcode, text);
        LOG.info("type new car make model Zipcode");
    }

    public void clickNewCarMakeModelSearchBtn() {
        click(newCarMakeModelSearchBtn);
        LOG.info("search button clicked");
    }

    public void clickNewCarByBodyStyleTabLink() {
        click(newCarByBodyStyleTabLink);
        LOG.info("new car by body style tab clicked");
    }

    public void clickNewCarByBodyStylePickupTruckOption() {
        click(newCarByBodyStylePickupTruckOption);
        LOG.info("new car by body style pickup truck option clicked");
    }

    public void typeNewCarByBodyStyleZipCode(String text) {
        typeAndEnter(newCarByBodyStyleZipCode, text);
        LOG.info("new car by body style Zipcode clicked");
    }

    public void clickNewCarByPriceTabLink(){
        click(newCarByPriceTabLink);
        LOG.info("new car by price tab clicked");
    }

    public void selectNewCarByPriceDropDownListMin(String option){
        selectFromDropdown(newCarByPriceDropDownListMin, option);
        LOG.info("new car by Min price dropdown list option selected");
    }

    public void selectNewCarByPriceDropDownListMax(String option){
        selectFromDropdown(newCarByPriceDropDownListMax, option);
        LOG.info("new car by Max price drop down list option selected");
    }

    public void typeNewCarByPriceZipCode(String text){
        typeAndEnter(newCarByPriceZipCode, text);
        LOG.info("type new car by price Zipcode");
    }

    public void clickCertifiedPreownedCarTab(){
        click(certifiedPreownedCarTab);
        LOG.info("certified preowned car tab clicked");
    }

    public void selectCertifiedPreownedCarAllMakesDropDownList(String option){
        selectFromDropdown(certifiedPreownedCarAllMakesDropDownList, option);
        LOG.info("Certified Preowned Car All Makes DropDown List option selected");
    }

    public void selectCertifiedPreownedCarAllModelsDropDownList(String option){
        selectFromDropdown(certifiedPreownedCarAllModelsDropDownList, option);
        LOG.info("Certified Preowned Car All Models DropDown List option selected");
    }

    public void typeCertifiedPreownedCarZipCode(String text){
        typeAndEnter(certifiedPreownedCarZipCode, text);
        LOG.info("type Certified Preowned Car ZipCode");
    }

    //SELL MENU METHODS: ------------------------------------------------------------------------------------------------------------------------------------
    public void hoverOverSellMenu(WebDriver driver){
        hoverOver(driver, hoverOverSell);
        LOG.info("hovered over sell menu");
    }

    public void clickCarValuesLink(){
        click(carValuesLink);
        LOG.info("car values link clicked");
    }

    public void clickSellMyCarLink(){
        click(sellMyCarLink);
        LOG.info("sell my car link clicked");
    }

    public void clickSellMyCarFAQLink(){
        click(sellMyCarFAQLink);
        LOG.info("sell my car FAQ link clicked");
    }

    public void clickDealerSignUpLink(){
        click(dealerSignUpLink);
        LOG.info("dealer sign up link clicked");
    }



    //RESEARCH MENU METHODS: ----------------------------------------------------------------------------------------------------------------------------------

    public void hoverOverResearchMenu(WebDriver driver){
        hoverOver(driver, hoverOverResearchMenu);
        LOG.info("hovered over research menu");
    }

    public void clickTestDriveReviewsLink() {
        click(testDriveReviewsLink);
        LOG.info("test drive reviews link clicked");
    }

    public void clickResearchMenuGeneralQuestionLink(){
        click(generalQuestionsLink);
        LOG.info("Research Menu General Question Link clicked");
    }

    public void clickResearchMenuPriceTrendsLink(){
        click(researchMenuPriceTrendsLink);
        LOG.info("Research Menu Price Trends Link clicked");
    }

    //BUY MENU METHODS: ----------------------------------------------------------------------------------------------------------------------------------

    public void hoverOverBuyMenu(WebDriver driver){
        hoverOver(driver, hoverOverBuyMenu);
        LOG.info("hovered over buy menu");
    }

    public void clickBuyMenuDealershipNearMeLink(){
        click(buyMenuDealershipNearMeLink);
        LOG.info("Buy Menu Dealership Near Me Link clicked");
    }

    public void clickHeaderBuyBtn(){
        click(clickHeaderBuyBtn);
        LOG.info("header buy button clicked");
    }

    public void clickDeliveryLink(){
        click(deliveryLink);
        LOG.info("Deliver Link clicked");
    }

    public void clickNewCarLink(){
        click(newCarLink);
        LOG.info("new car link clicked");
    }

    public void clickCertifiedCarLink(){
        click(certifiedCarLink);
        LOG.info("certified car link clicked");
    }

    public void clickBuyingACarDuringCoronaVirusFAQLink(){
        click(buyingACarDuringCoronaVirusFAQLink);
        LOG.info("Buying A Car During Corona Virus FAQ Link clicked");
    }



    //FINANCE MENU METHODS: ---------------------------------------------------------------------------------------------------------------------------------

    public void hoverOverHeaderFinanceBtn(WebDriver driver){
        hoverOver(driver, clickHeaderFinanceBtn);
        LOG.info("hovered over header finance button");
    }

    public void clickPreQualifyForFinancingLink(){
        click(preQualifyForFinancingLink);
        LOG.info("Pre Qualify For Financing Link clicked");
    }

    public void clickFinanceFAQLink(){
        click(financeFAQLink);
        LOG.info("finance FAQ link clicked");
    }

    public void clickLoanCalculatorLink(){
        click(loanCalculatorLink);
        LOG.info("loan calculator link clicked");
    }



    //PROFILE DROPDOWN LIST METHODS: ------------------------------------------------------------------------------------------------------------------------

    public void clickProfileMenuDropDown() {
        click(profileMenuDropDown);
        LOG.info("profile menu dropdown clicked");
    }
    public void clickRecommendedCarsProfileDropDownOption() {
        click(recommendedCarsProfileDropDownOption);
        LOG.info("Recommended Car sProfile DropDown Option clicked");
    }
}
