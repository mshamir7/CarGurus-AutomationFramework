package apps.carguru;

import apps.cargurus.Login;
import base.CommonsAPI;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.testng.annotations.Test;

public class FilterSearchResult extends CommonsAPI {

    private final Logger LOG = LoggerFactory.getLogger(FilterSearchResult.class);

    @Test
    public void searchFilters(){
        getDriver().get("https://www.carsaver.com");
        getDriver().manage().window().maximize();
        LOG.info("FilterSearchResult:" + "\n"+"searchFilters Test");
        click(getDriver().findElement(By.xpath("//*[@id='buyDropDownMenu']")));
        waitFor(3);
        LOG.info("buy dropdown menu clicked");
        waitFor(1);
        click(getDriver().findElement(By.xpath("//*[@id='main-navigation']/nav/div/ul/li[1]/div/a[2]")));
        LOG.info("shop new link clicked");
        click(getDriver().findElement(By.xpath("//*[@id='shop-by']/div[3]/div/div/div/div[1]/div/div[1]/a/div/i")));
        LOG.info("body style clicked");
        click(getDriver().findElement(By.xpath("//*[@id='sedan']/div")));
        LOG.info("sedan clicked");
        click(getDriver().findElement(By.xpath("//*[@id='shop-by-price']/div[2]/div/div[2]/button")));
        LOG.info("next button clicked");
        waitFor(2);
        click(getDriver().findElement(By.xpath("//*[@id='facets']/div[9]/div[1]/div/a/span")));
        LOG.info("next button clicked");
        waitFor(5);
        click(getDriver().findElement(By.cssSelector("label[for= '__BVID__446']")));
        LOG.info("engine type: 10 Cylinders clicked");
        waitFor(5);
    }
}