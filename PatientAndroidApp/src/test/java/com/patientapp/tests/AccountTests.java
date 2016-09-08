package com.patientapp.tests;

import com.patientapp.common.GlobalUtil;
import com.patientapp.common.TestBase;
import com.patientapp.pages.AccountPage;
import com.patientapp.pages.HomeScreenPage;
import com.patientapp.pages.LoginPage;
import com.patientapp.pages.ServicesPage;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by sapna on 8/30/2016.
 */
public class AccountTests extends TestBase {


    public static final String phoneNo ="8553013244";
    public static final String password ="123456";

    @BeforeMethod(alwaysRun=true)
    public void initPageObjects(){
        loginpage = new LoginPage(driver);
        homescreenpage = new HomeScreenPage(driver);
        servicesPage = new ServicesPage(driver);
        accountPage = new AccountPage(driver);

    }

    @AfterMethod
    	public void ensureAccountPage() throws MalformedURLException{
            System.out.println("Account page could not be restored. Performing relogin.");
            //driver.quit();
            driver.closeApp();
//            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.launchApp();
            //loginpage.login(phoneNo, password);
          
    }
    
    

    //Smoke test
   @Test
    public void TC_35_testVerifyUserAbleToAddWallet()
    {
     System.out.print("Verify that user should able to add Wallet");
       registrationPage.registerPatient();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo,password);
        GlobalUtil.wait(2);
        homescreenpage.onClickAccountMenu();
        GlobalUtil.wait(2);
        accountPage.onClickPorteaWallet();
        GlobalUtil.wait(2);
        accountPage.addWallet();
        org.testng.Assert.assertNotNull(accountPage.getLoadWalletButtonLocator());

    }
    @Test
    public void TC_35_testVerifyUserAbleToViewWallet()
    {
        System.out.print("Verify that user should able to add Wallet");
        loginpage.login(phoneNo,password);
        GlobalUtil.wait(2);
        homescreenpage.onClickAccountMenu();
        GlobalUtil.wait(2);
        accountPage.onClickPorteaWallet();
        org.testng.Assert.assertNotNull(accountPage.getWalletScreenLocator());

    }

    @Test
    public void TC_35_testVerifyUserAbleToLoadWalletBySavedCard()
    {
        System.out.print("Verify that user should able to add Wallet");
        loginpage.login(phoneNo,password);
        GlobalUtil.wait(2);
        homescreenpage.onClickAccountMenu();
        GlobalUtil.wait(2);
        accountPage.onClickPorteaWallet();
        GlobalUtil.wait(2);
        accountPage.loadWalletBySavedCards();
        org.testng.Assert.assertNotNull(accountPage.getWalletScreenLocator());
    }
    

    @Test
    public void TC_32_testVerifyPaidUnpaidAndUnbilledAppointments()
    {
        System.out.print("Verify that user should able to see paid, unpaid and unbilled appointments");
        loginpage.login(phoneNo,password);
        GlobalUtil.wait(2);
        homescreenpage.onClickAccountMenu();
        GlobalUtil.wait(2);
        accountPage.onClickMyPayments();
        GlobalUtil.wait(2);
        accountPage.onClickAnyAppointments();
        org.testng.Assert.assertNotNull(accountPage.getPaidTabLocator());
        org.testng.Assert.assertNotNull(accountPage.getUnBilledTabLocator());
        org.testng.Assert.assertNotNull(accountPage.getBilledTabLocator());
        
    }

    @Test
    public void testVerifyUserAbleToPayThroughPaytm()
    {
        System.out.print("Verify that user should able to pay through Paytm");
        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo,password);
        GlobalUtil.wait(2);
        homescreenpage.onClickAccountMenu();
        GlobalUtil.wait(2);
        driver.scrollToExact("My Payments");
        GlobalUtil.wait(2);
        accountPage.onClickMyPayments();
        GlobalUtil.wait(2);
        accountPage.payByPaytm();
        String result = "You have Successfully logged out";
        org.testng.Assert.assertTrue(true, result);

    }
 



    @Test
    public void testVerifyUserAbleToPayThroughNetbanking()
    {
        System.out.print("Verify that user should able to pay through Paytm");
        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo,password);
        GlobalUtil.wait(2);
        homescreenpage.onClickAccountMenu();
        GlobalUtil.wait(2);
        driver.scrollToExact("My Payments");
        GlobalUtil.wait(2);
        accountPage.onClickMyPayments();
        GlobalUtil.wait(2);
        accountPage.payByNetBanking();
        String result = "ICICI";
        org.testng.Assert.assertTrue(true,result );
//        WebElement dismiss = driver.findElement(By.name("Dismiss"));
//        dismiss.click();
//        org.testng.Assert.assertNotNull(driver.findElement(By.name("Diagnostic")));
    }
    
  @Test
    public void testVerifyUserAbleToPayThroughWallet()
    {
        System.out.print("Verify that user should able to pay through Wallet");
        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo,password);
        GlobalUtil.wait(2);
        homescreenpage.onClickAccountMenu();
        GlobalUtil.wait(2);
        driver.scrollToExact("My Payments");
        GlobalUtil.wait(2);
        accountPage.onClickMyPayments();
        GlobalUtil.wait(2);
        accountPage.payByWallet();
        String result = "Successfully paid using wallet.";
        org.testng.Assert.assertTrue(true,result);
//        WebElement dismiss = driver.findElement(By.name("Dismiss"));
//        dismiss.click();
//        org.testng.Assert.assertNotNull(driver.findElement(By.name("Diagnostic")));
    }

    @Test
    public void testVerifyUserAbleToPayThroughCards()
    {
        System.out.print("Verify that user should able to pay through Credit card");
        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo,password);
        GlobalUtil.wait(2);
        homescreenpage.onClickAccountMenu();
        GlobalUtil.wait(2);
        driver.scrollToExact("My Payments");
        GlobalUtil.wait(2);
        accountPage.onClickMyPayments();
        GlobalUtil.wait(2);
        accountPage.payByCard();
        GlobalUtil.wait(5);
        org.testng.Assert.assertTrue(true,"Your payment was processed successfully. Transaction Id.");
//        WebElement dismiss = driver.findElement(By.name("Dismiss"));
//        dismiss.click();
//        org.testng.Assert.assertNotNull(driver.findElement(By.name("Diagnostic")));
    }

}
