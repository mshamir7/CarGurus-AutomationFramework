package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhatsMyCarWorthPage extends CommonAPI {

    @FindBy(css = "#carPicker_purposeSelect")
    private WebElement purposeDropDownList;

    @FindBy(css = "#carPicker_makerSelect")
    private WebElement makeDropDownList;

    @FindBy(css = "#carPicker_modelSelect")
    private WebElement modelDropDownList;

    @FindBy(css = "#carPicker_year1Select")
    private WebElement yearDropDownList;

    @FindBy(css = "#carPicker_trimSelect")
    private WebElement trimDropDownList;

    @FindBy(css = "#listingFormZip")
    private WebElement typeCarValuesZipCode;

    @FindBy(css = "#instantMarketToolForm_carDescription_price")
    private WebElement typeCarValuesPrice;

    @FindBy(css = ".new-car")
    private WebElement priceReportAssertionLogo;

    @FindBy(xpath = "//*[@class='new-car']")
    private WebElement priceReportAssertionLogos;


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
        boolean present = !(isPresent(priceReportAssertionLogos));
        return present;
    }
}
