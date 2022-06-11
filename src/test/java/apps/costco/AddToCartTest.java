package apps.costco;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends CommonAPI {
    @Test
    public  void addToCart(){

        type("#search-field", "kid book");
        click ("i.co-search-thin");
        String expectedItem = "kid book  | Costco";
        Assert.assertEquals(expectedItem, getPageTitle());
        click("img.img-responsive");
        click("#add-to-cart-btn");

    }
}
