package com.patientapp.pages;

import com.patientapp.common.BasePage;
import com.patientapp.common.GlobalUtil;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by sapna on 6/17/2016.
 */
public class LoginPage extends BasePage {

    public LoginPage(AppiumDriver driver) {
        super(driver);
    }

    private final By skipLocator = By.id("com.weecode.portea.stage:id/skip");
    private final By homeScreenLocator = By.name("Portea");

    public By getHomeScreenLocator() {
        return homeScreenLocator;
    }

    private final By registerLinkLocator = By.name("Register");
    public By getRegisterLinkLocator()
    {
        return registerLinkLocator;
    }
    public void onClickRegisterLink()
    {
        WebElement reg = driver.findElement(registerLinkLocator);
        reg.click();
    }

    public By getSkipLocator() {
        return skipLocator;
    }

    private final By forgotPasswordLocator = By.name("forgot");

    public By getForgotPasswordLocator() {
        return forgotPasswordLocator;
    }

    private final By phoneNoFieldLocator = By.id("com.weecode.portea.stage:id/tv_mobile_no");

    public By getPhoneNoFieldLocator() {
        return phoneNoFieldLocator;
    }

    private final By passwordFieldLocator = By.id("com.weecode.portea.stage:id/tv_password");

    public By getPasswordFieldLocator() {
        return passwordFieldLocator;
    }

    private final By loginBtnLocator = By.id("com.weecode.portea.stage:id/bt_login");
    private final By selectAccountLocator = By.name("Seems like you have multiple accounts with us. Please choose and account to proceed...");

    public By getSelectAccountLocator() {
        return selectAccountLocator;
    }

    public By getLoginBtnLocator() {
        return loginBtnLocator;
    }

    public void skip() {
        WebElement skip = driver.findElement(skipLocator);
        skip.click();
        GlobalUtil.wait(2);
    }

    public void login(String phoneNumber, String passWord)
    {
        WebElement phoneNo = driver.findElement(phoneNoFieldLocator);
        phoneNo.sendKeys(phoneNumber);
        GlobalUtil.wait(2);
        WebElement pwd = driver.findElement(passwordFieldLocator);
        pwd.sendKeys(passWord);
        GlobalUtil.wait(2);
        driver.hideKeyboard();
        GlobalUtil.wait(2);
        WebElement login = driver.findElement(loginBtnLocator);
        login.click();
        GlobalUtil.wait(2);
        //selectPatient();
    }
 public void selectPatient()
 {
     List<WebElement> listView = driver.findElements(By.xpath("//android.widget.ListView"));
     listView.get(0).click();
     List<WebElement> patientList = driver.findElements(By.xpath("//android.widget.LinearLayout"));
     patientList.get(0).click();


 }

    public void onClickSkipLink()
    {
        WebElement skip = driver.findElement(skipLocator);
        skip.click();
    }


}
