package apps.costco;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends CommonAPI {

@Test
    public void CreateAccount(){
    hoverOver("//*[@id='createAccount']");
    waitFor(5);
    click("//*[@id='createAccount']");
    String expectedMessage ="Create Account | Costco";
    Assert.assertEquals(expectedMessage,getPageTitle());
    waitFor(5);


}
}
