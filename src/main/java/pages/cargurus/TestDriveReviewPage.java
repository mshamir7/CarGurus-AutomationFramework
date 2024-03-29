package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestDriveReviewPage extends CommonAPI {

    @FindBy(xpath = "//*[@id='root']/div[2]/div/div[1]/div[4]/ul/li[2]")
    private WebElement researchNewAndUsedCarUserReviewTab;

    @FindBy(xpath = "//*[@id='root']/div[2]/div/div[1]/div[4]/ul/li[4]")
    private WebElement researchNewAndUsedCarTrimAndSpecsTab;

    @FindBy(xpath = "*[normalize-space(text()='Options')]")
    private WebElement trimsAndSpecsOptionsTab;  //*[@id="trimBody_t95587"]/div[1]/ul/li[2]/a

    @FindBy(xpath = "//*[@id='trimBody_t95587_specs']/div/div[1]/button[2]")
    private WebElement trimsAndSpecsSpecsTab;


    public TestDriveReviewPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void clickResearchNewAndUsedCarUserReviewTab() {
        click(researchNewAndUsedCarUserReviewTab);
    }

    public void clickResearchNewAndUsedCarTrimAndSpecsTab() {
        click(researchNewAndUsedCarTrimAndSpecsTab);
    }

    public void clickTrimsAndSpecsOptionsTab(){
        click(trimsAndSpecsOptionsTab);
    }

    public void clickTrimsAndSpecsSpecsTab(){
        click(trimsAndSpecsSpecsTab);
    }

}
