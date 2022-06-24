package apps.carguru;

import base.CommonAPI;
import base.CommonsAPI;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends CommonsAPI {

    private final Logger LOG = LoggerFactory.getLogger(Login.class);

    @Test
    public void validLogin() {
        getDriver().get("https://www.carsaver.com");
        getDriver().manage().window().maximize();
        LOG.info("Login:" + "\n"+"validLogin Test");
        Assert.assertEquals("CarSaver | Everyday low prices on new and used cars", getDriver().getTitle());
        click(getDriver().findElement(By.xpath("//li[@class='nav-item' and a//text()[contains(., 'Sign In')]]")));
        LOG.info("sign in button clicked");
        type(getDriver().findElement(By.xpath("//*[@id='email']")), "ravenn587@aol.com");
        LOG.info("email entered");
        typeAndEnter(getDriver().findElement(By.xpath("//*[@id='password']")), "Qwerty1");
        LOG.info("typed password and enter");
        waitFor(6);
    }

    @Test
    public void logOutOfUserProfile(){
        getDriver().get("https://www.carsaver.com");
        getDriver().manage().window().maximize();
        LOG.info("Login:" + "\n"+"logOutOfUserProfile Test");
        waitFor(1);
        Assert.assertEquals("CarSaver | Everyday low prices on new and used cars", getDriver().getTitle());
        click(getDriver().findElement(By.xpath("//li[@class='nav-item' and a//text()[contains(., 'Sign In')]]")));
        LOG.info("sign in button clicked");
        type(getDriver().findElement(By.xpath("//*[@id='email']")), "ravenn587@aol.com");
        LOG.info("email entered");
        typeAndEnter(getDriver().findElement(By.cssSelector("#password")), "Qwerty1");
        LOG.info("typed password and enter");
        waitFor(1);
        click(getDriver().findElement(By.xpath("//*[@id='profileDropDownMenu']")));
        LOG.info("profile menu dropdown clicked");
        waitFor(2);
        click(getDriver().findElement(By.xpath("//*[@id='profileDropDownMenu-menu']/a[3]")));
        LOG.info("sign out lick clicked");
        waitFor(2);
        Assert.assertEquals("CarSaver | Everyday low prices on new and used cars", getDriver().getTitle());
    }

    @Test
    public void invalidLogin(){
        getDriver().get("https://www.carsaver.com");
        getDriver().manage().window().maximize();
        LOG.info("Login:" + "\n"+"invalidLogin Test");
        waitFor(1);
        Assert.assertEquals("CarSaver | Everyday low prices on new and used cars", getDriver().getTitle());
        click(getDriver().findElement(By.xpath("//li[@class='nav-item' and a//text()[contains(., 'Sign In')]]")));
        LOG.info("sign in button clicked");
        waitFor(1);
        type(getDriver().findElement(By.cssSelector("#email")), "ravenn57@aol.com");
        LOG.info("email entered");
        typeAndEnter(getDriver().findElement(By.cssSelector("#password")), "Qwrty1");
        LOG.info("typed password and enter");
        waitFor(2);
        String text = getElementText(getDriver().findElement(By.xpath("//*[@id='sign-in-content']/form/p[1]")));
        Assert.assertEquals("The email address or password are not correct", text);
        waitFor(2);
    }
}
