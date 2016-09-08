package com.patientapp.tests;


import com.patientapp.common.GlobalUtil;
import com.patientapp.common.TestBase;
import com.patientapp.pages.AccountPage;
import com.patientapp.pages.HomeScreenPage;
import com.patientapp.pages.LoginPage;
import com.patientapp.pages.ServicesPage;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.font.GlyphJustificationInfo;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by sapna on 8/22/2016.
 */
public class HomeScreenTests extends TestBase {

    public static final String phoneNo ="8553013244";
    public static final String password ="123456";

    //@BeforeClass(alwaysRun=true)
    public void initHomeScreen() throws MalformedURLException{
        loginpage.skip();
        GlobalUtil.wait(2);
        ensureLogin(phoneNo, password);
    }
    
    @BeforeMethod(alwaysRun=true)
    public void initPageObjects(){
        loginpage = new LoginPage(driver);
        homescreenpage = new HomeScreenPage(driver);
        servicesPage = new ServicesPage(driver);
        accountPage = new AccountPage(driver);
    }

    @AfterMethod
	public void ensureHomeScreenPage() throws MalformedURLException{
        System.out.println("Account page could not be restored. Performing relogin.");
        //driver.quit();
        driver.closeApp();
//        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.launchApp();
        //loginpage.login(phoneNo, password);
      
}
    




    //@Test(priority = 1)
    public void testVerifyHomeScreenElementsVisibility()
    {
        System.out.print("Verify that user should able to see the Left Nav bar listing");
        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(2);
        Assert.assertNotNull(homescreenpage.getNotificationLocator());
        Assert.assertNotNull(homescreenpage.getHomeMenuLocator());
        Assert.assertNotNull(homescreenpage.getConsultMenuLocator());
        Assert.assertNotNull(homescreenpage.getHealthFeedMenuLocator());
        Assert.assertNotNull(homescreenpage.getAccountMenuLocator());
        //Assert.assertNotNull(homescreenpage.getMoreMenuLocator());
    }

    //@Test
    public void testVerifyHomeScreenWithoutLogin()
    {
        System.out.print("Verify that user should able to see the Left Nav bar listing");
        loginpage.skip();
//        loginpage.login(phoneNo, password);
       GlobalUtil.wait(2);
        WebElement skip = driver.findElement(By.name("Skip login"));
        skip.click();
        GlobalUtil.wait(2);
        Assert.assertNotNull(homescreenpage.getHomeMenuLocator());
        Assert.assertNotNull(homescreenpage.getServicesMenuLocator());
        Assert.assertNotNull(homescreenpage.getConsultMenuLocator());
        Assert.assertNotNull(homescreenpage.getHealthFeedMenuLocator());
        Assert.assertNotNull(homescreenpage.getAccountMenuLocator());
//        Assert.assertNotNull(homescreenpage.getAccountMenuLocator());
//        Assert.assertNotNull(homescreenpage.getMoreMenuLocator());
    }

    @Test
    public void testVerifyAllMenuScreensVisibility()
    {
        System.out.print("Verify that on Click bottom menus, should display respective Screens");
        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(2);
        homescreenpage.onClickServicesMenu();
        Assert.assertNotNull(homescreenpage.getServicesScreenLocator());
        GlobalUtil.wait(2);
        homescreenpage.onClickChatMenu();
        Assert.assertNotNull(homescreenpage.getChatScreenLocator());
        GlobalUtil.wait(2);
        homescreenpage.onClickHealthFeedMenu();
        Assert.assertNotNull(homescreenpage.getHealthFeedScreenLocator());
        GlobalUtil.wait(2);
        homescreenpage.onClickAccountMenu();
        Assert.assertNotNull(homescreenpage.getAccountScreenLocator());
    }

    @Test
    public void TC_6_testVerifyMoreAndNotificationOption()
    {
        System.out.print("Verify that on Click bottom menus, should display respective Screens");
        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(2);
        homescreenpage.onClickMoreMenu();
        Assert.assertNotNull(homescreenpage.getMoreScreenLocator());
        GlobalUtil.wait(2);
        driver.navigate().back();
        homescreenpage.onClickHomeMenu();
        GlobalUtil.wait(2);
        homescreenpage.onClickNotification();
        GlobalUtil.wait(2);
        Assert.assertNotNull(homescreenpage.getNotificationScreenLocator());
    }

