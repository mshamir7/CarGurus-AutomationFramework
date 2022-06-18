package apps.pagetestcasescosto;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.costco.AddToCartPage;
import pages.costco.HomePage;

import java.net.CookieHandler;

public class AddToCartTest extends CommonAPI {

    @Test
    public void addToCart(){
        HomePage homePage=new HomePage(getDriver());
        AddToCartPage addToCartPage=new AddToCartPage(getDriver());
        addToCartPage.cartAtHomePage();
        addToCartPage.clickcontinueShopping();
        homePage.searchElementAndEnter("kitchen bag");
        waitFor(3);
        addToCartPage.addProductToCart();
        addToCartPage.prodAdded();
        waitFor(3);
        addToCartPage.viewCartWindow();
        addToCartPage.getCheckout();
        String text=addToCartPage.getPageTitle();
        waitFor(3);
        String expected="Shopping Cart | Costco";
        Assert.assertEquals(text,expected);
    }


}
