package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {


@FindBy(css ="img.bc-logo logo-ca")
private  WebElement toCheckLogo();

}
