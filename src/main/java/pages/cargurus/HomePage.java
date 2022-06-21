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

    @FindBy(xpath = "//*[text()='Test Drive Reviews']")
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
        LOG.info("Clicked Sign In Button");
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
    }

    public void clickRecommendedForYouListing(){
        click(recommendedForYouListing);
    }

    public void clickRecentActivityListing(){
        click(recentActivityListing);
    }

    public void clickRecentPriceDropsListing(){
        click(recentPriceDropsListing);
    }

    public void clickModelsYouMayLike(){
        click(modelsYouMayLike);
    }

    public void clickFamilyFriendlyTrendingSearch(){
        click(familyFriendlyBtn);
    }




    //USED CAR METHODS: --------------------------------------------------------------------------------------------------------------------------------------

    public void selectUsedCarMakeDropDownList(String option) {
        selectFromDropdown(usedCarMakeDropdownListOption, option);
    }

    public void selectUsedCarModelDropDownList(String option) {
        selectFromDropdown(usedCarModelDropdownListOption, option);
    }

    public void typeUsedCarMakeModelZipCode(String zipcode) {
        type(usedCarMakeModelZip, zipcode);
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

    //SELL MENU METHODS: ------------------------------------------------------------------------------------------------------------------------------------
    public void hoverOverSellMenu(WebDriver driver){
        hoverOver(driver, hoverOverSell);
    }

    public void clickCarValuesLink(){
        click(carValuesLink);
    }

    public void clickSellMyCarLink(){
        click(sellMyCarLink);
    }

    public void clickSellMyCarFAQLink(){
        click(sellMyCarFAQLink);
    }

    public void clickDealerSignUpLink(){
        click(dealerSignUpLink);
    }



    //RESEARCH MENU METHODS: ----------------------------------------------------------------------------------------------------------------------------------

    public void hoverOverResearchMenu(WebDriver driver){
        hoverOver(driver, hoverOverResearchMenu);
    }

    public void clickTestDriveReviewsLink() {
        click(testDriveReviewsLink);
    }

    public void clickResearchMenuGeneralQuestionLink(){
        click(generalQuestionsLink);
    }

    public void clickResearchMenuPriceTrendsLink(){
        click(researchMenuPriceTrendsLink);
    }

    //BUY MENU METHODS: ----------------------------------------------------------------------------------------------------------------------------------

    public void hoverOverBuyMenu(WebDriver driver){
        hoverOver(driver, hoverOverBuyMenu);
    }

    public void clickBuyMenuDealershipNearMeLink(){
        click(buyMenuDealershipNearMeLink);
    }

    public void clickHeaderBuyBtn(){
        click(clickHeaderBuyBtn);
    }

    public void clickDeliveryLink(){
        click(deliveryLink);
    }

    public void clickNewCarLink(){
        click(newCarLink);
    }

    public void clickCertifiedCarLink(){
        click(certifiedCarLink);
    }

    public void clickBuyingACarDuringCoronaVirusFAQLink(){
        click(buyingACarDuringCoronaVirusFAQLink);
    }



    //FINANCE MENU METHODS: ---------------------------------------------------------------------------------------------------------------------------------

    public void hoverOverHeaderFinanceBtn(WebDriver driver){
        hoverOver(driver, clickHeaderFinanceBtn);
    }

    public void clickPreQualifyForFinancingLink(){
        click(preQualifyForFinancingLink);
    }

    public void clickFinanceFAQLink(){
        click(financeFAQLink);
    }

    public void clickLoanCalculatorLink(){
        click(loanCalculatorLink);
    }



    //PROFILE DROPDOWN LIST METHODS: ------------------------------------------------------------------------------------------------------------------------

    public void clickProfileMenuDropDown() {
        click(profileMenuDropDown);
    }
    public void clickRecommendedCarsProfileDropDownOption() {
        click(recommendedCarsProfileDropDownOption);
    }


}
