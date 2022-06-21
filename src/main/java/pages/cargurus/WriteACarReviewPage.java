package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WriteACarReviewPage extends CommonAPI {

    @FindBy(css = "#selectMaker")
    private WebElement makeDropDownList;

    @FindBy(css = "#selectModel")
    private WebElement modelDropDownList;

    @FindBy(css = "#selectYear")
    private WebElement yearDropDownList;

    @FindBy(xpath = "//*[@id='root']/div/div/a")
    private WebElement startWritingBtn;


    public WriteACarReviewPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void selectMakeDropDownList(String option){
        selectFromDropdown(makeDropDownList, option);
    }

    public void selectModelDropDownList(String option) {
        selectFromDropdown(modelDropDownList, option);
    }

    public void selectYearDropDownList(String option) {
        selectFromDropdown(yearDropDownList, option);
    }

    public void clickStartWritingBtn(){
        click(startWritingBtn);
    }
}
