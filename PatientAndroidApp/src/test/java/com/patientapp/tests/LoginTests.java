package com.patientapp.tests;
import com.patientapp.common.GlobalUtil;
import com.patientapp.common.TestBase;
import com.patientapp.pages.LoginPage;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by sapna on 6/17/2016.
 */
public class LoginTests extends TestBase {

    public static final String phoneNo ="8553013244";
    public static final String password ="123456";

    @BeforeMethod(alwaysRun=true)
    public void initPageObjects(){
        loginpage = new LoginPage(driver);

    }
    //@AfterMethod(alwaysRun=true)
    @AfterMethod
	public void ensureLoginPage() throws MalformedURLException{
        System.out.println("login page could not be restored. Performing relogin.");
        //driver.quit();
        driver.closeApp();
//        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.launchApp();
        //loginpage.login(phoneNo, password);
      
}
  @Test
    public void testVerifyLoginFunctionality()
   {
       loginpage.skip();
       GlobalUtil.wait(2);
       loginpage.login(phoneNo,password);
       Assert.assertNotNull(loginpage.getHomeScreenLocator());
   }


    @Test
    public void testVerifyLoginScreenElementsVisibility()
    {
        System.out.print("Login screen elements visibility like Skip link,Mobile No, password, login button, forgot password, register");
        GlobalUtil.wait(2);
        Assert.assertNotNull(loginpage.getPhoneNoFieldLocator());
        Assert.assertNotNull(loginpage.getPasswordFieldLocator());
        Assert.assertNotNull(loginpage.getLoginBtnLocator());
        Assert.assertNotNull(loginpage.getForgotPasswordLocator());
        Assert.assertNotNull(loginpage.getRegisterLinkLocator());
        //Assert.assertNotNull(loginpage.getSkipLocator());
    }

    @Test
    public void TC_6_testVerifyLoginWithOutRegistration()
    {
        System.out.print("Verify that unregistered user should not be able to login");
        loginpage.onClickSkipLink();
        GlobalUtil.wait(2);
        loginpage.login("110001111",password);
        //System.out.print("Not a registered user");
        Assert.assertNotNull(loginpage.getForgotPasswordLocator());
    }


}
