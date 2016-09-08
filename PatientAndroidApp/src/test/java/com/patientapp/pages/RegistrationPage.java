package com.patientapp.pages;

import com.patientapp.common.BasePage;
import com.patientapp.common.GlobalUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

/**
 * Created by sapna on 8/23/2016.
 */
public class RegistrationPage extends BasePage {
    public RegistrationPage(AppiumDriver driver) {
        super(driver);
    }

    private final  By NameLocator = By.name("Name");

    public By getNameLocator() {
        return NameLocator;
    }

    private final By mobileNoLocator = By.id("com.weecode.portea.stage:id/et_phone_no");

    public By getMobileNoLocator() {
        return mobileNoLocator;
    }

    private final By emailIdLocator = By.id("com.weecode.portea.stage:id/et_email");

    public By getEmailIdLocator() {
        return emailIdLocator;
    }

    private final By passwordLocator = By.id("com.weecode.portea.stage:id/et_password");

    public By getPasswordLocator() {
        return passwordLocator;
    }

    private final By createAccountButtonLocator = By.name("Create My Account");

    public By getCreateAccountButtonLocator() {
        return createAccountButtonLocator;
    }

    public void registerPatient()
    {
        WebElement name = driver.findElement(NameLocator);
        name.sendKeys(GlobalUtil.getRandomName(8));
        GlobalUtil.wait(2);
        WebElement email = driver.findElement(emailIdLocator);
        email.sendKeys(GlobalUtil.getRandomName(4) + "@portea.qa");
        GlobalUtil.wait(2);
        WebElement phoneNo = driver.findElement(mobileNoLocator);
        phoneNo.sendKeys("8553013244");
        GlobalUtil.wait(2);
        WebElement createBtn = driver.findElement(createAccountButtonLocator);
        createBtn.click();
    }

}
