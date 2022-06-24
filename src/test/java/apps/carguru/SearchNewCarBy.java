package apps.carguru;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchNewCarBy extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(SearchNewCarBy.class);

    @Test
    public void searchMakeModel() {
        getDriver().get("https://www.carsaver.com");
        getDriver().manage().window().maximize();
        LOG.info("SearchNewCarBy:" + "\n" + "searchMakeModel Test");
        selectFromDropdown(getDriver().findElement(By.xpath("//*[@id='__BVID__37']")), "Acura");
        LOG.info("make dropdown list option selected");
        waitFor(1);
        selectFromDropdown(getDriver().findElement(By.xpath("//*[@id='__BVID__38']")), "ILX");
        LOG.info("model dropdown list option selected");
        click(getDriver().findElement(By.xpath("//*[@id='__BVID__28']/div/div[2]/div[3]/button")));
        LOG.info("search button clicked");
        waitFor(3);
        String text = getElementText(getDriver().findElement(By.xpath("//*[@id='root']/div[2]/div[2]/div[3]/div/div[2]/div[2]/div/div/h1")));
        Assert.assertEquals("2022 Acura ILX", text);
        waitFor(2);
    }

    @Test
    public void searchBodyStyle() {
        waitFor(2);
        getDriver().get("https://www.carsaver.com");
        getDriver().manage().window().maximize();
        LOG.info("SearchNewCarBy:" + "\n" + "searchBodyStyle Test");
        click(getDriver().findElement(By.xpath("//*[@id='__BVID__28']/div/div[1]/div/div/div/a[2]/div/div")));
        LOG.info("body style tab clicked");
        waitFor(1);
        click(getDriver().findElement(By.xpath("//*[@id='__BVID__28']/div/div[2]/div[1]/div[2]/div/div/div[2]")));
        LOG.info("SUVs/Crossovers link clicked");
        click(getDriver().findElement(By.xpath("//*[@id='__BVID__28']/div/div[2]/div[3]/div/button")));
        LOG.info("search button clicked");
        waitFor(2);
        //String actualPageText = getElementText(getDriver().findElement(By.xpath("//*[@id='used-listings']/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]")));
    }
}

