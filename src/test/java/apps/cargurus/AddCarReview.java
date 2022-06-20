package apps.cargurus;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;
import pages.cargurus.LogInPage;
import pages.cargurus.WriteACarReviewPage;

import java.util.concurrent.TimeUnit;

public class AddCarReview extends CommonAPI {

    @Test
    public void addCarReview(){
        HomePage homePage = new HomePage(getDriver());
        LogInPage login = new LogInPage(getDriver());
        WriteACarReviewPage writeACarReviewPage = new WriteACarReviewPage(getDriver());
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        waitFor(3);
        homePage.clickSignInBtn();
        login.enterEmail("ravenn587@aol.com");
        login.enterEmailNextBtn();
        login.enterPassword("Abcd1234*?");
        login.enterPasswordSignInBtn();
        waitFor(3);
        String actual = homePage.getAccountUserName();
        Assert.assertEquals("RavenN1", actual);
        waitFor(3);
        homePage.clickAddCarReviewBtn();
        writeACarReviewPage.selectMakeDropDownList("Acura");
        writeACarReviewPage.selectModelDropDownList("ILX");
        writeACarReviewPage.selectYearDropDownList("2021");
        writeACarReviewPage.clickStartWritingBtn();
        String actualTitle = getDriver().findElement(By.xpath("//*[@id='cg-reviewCar-form']/div/h1")).getText();
        Assert.assertEquals("Leave a review for 2021 Acura ILX", actualTitle);

    }
}
