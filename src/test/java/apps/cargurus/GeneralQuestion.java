package apps.cargurus;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.AllCarQuestionsPage;
import pages.cargurus.HomePage;

public class GeneralQuestion extends CommonAPI {

    @Test
    public void generalQuestions(){
        HomePage homePage = new HomePage(getDriver());
        AllCarQuestionsPage allCarQuestionsPage = new AllCarQuestionsPage(getDriver());
        homePage.hoverOverResearchMenu(getDriver());
        homePage.clickResearchMenuGeneralQuestionLink();
        allCarQuestionsPage.clickRecentlyActiveTab();
        String actual = getDriver().findElement(By.xpath("//*[@id='questions-sort-active']")).getText();
        Assert.assertEquals("Recently Active", actual);

    }
}
