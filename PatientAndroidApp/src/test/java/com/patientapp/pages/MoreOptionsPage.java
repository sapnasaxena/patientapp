package com.patientapp.pages;

import com.patientapp.common.BasePage;
import com.patientapp.common.GlobalUtil;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

/**
 * Created by sapna on 8/25/2016.
 */
public class MoreOptionsPage extends BasePage {
    public MoreOptionsPage(AppiumDriver driver) {
        super(driver);
    }

private final By referEarnLocator = By.name("Refer and Earn");
    public By getReferEarnLocator()
    {
        return referEarnLocator;
    }
    private final By offersPromotionLocator = By.name("Offers and Promotion");
    public By getOffersPromotionLocator()
    {
        return offersPromotionLocator;
    }
    private final By faqLocator = By.name("FAQ");
    public By getFaqLocator()
    {
        return faqLocator;
    }
    private final By rateUsLocator = By.name("Rate Us");
    public By getRateUsLocator()
    {
        return rateUsLocator;
    }
    private final By aboutUsLocator = By.name("About Us");
    public By getAboutUsLocator()
    {
        return aboutUsLocator;
    }
    private final By feedbackLocator = By.name("Feedback");
    public By getFeedbackLocator()
    {
        return feedbackLocator;
    }
    private  final By contactUsLocator = By.name("Contact Us");
    public By getContactUsLocator()
    {
        return contactUsLocator;
    }
    private final By signOutLocator = By.name("Sign Out");
    public By getSignOutLocator()
    {
        return signOutLocator;
    }
    private final By offerPromotionScreenLocator = By.name("Offers");
    public By getOfferPromotionScreenLocator()
    {
        return offerPromotionScreenLocator;
    }
    private final By promotionsOnOffersScreenLocator = By.id("");
    public By getPromotionsOnOffersScreenLocator()
    {
        return promotionsOnOffersScreenLocator;
    }

    private final By rateUsScreenLocator = By.name("Portea - Heal at Home");
    public By getRateUsScreenLocator()
    {
        return rateUsScreenLocator;
    }

    private final By aboutUsScreenLocator = By.name("About Us");
    public By getAboutUsScreenLocator()
    {
        return aboutUsScreenLocator;
    }

    private final By faqScreenLocator = By.id("FAQ");
    public By getFaqScreenLocator()
    {
        return faqScreenLocator;
    }
    private final By faqScreenAppointmentAndPaymentLocator = By.name("Appointments and Payments");
    public By getFaqScreenAppointmentAndPaymentLocator()
    {return faqScreenAppointmentAndPaymentLocator;
    }
    private final By faqScreenGeneralQueriesLocator = By.name("General Queries");
    public By getFaqScreenGeneralQueriesLocator()
    {
        return faqScreenGeneralQueriesLocator;
    }
    private final By faqScreenServiceRelatedQueriesLocator = By.name("Service Related Queries");
    public By getFaqScreenServiceRelatedQueriesLocator()
    {
        return faqScreenServiceRelatedQueriesLocator;
    }


    public void onClickOfferPromotion()
    {
        WebElement ele = driver.findElement(offersPromotionLocator);
        ele.click();
    }
    public void onClickFAQ()
    {
        WebElement ele = driver.findElement(faqLocator);
        ele.click();
    }

    public void onClickRateUs()
    {
        WebElement ele = driver.findElement(rateUsLocator);
        ele.click();
    }
    public void onClickAboutUs()
    {
        WebElement ele = driver.findElement(aboutUsLocator);
        ele.click();
    }
    public void onClickFeedback()
    {
        WebElement ele = driver.findElement(feedbackLocator);
        ele.click();
    }

    public void onClickContactUs()
    {
        WebElement ele = driver.findElement(contactUsLocator);
        ele.click();
    }

    public void submitFeedback()
    {
        WebElement ele = driver.findElement(By.id(""));
        ele.sendKeys("test");
        GlobalUtil.wait(2);
        WebElement submit = driver.findElement(By.name("Submit"));
        submit.click();
    }

    public void contactUsByCall()
    {
        WebElement ele = driver.findElement(By.name("Call Us"));
        ele.click();
    }

    public void contactByWriteUs()
    {
        WebElement ele = driver.findElement(By.name("Write to Us"));
        ele.click();
    }


}