    //@Test
    public void TC_7_testVerifyAllBannersShouldBeClickable()
    {
     System.out.print("Verify that user should able to open all banners by clicking on it");
        java.util.List<WebElement> listView = driver.findElements(By.xpath("//android.widget.ListView"));
        //for (int i =0 ; i<listView.lastIndexOf(listView); i++ ) {
            listView.get(0).click();
            Assert.assertNotNull("");
            driver.navigate().back();
            listView.get(1).click();
            Assert.assertNotNull("");
            driver.navigate().back();
            listView.get(2);
            Assert.assertNotNull("");
        //}
    }
   //@Test(horizontal scroll is not working)
    public void TC_8_testVerifyAllServicesVisibilityOnHomeScreen()
    {
        System.out.print("Verify that all services should display on Home Screen");
        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(2);
        Assert.assertNotNull(homescreenpage.getPhysioBannerLocator());
        GlobalUtil.wait(1);
        Assert.assertNotNull(homescreenpage.getPharmacyBannerLocator());
        GlobalUtil.wait(1);
        homescreenpage.scrollTabs();
        //driver.scrollToExact("Lab Tests");
        Assert.assertNotNull(homescreenpage.getLabTestsBannerLocator());
        GlobalUtil.wait(1);
        driver.scrollToExact("Nursing");
        Assert.assertNotNull(homescreenpage.getNursingBannerLocator());
        GlobalUtil.wait(1);
        driver.scrollToExact("Attendants");
        Assert.assertNotNull(homescreenpage.getAttendantsBannerLocator());
        GlobalUtil.wait(1);
        driver.scrollToExact("Elder Care");
        Assert.assertNotNull(homescreenpage.getElderCareBannerLocator());
        GlobalUtil.wait(1);
        driver.scrollToExact("Postnatal Care");
        Assert.assertNotNull(homescreenpage.getPostNatalCareBannerLocator());
        GlobalUtil.wait(1);
        driver.scrollToExact("Doctors");
        Assert.assertNotNull(homescreenpage.getDoctorsBannerLocator());
        GlobalUtil.wait(1);
        driver.scrollToExact("Vaccinations");
        Assert.assertNotNull(homescreenpage.getVaccinationsBannerLocator());
        GlobalUtil.wait(1);
        driver.scrollToExact("Equipment");
        Assert.assertNotNull(homescreenpage.getEquipmentsBannerLocator());

    }

  

 
 

 
    
    @Test
    public void TC_29_testVerifyAllappointmentsVisibility()
    {
        System.out.print("Verify that user should able to view all appointments on My Appointments");
        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(2);
        homescreenpage.onClickAccountMenu();
        GlobalUtil.wait(5);
        accountPage.onClickMyAppointments();
        GlobalUtil.wait(2);
        Assert.assertNotNull(homescreenpage.getMyAppointmentsScreenLocator());
    }

    @Test
    public void TC_30_testVerifyMyHealthRecordsVisibility()
    {
        System.out.print("Verify that user should able to view all the health records and reports under My Health Records");

        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(2);
        homescreenpage.onClickAccountMenu();
        GlobalUtil.wait(2);
        accountPage.onClickMyHealthRecords();
        Assert.assertNotNull(homescreenpage.getHealthRecordScreenLocator());
    }

    @Test
    public void TC_31_testVerifyBookMarkedArticlesVisibility()
    {
        System.out.print("Verify that user should able to view all the health records and reports under My Health Records");
        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(2);
        homescreenpage.onClickAccountMenu();
        GlobalUtil.wait(2);
        accountPage.onClickBookmarkedArticles();
        GlobalUtil.wait(2);
        Assert.assertNotNull(homescreenpage.getBookMarkedArticlesScreenLocator());
    }

    @Test
    public void TC_34_testVerifyTransactionHistoryVisibility()
    {
        System.out.print("Verify that user should able to view transaction history on Payments screen");
        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(2);
        homescreenpage.onClickAccountMenu();
        GlobalUtil.wait(2);
        driver.scrollToExact("My Payments");
        GlobalUtil.wait(2);
        accountPage.onClickMyPayments();
        GlobalUtil.wait(2);
        accountPage.onClickTransactionsTab();
        Assert.assertNotNull(homescreenpage.getTransactionScreenLocator());
    }

    @Test
    public void TC_35_testVerifyWallet()
    {
    System.out.print("Verify that user should able to add Wallet and see the Wallet balance");
       loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(2);
        homescreenpage.onClickAccountMenu();
        GlobalUtil.wait(2);
        driver.scrollToExact("Portea Wallet");
        GlobalUtil.wait(2);
        accountPage.onClickPorteaWallet();
        Assert.assertNotNull(accountPage.getWalletScreenLocator());

    }


    @Test
    public void TC_36_testVerifyPharmacyOrderAndPrescriptionsVisibility()
    {
        System.out.print("Verify that user should able to see Pharmacy order details and prescriptions in My Prescriptions( if any previous order is there).");
//        WebElement ele = driver.findElement(By.name("Navigate up"));
//        ele.click();
//        GlobalUtil.wait(2);
//        driver.scrollToExact("Pharmacy Requests");
        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(2);
        homescreenpage.onClickAccountMenu();
        GlobalUtil.wait(2);
        driver.scrollToExact("Pharmacy Requests");
        GlobalUtil.wait(2);
        accountPage.onClickPharmacyRequests();
        GlobalUtil.wait(2);
        Assert.assertNotNull(homescreenpage.getPharmacyRequestScreenLocator());
    }

    @Test
    public void TC_38_testVerifyPorteaCherishScreenVisibility()
    {
        System.out.print("Verify that user should able to see cherish points from Portea Cherish screen and redeem also for Patient who are applicable for this.");
//        WebElement ele = driver.findElement(By.name("Navigate up"));
//        ele.click();
//        GlobalUtil.wait(2);
        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(2);
        homescreenpage.onClickAccountMenu();
        GlobalUtil.wait(2);
        driver.scrollToExact("Portea Cherish");
        GlobalUtil.wait(2);
        accountPage.onClickPorteaCherish();
        GlobalUtil.wait(2);
        Assert.assertNotNull(homescreenpage.getPorteaCherishScreenLocator());
    }

    @Test
    public void testVerifyWithoutLogin()
    {
    	System.out.println("Verify open appointment screen");
    	loginpage.skip();
        GlobalUtil.wait(2);
        WebElement skiplogin = driver.findElement(By.name("Skip login"));
        skiplogin.click();
        GlobalUtil.wait(2);
        homescreenpage.onClickServicesMenu();
        GlobalUtil.wait(2);
        WebElement pharma = driver.findElement(By.name("service_pharmacy"));
        pharma.click();  
    }
}
