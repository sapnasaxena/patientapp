package com.patientapp.tests;

import com.patientapp.common.GlobalUtil;
import com.patientapp.common.TestBase;
import com.patientapp.pages.HealthFeedPage;
import com.patientapp.pages.HomeScreenPage;
import com.patientapp.pages.LoginPage;

import org.openqa.selenium.By;
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
 * Created by sapna on 8/24/2016.
 */
public class HealthFeedTests extends TestBase {

    public static final String phoneNo ="8553013244";
    public static final String password ="123456";

    //@BeforeClass(alwaysRun=true)
    public void initHealthFeedPage() throws MalformedURLException {
        ensureLogin(phoneNo, password);
    }
    @BeforeMethod(alwaysRun=true)
    public void initPageObjects(){
        loginpage = new LoginPage(driver);
        homescreenpage = new HomeScreenPage(driver);
        healthFeedPage = new HealthFeedPage(driver);

    }

    @AfterMethod
	public void ensureHealthFeedPage() throws MalformedURLException{
        System.out.println("Healthfeed page could not be restored. Performing relogin.");
        //driver.quit();
        driver.closeApp();
//        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.launchApp();
        //loginpage.login(phoneNo, password);
      
}
    @Test
    public void TC_21_testVerifyUserShouldAbleToSeeSelectedFeedDetails()
    {
        System.out.print("Verify that user should able to filters health feed articles.");
        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(2);
        homescreenpage.onClickHealthFeedMenu();
        GlobalUtil.wait(2);
        healthFeedPage.onClickFilter();
        GlobalUtil.wait(2);
        healthFeedPage.selectFilter("Elder Care");
        java.util.List<WebElement> listView = driver.findElements(By.xpath("//android.widget.LinearLayout[contains(@class,'android.widget.TextView')]"));
        listView.get(0).getText();
        Assert.assertEquals(listView.get(0).getText(), "Elder Care");
    }

    @Test
    public void TC_22_testVerifyUserShouldAbleToLikeArticle()
    {
        System.out.print("Verify that user should able to Like article");
        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(2);
        homescreenpage.onClickHealthFeedMenu();
        GlobalUtil.wait(2);
        String actual = healthFeedPage.getLikeCount();
        healthFeedPage.likeArticle();
        String expected = healthFeedPage.increaseLikeCount() + 1;
        Assert.assertEquals(actual,expected);
        healthFeedPage.shareArticle();
        Assert.assertNotNull("");
        driver.navigate().back();
        GlobalUtil.wait(2);
        healthFeedPage.bookMarkArticle();
        GlobalUtil.wait(2);
        homescreenpage.onClickAccountMenu();
        GlobalUtil.wait(2);
        accountPage.onClickBookmarkedArticles();
        GlobalUtil.wait(2);
        java.util.List<WebElement> listView = driver.findElements(By.className("android.support.v4.widget.DrawerLayout"));
        listView.get(0);
        Assert.assertNotNull(listView);


    }


}
