package apps.automationpractice;

import base.CommonAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends CommonAPI {

    @Test

    public void test1() {
        type("search_query_top", "shirt");
        click("btn btn-default button-search");
        String expectedSearchTitle = "Search - My Store";
        Assert.assertEquals(expectedSearchTitle, getPageTitle());

    }

    @Test

    public void test2() {

        typeAndEnter("search_query_top", "blouse");
        String expectedSearchTitle1 = "Blouse - My Store";
        Assert.assertEquals(expectedSearchTitle1, getPageTitle());



    }


}
