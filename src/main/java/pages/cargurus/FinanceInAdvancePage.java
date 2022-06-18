package pages.cargurus;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinanceInAdvancePage extends CommonAPI {

    @FindBy(css = "input[name='price']")
    private WebElement vehiclePriceTextBox;

    @FindBy(css = "input[name='downPayment']")
    private WebElement downPaymentTextBox;

    @FindBy(xpath = "//body/div[@id='wrapper']/main[@id='content']/div[1]/div[2]/div[2]/div[1]/div[2]/fieldset[1]/fieldset[1]/div[1]/label[3]/span[1]")
    private WebElement creditScoreBtn;

    @FindBy(xpath = "//body/div[@id='wrapper']/main[@id='content']/div[1]/div[2]/div[2]/div[1]/div[2]/fieldset[1]/fieldset[1]/div[2]/label[3]")
    private WebElement loanTermBtn;





    public FinanceInAdvancePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void typeVehiclePrice(String text){
        type(vehiclePriceTextBox, text);
    }

    public void typeDownPayment(String text) {
        type(downPaymentTextBox, text);
    }

    public void clickCreditScoreBtn(){
        click(creditScoreBtn);
    }

    public void clickLoanTermBtn(){
        click(loanTermBtn);
    }
}
