package com.patientapp.tests;

import com.patientapp.common.GlobalUtil;
import com.patientapp.common.TestBase;
import com.patientapp.pages.HomeScreenPage;
import com.patientapp.pages.LoginPage;
import com.patientapp.pages.RegistrationPage;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by sapna on 8/23/2016.
 */
public class RegistrationTests extends TestBase{

    @BeforeMethod(alwaysRun=true)
    public void initPageObjects(){
        loginpage = new LoginPage(driver);
        homescreenpage = new HomeScreenPage(driver);
        registrationPage = new RegistrationPage(driver);
    }

    @AfterMethod
	public void ensureRegistrationPage() throws MalformedURLException{
        System.out.println("Account page could not be restored. Performing relogin.");
        //driver.quit();
        driver.closeApp();
//        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.launchApp();
        //loginpage.login(phoneNo, password);
      
}
    @Test
    public void testVerifyPatientRegistration()
    {
        System.out.print("Patient should be registered successfully");
        loginpage.onClickSkipLink();
        GlobalUtil.wait(2);
        loginpage.onClickRegisterLink();
        GlobalUtil.wait(2);
        registrationPage.registerPatient();
    }


}
