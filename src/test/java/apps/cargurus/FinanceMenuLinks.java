package apps.cargurus;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;

public class FinanceMenuLinks extends CommonAPI {
    @Test
    public void financeFAQ() {
        HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverHeaderFinanceBtn(getDriver());
        homePage.clickFinanceFAQLink();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", getDriver().findElement(By.xpath("//*[@id='content']/div/div[2]/div[5]/div/section/header/h2")));
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id='content']/div/div[2]/div[5]/div/section/header/h2")).isDisplayed());
    }

    @Test
    public void LoanCalculator() {
        HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverHeaderFinanceBtn(getDriver());
        homePage.clickLoanCalculatorLink();
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id='app']/div[1]/h1")).isDisplayed());
    }
}
