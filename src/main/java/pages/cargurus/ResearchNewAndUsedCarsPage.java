package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResearchNewAndUsedCarsPage extends CommonAPI {


    @FindBy(css = "#researchTabCarSelector_entitySelectingHelper_selectedEntity_makerSelect")
    private WebElement chooseACarMakeDropDownList;

    @FindBy(css = "#researchTabCarSelector_entitySelectingHelper_selectedEntity_modelSelect")
    private WebElement chooseACarModelDropDownList;

    @FindBy(css = "#researchTabCarSelector_entitySelectingHelper_selectedEntity_year1Select")
    private WebElement chooseACarYearDropDownList;

    @FindBy(xpath = "//*[@id='researchTabCarSelector']/div/div[2]/input")
    private WebElement researchNewAndUsedCarSearchBtn;



    public ResearchNewAndUsedCarsPage(WebDriver driver){
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
