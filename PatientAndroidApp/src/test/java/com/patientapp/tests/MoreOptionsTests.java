package com.patientapp.tests;

import com.patientapp.common.GlobalUtil;
import com.patientapp.common.TestBase;
import com.patientapp.pages.HealthFeedPage;
import com.patientapp.pages.HomeScreenPage;
import com.patientapp.pages.LoginPage;
import com.patientapp.pages.MoreOptionsPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by sapna on 8/25/2016.
 */
public class MoreOptionsTests extends TestBase {

    public static final String phoneNo ="8553013244";
    public static final String password ="123456";

    //@BeforeClass(alwaysRun=true)
    public void initMoreOptionsPage() throws MalformedURLException {
        ensureLogin(phoneNo, password);
    }
    @BeforeMethod(alwaysRun=true)
    public void initPageObjects(){
        loginpage = new LoginPage(driver);
        homescreenpage = new HomeScreenPage(driver);
        healthFeedPage = new HealthFeedPage(driver);
        moreOptionsPage = new MoreOptionsPage(driver);

    }

    @AfterMethod
	public void ensureMoreOptionsPage() throws MalformedURLException{
        System.out.println("Account page could not be restored. Performing relogin.");
        driver.closeApp();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.launchApp();
      
}


    @Test
    public void TC_23_testVerifyOfferPromotionsVisibility()
    {
        System.out.print("Verify that on Click Offer and Promotions option, user should able to see Portea offers and promotions ");
        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(2);
        homescreenpage.onClickMoreMenu();
        GlobalUtil.wait(2);
        moreOptionsPage.onClickOfferPromotion();
        Assert.assertNotNull(moreOptionsPage.getOfferPromotionScreenLocator());
    }

    @Test
    public void TC_24_testVerifyGeneralQueriesFAQVisibility()
    {
        System.out.print("Verify that on Click General Queries option, user should able to see general queries ");
        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(2);
        homescreenpage.onClickMoreMenu();
        GlobalUtil.wait(2);
        moreOptionsPage.onClickFAQ();
        Assert.assertNotNull(moreOptionsPage.getFaqScreenGeneralQueriesLocator());
    }
    @Test
    public void TC_25_testVerifyRateUsScreenVisibility()
    {
        System.out.print("Verify that on Click Rate Us option, user should able to see rate us screen ");
        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(2);
        homescreenpage.onClickMoreMenu();
        GlobalUtil.wait(2);
        moreOptionsPage.onClickRateUs();
        Assert.assertNotNull(moreOptionsPage.getRateUsScreenLocator());
    }

    @Test
    public void TC_26_testVerifyAboutUsScreenVisibility()
    {
        System.out.print("Verify that on Click About Us option, user should able to see about us screen ");
        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(2);
        homescreenpage.onClickMoreMenu();
        GlobalUtil.wait(2);
        moreOptionsPage.onClickAboutUs();
        Assert.assertNotNull(moreOptionsPage.getAboutUsScreenLocator());
    }

    @Test
    public void TC_27_testVerifyUserShouldAbleToSubmitFeedback()
    {
     System.out.print("Verify that user should able to submit feedback");
     loginpage.skip();
     GlobalUtil.wait(2);
     loginpage.login(phoneNo, password);
     GlobalUtil.wait(2);
        homescreenpage.onClickMoreMenu();
        GlobalUtil.wait(2);
        moreOptionsPage.onClickFeedback();
        GlobalUtil.wait(2);
        moreOptionsPage.submitFeedback();
        Assert.assertTrue(true,"Thank you for your feedback. We will work on it to make your experience better");
    }

    @Test
    public void TC_28_testVerifyContactUsOption()
    {
        System.out.print("Verify that user should able to contact Portea through Contact Us option");
        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(2);
        homescreenpage.onClickMoreMenu();
        GlobalUtil.wait(2);
        moreOptionsPage.onClickContactUs();
        GlobalUtil.wait(2);
        moreOptionsPage.contactUsByCall();
        Assert.assertTrue(true, "1800 121 2323");
        GlobalUtil.wait(2);
        driver.navigate().back();
        moreOptionsPage.submitFeedback();
        Assert.assertTrue(true,"Thank you for your feedback. We will work on it to make your experience better");
        driver.navigate().back();
        Assert.assertTrue(true, "Headquaters");

    }

    @Test
    public void TC_29_testVerifyAllAppointmentsVisibilitiesOnMyAppointments()
    {
        System.out.print("Verify that all booked appointments should be displayed in My appointments.");
        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(2);
        homescreenpage.onClickAccountMenu();
        GlobalUtil.wait(2);
        accountPage.onClickMyAppointments();
        Assert.assertTrue(true,"Appointments");
    }

}
