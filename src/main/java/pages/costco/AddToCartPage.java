package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AddToCartPage extends CommonAPI {

    @FindBy(xpath = "//*[@id='cart-d']")
    WebElement cartTab;
    @FindBy(xpath = "//*[@id='empty-cart-id']/div[2]/div/input")
    WebElement continueTab;
    @FindBy(xpath = "//*[@id='search-results']/div[4]/div[1]/div[2]/div[2]/div[2]/div[2]/span/a")
    WebElement addProd;
    @FindBy(xpath = "//*[@id=add-to-cart-btn]")
    WebElement addItemToCart;

    @FindBy(xpath="//*[@id='costcoModalText']/div[2]/div[2]/a/button")
    WebElement viewCart;
    @FindBy(xpath ="//*[@id='shopCartCheckoutSubmitButton']")
    WebElement chkoutTab;
    public AddToCartPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public  void cartAtHomePage(){
        click(cartTab);
    }
    public  void clickcontinueShopping(){
        click(continueTab);
    }
    public void addProductToCart(){
        click(addProd);
    }
    public  void prodAdded(){
        click(addItemToCart);
    }
    public  void viewCartWindow(){
        click(viewCart);
    }
    public void getCheckout(){

        click(chkoutTab);
    }

}
