package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarReviewsAndAdvicePage extends CommonAPI {


    @FindBy(css = "select[class ='k2Xd15 TXStEI']")
    private WebElement chooseACarMakeDropDownList;

    @FindBy(xpath = "//*[@id='root']/div/div/section[1]/form/div[2]/div/select")
    private WebElement chooseACarModelDropDownList;

    @FindBy(xpath = "//*[@id='root']/div/div/section[1]/form/div[3]/div/select")
    private WebElement chooseACarYearDropDownList;

    @FindBy(xpath = "//*[@id='root']/div/div/section[1]/form/a")
    private WebElement researchNewAndUsedCarSearchBtn;



    public CarReviewsAndAdvicePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void selectChooseACarMakeDropDownList(String option){
        selectFromDropdown(chooseACarMakeDropDownList,option );
    }
    public void selectChooseACarModelDropDownList(String option) {
        selectFromDropdown(chooseACarModelDropDownList, option);
    }

    public void selectChooseACarYearDropDownList(String option) {
        selectFromDropdown( chooseACarYearDropDownList, option);
    }

    public void clickResearchNewAndUsedCarSearchBtn(){
        click(researchNewAndUsedCarSearchBtn);
    }


}
