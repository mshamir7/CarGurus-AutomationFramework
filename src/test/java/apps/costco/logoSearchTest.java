package apps.costco;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class logoSearchTest extends CommonAPI  {

    @Test
    public void logoCheck(){

        click("img.bc-logo logo-ca");
        String expectedHeader ="Welcome to Costco Wholesale";
        Assert.assertEquals(expectedHeader,getPageTitle());
    }
}
