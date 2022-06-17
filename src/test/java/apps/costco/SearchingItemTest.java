package apps.costco;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchingItemTest extends CommonAPI {

    @Test
    public void searchItem(){
        type("#search-field", "kid book");
        click("i.co-search-thin");
        String expectedProduct= "kid book  | Costco";
        Assert.assertEquals(expectedProduct, getPageTitle());
    /*type("//input [@ id='search-field']", "kid book");
    click("//i[@classes= 'co-search-thin']");
    String expectedProduct= "kid book  | Costco";
    Assert.assertEquals(expectedProduct, getPageTitle());
    waitFor(5);
    /*by css
    type("input #search-field", "kid book");
    click("i.co-search-thin");
    String expectedProduct= "kid book  | Costco";
    Assert.assertEquals(expectedProduct, getPageTitle());*/

    /*
    type("#search-field", "kid book");
    click("#searchWidgetButton");
    String expectedProduct= "kid book  | Costco";
    Assert.assertEquals(expectedProduct, getPageTitle());*/

}


}
