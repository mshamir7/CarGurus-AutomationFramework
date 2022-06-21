package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsedCarPriceTrendsPage extends CommonAPI {

    @FindBy(css = "#startDate")
    private WebElement startDateTextBox;

    @FindBy(css = "#endDate")
    private WebElement endDateTextBox;

    @FindBy(xpath = "//*[@id='trendsDates']/fieldset/div/input")
    private WebElement updateChartBtn;

    public UsedCarPriceTrendsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clearStartDateTextBox(){
        clear(startDateTextBox);
    }

    public void typeStartDateTextBox(String text){
        type(startDateTextBox, text);
    }

    public void clearEndDateTextBox() {
        clear(endDateTextBox);
    }
    public void typeEndDateTextBox(String text) {
        type(endDateTextBox, text);
    }

    public void clickUpdateChartBtn(){
        click(updateChartBtn);
    }
}
