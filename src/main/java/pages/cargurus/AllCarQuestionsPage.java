package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllCarQuestionsPage extends CommonAPI {

    @FindBy(css = "#questions-sort-active")
    private WebElement recentlyActiveTab;

    public AllCarQuestionsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickRecentlyActiveTab(){
        click(recentlyActiveTab);
    }

}
