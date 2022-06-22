package apps.cargurus;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;
import pages.cargurus.CarReviewsAndAdvicePage;
import pages.cargurus.TestDriveReviewPage;

public class TestDriveReviews extends CommonAPI {

    @Test
    public void testDriveReviewsOverView() {
        HomePage homePage = new HomePage(getDriver());
        CarReviewsAndAdvicePage carReviewsAndAdvicePage = new CarReviewsAndAdvicePage(getDriver());
        homePage.hoverOverResearchMenu(getDriver());
        homePage.clickTestDriveReviewsLink();
        carReviewsAndAdvicePage.selectChooseACarMakeDropDownList("Acura");
        carReviewsAndAdvicePage.selectChooseACarModelDropDownList("ILX");
        carReviewsAndAdvicePage.selectChooseACarYearDropDownList("2021");
        carReviewsAndAdvicePage.clickResearchNewAndUsedCarSearchBtn();
        Assert.assertEquals("2021 Acura ILX Test Drive Review - CarGurus", getDriver().getTitle());
    }

    @Test
    public void testDriveReviewsUserReview() {
        HomePage homePage = new HomePage(getDriver());
        CarReviewsAndAdvicePage carReviewsAndAdvicePage = new CarReviewsAndAdvicePage(getDriver());
        TestDriveReviewPage testDriveReviewPage = new TestDriveReviewPage(getDriver());
        homePage.hoverOverResearchMenu(getDriver());
        homePage.clickTestDriveReviewsLink();
        carReviewsAndAdvicePage.selectChooseACarMakeDropDownList("Acura");
        carReviewsAndAdvicePage.selectChooseACarModelDropDownList("ILX");
        carReviewsAndAdvicePage.selectChooseACarYearDropDownList("2021");
        carReviewsAndAdvicePage.clickResearchNewAndUsedCarSearchBtn();
        testDriveReviewPage.clickResearchNewAndUsedCarUserReviewTab();
        Assert.assertEquals("User reviews for 2021 Acura ILX", getDriver().findElement(By.xpath("//*[@id='seoTabGroup-panel-0']/div/section/div[1]/h2")).getText());
    }

    @Test
    public void testDriveReviewsTrimAndSpecs() {
        HomePage homePage = new HomePage(getDriver());
        CarReviewsAndAdvicePage carReviewsAndAdvicePage = new CarReviewsAndAdvicePage(getDriver());
        TestDriveReviewPage testDriveReviewPage = new TestDriveReviewPage(getDriver());
        homePage.hoverOverResearchMenu(getDriver());
        homePage.clickTestDriveReviewsLink();
        carReviewsAndAdvicePage.selectChooseACarMakeDropDownList("Acura");
        carReviewsAndAdvicePage.selectChooseACarModelDropDownList("ILX");
        carReviewsAndAdvicePage.selectChooseACarYearDropDownList("2021");
        carReviewsAndAdvicePage.clickResearchNewAndUsedCarSearchBtn();
        testDriveReviewPage.clickResearchNewAndUsedCarTrimAndSpecsTab();
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id='root']/div[2]/div/div[1]/div[4]/div")).isDisplayed());
    }
}
