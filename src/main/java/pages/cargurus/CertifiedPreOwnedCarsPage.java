package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class CertifiedPreOwnedCarsPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CertifiedPreOwnedCarsPage.class);

    @FindBy(xpath = "//*[@id='root']/div/section[5]/h6")
    private WebElement scrollIntoView;



    public CertifiedPreOwnedCarsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void scrollIntoView(){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)", getDriver().findElement(By.xpath("//*[@id='root']/div/section[5]/h6")));
        LOG.info("scrolled into view");
    }

    public void assertByBodyStyleSedan(){
        Assert.assertEquals("Sedan",getDriver().findElement(By.xpath("//body/main[@id='root']/div[1]/section[4]/ul[1]/li[1]/a[1]/div[1]/p[1]")).getText());
        LOG.info("assert offer process is displayed");
    }
}
