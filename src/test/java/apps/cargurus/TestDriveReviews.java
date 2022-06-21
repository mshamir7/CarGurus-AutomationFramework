package apps.cargurus;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;
import pages.cargurus.ResearchNewAndUsedCarsPage;
import pages.cargurus.TestDriveReviewPage;

public class TestDriveReviews extends CommonAPI {

    @Test
    public void testDriveReviewsOverView() {
        HomePage homePage = new HomePage(getDriver());
        ResearchNewAndUsedCarsPage researchNewandUsedCarsPage = new ResearchNewAndUsedCarsPage(getDriver());
        homePage.hoverOverResearchMenu(getDriver());
        homePage.clickTestDriveReviewsLink();
        researchNewandUsedCarsPage.selectChooseACarMakeDropDownList("Acura");
        researchNewandUsedCarsPage.selectChooseACarModelDropDownList("ILX");
        researchNewandUsedCarsPage.selectChooseACarYearDropDownList("2021");
        researchNewandUsedCarsPage.clickResearchNewAndUsedCarSearchBtn();
        Assert.assertEquals("2021 Acura ILX Test Drive Review - CarGurus", getDriver().getTitle());
    }

    @Test
    public void testDriveReviewsUserReview() {
        HomePage homePage = new HomePage(getDriver());
        ResearchNewAndUsedCarsPage researchNewandUsedCarsPage = new ResearchNewAndUsedCarsPage(getDriver());
        TestDriveReviewPage testDriveReviewPage = new TestDriveReviewPage(getDriver());
        homePage.hoverOverResearchMenu(getDriver());
        homePage.clickTestDriveReviewsLink();
        researchNewandUsedCarsPage.selectChooseACarMakeDropDownList("Acura");
        researchNewandUsedCarsPage.selectChooseACarModelDropDownList("ILX");
        researchNewandUsedCarsPage.selectChooseACarYearDropDownList("2021");
        researchNewandUsedCarsPage.clickResearchNewAndUsedCarSearchBtn();
        testDriveReviewPage.clickResearchNewAndUsedCarUserReviewTab();
        Assert.assertEquals("2021 Acura ILX - User Reviews - CarGurus", getDriver().getTitle());
    }

    @Test
    public void testDriveReviewsTrimAndSpecs() {
        HomePage homePage = new HomePage(getDriver());
        ResearchNewAndUsedCarsPage researchNewandUsedCarsPage = new ResearchNewAndUsedCarsPage(getDriver());
        TestDriveReviewPage testDriveReviewPage = new TestDriveReviewPage(getDriver());
        homePage.hoverOverResearchMenu(getDriver());
        homePage.clickTestDriveReviewsLink();
        researchNewandUsedCarsPage.selectChooseACarMakeDropDownList("Acura");
        researchNewandUsedCarsPage.selectChooseACarModelDropDownList("ILX");
        researchNewandUsedCarsPage.selectChooseACarYearDropDownList("2021");
        researchNewandUsedCarsPage.clickResearchNewAndUsedCarSearchBtn();
        testDriveReviewPage.clickResearchNewAndUsedCarTrimAndSpecsTab();
        String actualTrimAndSpecsTitle = getDriver().findElement(By.xpath("//*[@id='contentBody']/div/div[1]/h1/span")).getText();
        Assert.assertEquals("2021 Acura ILX Trims and Specs", actualTrimAndSpecsTitle);
    }
}
