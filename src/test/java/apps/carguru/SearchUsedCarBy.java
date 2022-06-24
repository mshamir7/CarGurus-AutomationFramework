package apps.carguru;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchUsedCarBy extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(SearchUsedCarBy.class);

    @Test
    public void searchMakeModel() {
        getDriver().get("https://www.carsaver.com");
        getDriver().manage().window().maximize();
        LOG.info("searchMakeModel:" + "\n"+"searchMakeModel Test");
        click(getDriver().findElement(By.xpath("//*[@id='__BVID__42___BV_tab_button__']")));
        LOG.info("used tab clicked");
        waitFor(1);
        selectFromDropdown(getDriver().findElement(By.xpath("//*[@id='__BVID__51']")), "Audi");
        LOG.info("make drop down menu option selected");
        waitFor(2);
        selectFromDropdown(getDriver().findElement(By.xpath("//*[@id='__BVID__52']")), "S5 Coupe");
        LOG.info("model drop down menu option selected");
        click(getDriver().findElement(By.xpath("//*[@id='__BVID__42']/div/div[2]/div[3]/button")));
        LOG.info("search button clicked");
        waitFor(5);
        String text = getElementText(getDriver().findElement(By.xpath("//*[@id='used-listings']/div[1]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div[3]/div[1]/div/div[1]/div[2]")));
        Assert.assertEquals("S5 Coupe Premium Plus", text);
        waitFor(2);
    }

    @Test
    public void searchBodyStyle() {
        waitFor(2);
        getDriver().get("https://www.carsaver.com");
        getDriver().manage().window().maximize();
        LOG.info("searchMakeModel:" + "\n"+"searchBodyStyle Test");
        click(getDriver().findElement(By.xpath("//*[@id='__BVID__42___BV_tab_button__']")));
        LOG.info("used tab clicked");
        click(getDriver().findElement(By.xpath("//*[@id='__BVID__42']/div/div[1]/div/div/div/a[2]/div/div")));
        LOG.info("by body style tab clicked");
        waitFor(1);
        click(getDriver().findElement(By.xpath("//*[normalize-space(text())='Pickup Truck']")));
        LOG.info("pickup truck link clicked");
        waitFor(1);
        click(getDriver().findElement(By.xpath("//*[@id='__BVID__42']/div/div[2]/div[3]/div/button")));
        LOG.info("search button clicked");
    }
}
