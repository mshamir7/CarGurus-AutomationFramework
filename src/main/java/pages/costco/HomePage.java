package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends CommonAPI {


    @FindBy(name = "keyword")
    WebElement searchField;

    @FindBy(xpath = "//*[@id='navigation-dropdown']")
    WebElement menuDropdown;
    @FindBy(css = "#header_sign_in")
    WebElement floatingMenu;
    @FindBy(xpath = "//*[@id=\"navigation-dropdown\"]")
    WebElement menuDropdownOptions;
    @FindBy(xpath = "//*[@id='formcatsearch']/div[2]/button/i")
    WebElement btnClick;

    @FindBy(xpath = "//*[@id='header_sign_in']")
    WebElement signInBtn;

    @FindBy(xpath = "//*[@id='deliveryLocation']/div/div/div[1]/div[1]")
    WebElement setWareHouse;

    @FindBy(xpath = "//*[@id='deliveryLocation']/div/div/div[2]/div")
    WebElement setDeliveryLocation;

    @FindBy(xpath = " //*[@id=' header_order_and_returns']")
    WebElement orderReturnTab;

    @FindBy(xpath = "//*[@id='cart-d']")
    WebElement cartTab;

    @FindBy(xpath = "//*[@id=' warehouse-coupons']")
    WebElement warehouseSavingTab;

    @FindBy(xpath = "//*[@id='email-signup-link']")
    WebElement emailOffersTab;

    @FindBy(xpath = "//*[@id='customer-service-link']")
    WebElement customerServiceTab;
    @FindBy(xpath = "//*[@id='country-select']/span[1]")
    WebElement setCountryTab;

    @FindBy(xpath = "//*[@id='header-selected-language']")
    WebElement languageTab;
    @FindBy(xpath = "//*[@id='next']")
    WebElement btnSignin;

    //constructor
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //reusable steps
    public void searchProduct(String prodname) {
        searchField.sendKeys(prodname);
    }

    public void searchElementAndEnter(String item) {
        typeAndEnter(searchField, item);
    }

    public void selectOptionFromShopMenuDropdown(String option) {
        selectFromDropdown(menuDropdown, option);
    }

    public void hoverOverFloatingMenu(WebDriver driver) {
        hoverOver(driver, floatingMenu);
    }

    public void clearSearchField() {
        clear(searchField);
    }

    public void clickToSearch() {
        click(btnClick);
    }
    public void currentWarehouse () {
        setWareHouse.click();
    }
    public void setDeliveryAddress () {

        setDeliveryLocation.click();
    }
    public  void clickSignIn()
    {
        btnSignin.click();

    }
    public void findOrderAndReturn ()
    {

        orderReturnTab.click();

    }
    public void getWareHouseSavings ()
    {
        warehouseSavingTab.click();
    }
    public void getEmailOffers ()
    {
        emailOffersTab.click();
    }
    public void getCustmrService ()
    {
        customerServiceTab.click();
    }
    public void cartToCheck ()
    {
        cartTab.click();
    }
    public void selectCountry ()
    {
        setCountryTab.click();
    }
    public void selectLanguage ()
    {
        languageTab.click();
    }
    public List<String> getHomePageDropdownOptions() {
        List<String> options = new ArrayList<>();
        List<WebElement> elements = getDropDownOptions(menuDropdown);

        {
            for (WebElement element : elements) {
                options.add(element.getText());
            }
        }
        return options;
    }

    public void selectOptionFromShopMenuDropdownWithSelectOptions(String options){
        List<WebElement> elementshop = getDropDownOptions(menuDropdown);
        for (WebElement element:elementshop) {
            if (element.getText().equalsIgnoreCase(options)){
                element.click();
            }
        }
    }

    public void selectOptionFromShopMenuDropdownWithGivenText(String options){
        List <WebElement> elements = (List<WebElement>) menuDropdownOptions;
        for (WebElement element :elements) {
            if (element.getText().equalsIgnoreCase(options)){
                element.click();
            }
        }
    }

    }





