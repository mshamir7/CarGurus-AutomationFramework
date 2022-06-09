package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhatsMyCarWorthPage extends CommonAPI {

    @FindBy(css = "#carPicker_purposeSelect")
    WebElement purposeDropDownList;

    @FindBy(css = "#carPicker_makerSelect")
    WebElement makeDropDownList;

    @FindBy(css = "#carPicker_modelSelect")
    WebElement modelDropDownList;

    @FindBy(css = "#carPicker_year1Select")
    WebElement yearDropDownList;

    @FindBy(css = "#carPicker_trimSelect")
    WebElement trimDropDownList;

    @FindBy(css = "#listingFormZip")
    WebElement typeCarValuesZipCode;

    @FindBy(css = "#instantMarketToolForm_carDescription_price")
    WebElement typeCarValuesPrice;

    @FindBy(css = ".new-car")
    WebElement priceReportAssertionLogo;


    public WhatsMyCarWorthPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectPurposeDropDownList(String option) {
        selectFromDropdown(purposeDropDownList, option);
    }

    public void selectMakeDropDownList(String option) {
        selectFromDropdown(makeDropDownList, option);
    }

    public void selectModelDropDownList(String option) {
        selectFromDropdown(modelDropDownList, option);
    }
    public void selectYearDropDownList(String option) {
        selectFromDropdown(yearDropDownList, option);
    }

    public void selectTrimDropDownList(String option) {
        selectFromDropdown(trimDropDownList, option);
    }
    public void typeCarValuesZipCode(String text) {
        type(typeCarValuesZipCode, text);
    }

    public void typeCarValuesPrice(String text) {
        typeAndEnter(typeCarValuesPrice, text);
    }

    public boolean assertPriceReportAssertionLogo(){
        boolean present = isPresent(priceReportAssertionLogo);
        return present;
    }
}
