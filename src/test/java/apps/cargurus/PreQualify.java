package apps.cargurus;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.FinanceInAdvancePage;
import pages.cargurus.HomePage;

public class PreQualify extends CommonAPI {

    @Test
    public void preQualify(){
        HomePage homePage = new HomePage(getDriver());
        FinanceInAdvancePage financeInAdvancePage = new FinanceInAdvancePage(getDriver());
        homePage.hoverOverHeaderFinanceBtn(getDriver());
        homePage.clickPreQualifyForFinancingLink();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView", getDriver().findElement(By.xpath("//h2[contains(text(),'Finance in advance')]")));
        financeInAdvancePage.typeVehiclePrice("25000");
        financeInAdvancePage.typeDownPayment("5000");
        financeInAdvancePage.clickCreditScoreBtn();     //GOOD 700-749
        financeInAdvancePage.clickLoanTermBtn();        //60mo
        Assert.assertTrue(getDriver().findElement(By.xpath("//body/div[@id='wrapper']/main[@id='content']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/button[1]/div[1]/span[1]")).isDisplayed());

    }
}
