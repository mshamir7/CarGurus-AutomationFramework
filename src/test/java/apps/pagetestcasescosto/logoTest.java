package apps.pagetestcasescosto;

import base.CommonAPI;
import org.testng.annotations.Test;

public class logoTest extends CommonAPI {

    @Test
    public  void logoAtHome(){
        logoTest logoTest=new logoTest(getDriver());
        logoTest.logoAtHome();


    }
}
