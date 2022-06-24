package apps.cargurus;

import base.CommonAPI;
import org.openqa.selenium.UnhandledAlertException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;
import pages.cargurus.SearchResultPage;
import pages.cargurus.ShoppingForAUsedCarPage;
import utility.ExcelReader;
import utility.Utility;

import java.util.List;

public class SearchMultipleZipcodeExcelSpreadSheet extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(SearchMultipleZipcodeExcelSpreadSheet.class);

    @Test
    public void searchMultipleItemsUsingExcelSpreadSheet() throws UnhandledAlertException {
        LOG.info("searchMultipleItemsUsingExcelSpreadSheet:" + "\n"+"searchMultipleItemsUsingExcelSpreadSheet Test");
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        ShoppingForAUsedCarPage shoppingForAUsedCarPage = new ShoppingForAUsedCarPage(getDriver());
        homePage.clickHeaderBuyBtn();
        shoppingForAUsedCarPage.selectAllMakesDropDownList("Acura");
        shoppingForAUsedCarPage.selectAllModelsDropDownList("ILX");
        shoppingForAUsedCarPage.typeMinPriceTextBox("20000");
        shoppingForAUsedCarPage.typeMaxPriceTextBox("35000");
        shoppingForAUsedCarPage.typeZipCode("11375");
        shoppingForAUsedCarPage.selectRadius("50 mi");
        shoppingForAUsedCarPage.clickSearchBtn();
        searchResultPage.clearUpdateZip();

        ExcelReader excelReader = new ExcelReader(Utility.currentDir + "/Search.xlsx");
        List<String> zipcodes = excelReader.getEntireColumnForGivenHeader("Sheet1", "Zipcodes");
        for (String zipcode : zipcodes) {
            searchResultPage.clearUpdateZip();
            waitFor(3);
            searchResultPage.typeUpdatedZip(zipcode);
            waitFor(2);
            searchResultPage.clickSearchButton();
        }
        Assert.assertEquals("Used Acura ILX for Sale in Jackson Heights, NY - CarGurus", getDriver().getTitle());
    }
}
