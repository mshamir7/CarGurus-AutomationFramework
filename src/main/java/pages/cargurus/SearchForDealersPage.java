package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchForDealersPage extends CommonAPI {

    @FindBy(css = "#addressTyped")
    private WebElement locationTextBox;

    @FindBy(css = "#refine-search-distance")
    private WebElement distanceDropDownList;

    @FindBy(css = "#refine-search-make")
    private WebElement dealershipDropDownList;

    @FindBy(xpath = "//*[@id='root']/div/form/button")
    private WebElement searchDealershipSearchBtn;

    public SearchForDealersPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void typeLocationTextBox(String text){
        type(locationTextBox, text);
    }
    public void selectDistanceDropDownList(String option){
        selectFromDropdown(distanceDropDownList, option);
    }
    public void selectDealershipDropDownList(String option) {
        selectFromDropdown(dealershipDropDownList, option);
    }

    public void clickSearchDealershipSearchBtn(){
        click(searchDealershipSearchBtn);
    }
}
