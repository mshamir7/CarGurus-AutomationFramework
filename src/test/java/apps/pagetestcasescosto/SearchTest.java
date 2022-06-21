package apps.pagetestcasescosto;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.costco.HomePage;
import pages.costco.SearchResultPage;

import java.util.ArrayList;
import java.util.List;

public class SearchTest  extends CommonAPI {

    @Test
    public void waterBottleSearch() {

        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchProduct("water bottle");

        homePage.clickToSearch();
        waitFor(3);
        //<title>water bottle &nbsp;| Costco</title>
        String expectedPageTitle = "water bottle &nbsp;| Costco  ";
        Assert.assertFalse(expectedPageTitle, SearchResultPage.getSearchPageTitle());

    }

    @Test
    public void kitchenBagSearch() {

        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElementAndEnter("kitchen bags");
        homePage.clickToSearch();
        waitFor(3);
        String expectedKitchenPageTitle = "kitchen bags  | Costco";
        Assert.assertTrue(expectedKitchenPageTitle, SearchResultPage.getSearchPageTitle());

    }

    @Test
    public void kirklandItemSearch() {

        HomePage homePage = new HomePage(getDriver());
        homePage.searchProduct("kirkland");
        homePage.clickToSearch();
        waitFor(5);


    }

    public List<String> items() {
        List<String> items = new ArrayList<>();
        items.add("shampoo");
        items.add("honey");
        items.add("laptop");
        items.add("printer");
        return items;
    }

    @Test
    public void searchMultipleItems() {
        HomePage homePage = new HomePage(getDriver());
        for (String item : items()) {
            homePage.searchElementAndEnter(item);
            homePage.clearSearchField();
        }
    }
}