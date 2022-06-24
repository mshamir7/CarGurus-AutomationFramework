package apps.carguru;

import base.CommonAPI;
import base.CommonsAPI;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderFunctionalities extends CommonsAPI {

    private final Logger LOG = LoggerFactory.getLogger(HeaderFunctionalities.class);

    @Test
    public void shopNewCar() {
        getDriver().get("https://www.carsaver.com");
        getDriver().manage().window().maximize();
        LOG.info("HeaderFunctionalities:" + "\n"+"shopNewCar Test");
        click(getDriver().findElement(By.xpath("//*[@id='buyDropDownMenu']")));
        LOG.info("buy dropdown menu clicked");
        waitFor(2);
        click(getDriver().findElement(By.xpath("//*[@id='main-navigation']/nav/div/ul/li[1]/div/a[1]")));
        LOG.info("shop new link clicked");
        click(getDriver().findElement(By.cssSelector("button[class = 'btn btn-orange']")));
        LOG.info("payment clicked");
        click(getDriver().findElement(By.cssSelector("i[class = 'icon-sedan-outline']")));
        LOG.info("next button clicked");
    }

    @Test
    public void buildCar(){
        getDriver().get("https://www.carsaver.com");
        getDriver().manage().window().maximize();
        LOG.info("HeaderFunctionalities:" + "\n"+"buildCar Test");
        click(getDriver().findElement(By.xpath("//*[@id='buyDropDownMenu']")));
        LOG.info("buy dropdown menu clicked");
        waitFor(2);
        click(getDriver().findElement(By.xpath("//*[contains(text(), 'Build A Car')]")));
        LOG.info("build a car link clicked");
        selectFromDropdown(getDriver().findElement(By.cssSelector(".custom-select")), "Asian");
        LOG.info("dropdown menu option selected");
        click(getDriver().findElement(By.xpath("//*[@id='shop-by-make']/div[1]/div[1]/div/div/span")));
        LOG.info("make name clicked");
        click(getDriver().findElement(By.xpath("//*[@id='shop-by-make']/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/span[1]")));
        LOG.info("model name clicked");
        waitFor(1);
        click(getDriver().findElement(By.xpath("//*[@id='root']/div[2]/div[2]/div[3]/div/div[2]/div[1]/div/div[1]/div[1]/div[1]")));
        LOG.info("trim clicked");
        click(getDriver().findElement(By.xpath("//*[@id='root']/div[2]/div[2]/div[3]/div/div[2]/div[2]/div/div/div[3]/div/button")));
        LOG.info("build & price button clicked");
        click(getDriver().findElement(By.xpath("//*[@id='root']/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div[3]/div/button")));
        LOG.info("next step | color clicked");
    }
}
