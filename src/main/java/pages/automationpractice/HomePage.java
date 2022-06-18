package pages.automationpractice;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;


public class HomePage extends CommonAPI {

    @FindBy(css = "search_query_top")
    private WebElement searchField;

    @FindBy(css = "btn btn-default button-search")
    private WebElement searchBtn;

    @FindBy(css = "sfHover")
    private WebElement floatingMenuWomen;

    @FindBy(css = "login")
    private WebElement signInBtn;

    @FindBy(css = "Contact Us")
    private WebElement contactUsBtn;

    @FindBy(css = "View my shopping cart")
    private WebElement cartBtn;

    @FindBy(css = "newsletter-input")
    private WebElement newsLetterField;

    @FindBy(css = "btn btn-default button button-small")
    private WebElement submitNewsLetterBtn;

    @FindBy(css = "facebook")
    private WebElement followFacebookBtn;

    @FindBy(css = "twitter")
    private WebElement followTwitterBtn;

    @FindBy(css = "youtube")
    private WebElement followYTBtn;

    @FindBy(css = "google-plus")
    private WebElement followGoogleBtn;

    @FindBy(css = "Specials")
    private WebElement specialsBtn;

    @FindBy(css = "New products")
    private WebElement newProdsBtn;

    @FindBy(css = "Best sellers")
    private WebElement bstSellersBtn;

    @FindBy(css = "Our stores")
    private WebElement ourStoresBtn;

    @FindBy(css = "Terms and conditions of use")
    private WebElement termsAndCBtn;

    @FindBy(css = "About us")
    private WebElement abtUsBtn;

    @FindBy(css = "Sitemap")
    private WebElement sitemapBtn;

    @FindBy(css = "My orders")
    private WebElement myOrdersBtn;

    @FindBy(css = "My credit slips")
    private WebElement myCredSlipsBtn;

    @FindBy(css = "My addresses")
    private WebElement myAddressesBtn;

    @FindBy(css = "My personal info")
    private WebElement myPersonalInfoBtn;

    @FindBy(css = "Manage my customer account")
    private WebElement myAccountBtn;

    @FindBy(css = "You will find here all woman fashion collections. This category includes all the basics of your wardrobe and much more: shoes, accessories, printed t-shirts, feminine dresses, women's jeans!")
    private WebElement categoriesWomenBtn;

    public void clickSearchBtn(){
        click(searchBtn);
    }

    public void clickCartBtn(){
        click(cartBtn);
    }



}

