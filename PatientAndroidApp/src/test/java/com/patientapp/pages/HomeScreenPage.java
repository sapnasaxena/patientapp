package com.patientapp.pages;

import com.patientapp.common.BasePage;
import com.patientapp.common.GlobalUtil;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import com.sun.xml.internal.ws.policy.AssertionSet;

import junit.framework.Assert;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.KeyDownAction;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by sapna on 6/17/2016.
 */
public class HomeScreenPage extends BasePage {
    public HomeScreenPage(AppiumDriver driver) {
        super(driver);
    }

    private final By homeScreenLocator = By.name("PORTEA");

    private final By homeScreenNavBarLocator = By.className("android.widget.ImageButton");
    private final By patientIdLocator = By.name("POR033524");
    private final By patientNameLocator = By.className("android.widget.TextView");
    private final By patientEmailIdLocator = By.className("android.widget.TextView");
    private final By navbarListingLocator = By.name("MY PORTEA");
    private final By bookAppointmentNavLocator = By.name("Book an Appointment");
    private final By consultNavLocator = By.name("Consult");
    private final By healthFeedNavLocator = By.name("Health Feed");
    private final By notificationLocator = By.id("com.weecode.portea.stage:id/home_notification");
    public By getNotificationLocator()
    {
        return notificationLocator;
    }

    private final By notificationScreenLocator = By.name("Notifications");
    public By getNotificationScreenLocator()
    {
        return notificationScreenLocator;
    }
    private final By homeMenuLocator = By.name("Home");
    public By getHomeMenuLocator()
    {
        return homeMenuLocator;
    }

    private final By servicesMenuLocator = By.xpath("//android.widget.TextView[contains(@text,'Services')]");//By.name("Services");
    public By getServicesMenuLocator()
    {
        return servicesMenuLocator;
    }

    private final By servicesScreenLocator = By.xpath("//android.widget.FrameLayout[contains(@class,'android.widget.LinearLayout)]");
    public By getServicesScreenLocator()
    {
        return servicesScreenLocator;
    }

    private final By consultMenuLocator = By.name("Consult");
    public By getConsultMenuLocator()
    {
        return consultMenuLocator;
    }

    private final By healthfeedMenuLocator = By.name("Healthfeed");
    public  By getHealthFeedMenuLocator()
    {
        return healthfeedMenuLocator;
    }

  private final By accountMenuLocator = By.name("Account");
    public By getAccountMenuLocator()
    {
        return accountMenuLocator;
    }

    private final By moreMenuLocator = By.id("home_more");
    //id: com.weecode.portea.stage:id/home_more
    public By getMoreMenuLocator()
    {
        return moreMenuLocator;
    }

    private final By chatScreenLocator = By.name("Portea Chat");
    public By getChatScreenLocator()
    {
        return chatScreenLocator;
    }

    private final By porteaCherishScreenLocator= By.name("Portea Cherish");
    public By getPorteaCherishScreenLocator()
    {
        return porteaCherishScreenLocator;
    }

    private final By myHealthMilesLocator =By.name("My Health Miles");
    public By getMyHealthMilesLocator()
    {
        return myHealthMilesLocator;
    }

    private final By cherishFAQSLocator = By.name("CHERISH FAQS");
    public By getCherishFAQSLocator()
    {
        return cherishFAQSLocator;
    }
    private final By cherishFAQSAboutProgramLocator = By.name("About the Program");
    public By getCherishFAQSAboutProgramLocator()
    {
        return cherishFAQSAboutProgramLocator;
    }

    private final By cherishFAQSHealthMilesLocator = By.name("Health Miles");
    public By getCherishFAQSHealthMilesLocator()
    {
        return cherishFAQSHealthMilesLocator;
    }

    private final By cherishFAQSFamilyIDLocator = By.name("Family ID");
    public By getCherishFAQSFamilyIDLocator()
    {
        return cherishFAQSFamilyIDLocator;
    }

    private final By cherishFAQSAccountAccessLocator = By.name("Account Access");
    public By getCherishFAQSAccountAccessLocator()
    {
        return cherishFAQSAccountAccessLocator;
    }

    private final By myPrescriptionsScreenLocator = By.name("My Prescriptions");
    public By getMyPrescriptionsScreenLocator()
    {
        return myPrescriptionsScreenLocator;
    }
    private final By pharmacyRequestScreenLocator = By.name("Pharmacy Request");
    public By getPharmacyRequestScreenLocator()
    {
        return pharmacyRequestScreenLocator;
    }

    private final By myAppointmentsScreenLocator = By.name("My Appointments");
    public By getMyAppointmentsScreenLocator()
    {
        return myAppointmentsScreenLocator;
    }

    private final By transactionScreenLocator = By.name("TRANSACTIONS");
    public By getTransactionScreenLocator()
    {
        return transactionScreenLocator;
    }

    private final By bookMarkedArticlesScreenLocator = By.name("Bookmarked Articles");
    public By getBookMarkedArticlesScreenLocator()
    {
        return bookMarkedArticlesScreenLocator;
    }

    private final By healthRecordScreenLocator = By.name("Health Record");
    public By getHealthRecordScreenLocator()
    {
        return healthRecordScreenLocator;
    }
    private final By moreScreenLocator = By.name("Setting");
    public By getMoreScreenLocator()
    {
        return  moreScreenLocator;
    }

    private final By accountScreenLocator = By.name("HEALTH ACCOUNT");
    public By getAccountScreenLocator()
    {
        return accountScreenLocator;
    }

    private final By healthFeedScreenLocator = By.name("Health Feed");
    public By getHealthFeedScreenLocator()
    {
        return healthFeedScreenLocator;
    }
    public By getHomeScreenLocator() {
        return homeScreenLocator;
    }

    public By getHomeScreenNavBarLocator() {
        return homeScreenNavBarLocator;
    }

    private final By physioBannerLocator = By.name("Physiotherapy");
    public By getPhysioBannerLocator()
    {
        return physioBannerLocator;
    }

    private final By pharmacyBannerLocator = By.name("Pharmacy");
    public By getPharmacyBannerLocator()
    {
        return pharmacyBannerLocator;
    }

    private final By labTestsBannerLocator = By.name("Lab Tests");
    public By getLabTestsBannerLocator()
    {
        return labTestsBannerLocator;
    }
    private final By nursingBannerLocator = By.name("Nursing");
    public By getNursingBannerLocator()
    {
        return nursingBannerLocator;
    }
    private final By attendantsBannerLocator = By.name("Attendants");
    public By getAttendantsBannerLocator()
    {
        return attendantsBannerLocator;
    }
    private final By elderCareBannerLocator = By.name("Elder Care");
    public By getElderCareBannerLocator()
    {
        return elderCareBannerLocator;
    }
    private final By serviceScreenLocator = By.name("Services");
    public By getServiceScreenLocator()
    {
    	return serviceScreenLocator;
    }

    private final By postNatalCareBannerLocator = By.name("Postnatal Care");
    public By getPostNatalCareBannerLocator()
    {
        return postNatalCareBannerLocator;
    }

    public void onClickChatMenu()
    {
        WebElement chat= driver.findElement(consultMenuLocator);
        chat.click();
    }
    private final By doctorsBannerLocator = By.name("Doctors");
    public By getDoctorsBannerLocator()
    {
        return doctorsBannerLocator;
    }
    private final By vaccinationsBannerLocator = By.name("Vaccinations");
    public By getVaccinationsBannerLocator()
    {
        return vaccinationsBannerLocator;
    }

    private final By equipmentsBannerLocator = By.name("Equipments");
    public By getEquipmentsBannerLocator()
    {
        return equipmentsBannerLocator;
    }


    public void onClickHealthFeedMenu()
    {
        WebElement healthfeed= driver.findElement(healthfeedMenuLocator);
       healthfeed.click();
    }

    public void onClickAccountMenu()
    {
        WebElement account = driver.findElement(accountMenuLocator);
        account.click();
    }

    public void onClickMoreMenu()
    {
        WebElement more=driver.findElement(moreMenuLocator);
        more.click();
    }

    public void onClickHomeMenu()
    {
        WebElement home = driver.findElement(homeMenuLocator);
        home.click();
    }
    public void onClickNotification()
    {
        WebElement notification = driver.findElement(notificationLocator);
        notification.click();
    }

    public void onClickPhysiotherapyBanner()
    {
    WebElement ele = driver.findElement(physioBannerLocator);
        ele.click();
    }

    public  void clickOnBanners() {
        java.util.List<WebElement> listView = driver.findElements(By.xpath("//android.widget.ListView"));
        listView.get(0).click();
        driver.navigate().back();
        listView.get(1).click();
        driver.navigate().back();
        listView.get(2);
    }


    public void onClickPharmacyBanner()
    {
    WebElement ele = driver.findElement(pharmacyBannerLocator);
        ele.click();
    }
    public void onClickLabTestsBanner()
    {
        WebElement ele = driver.findElement(labTestsBannerLocator);
        ele.click();
    }
    public void onClickNursingBanner()
    {
     WebElement ele = driver.findElement(nursingBannerLocator);
        ele.click();
    }
    public void onClickAttendantBanner()
    {
        WebElement ele = driver.findElement(attendantsBannerLocator);
        ele.click();
    }
    public void onClickElderCareBanner()
    {
        WebElement ele = driver.findElement(elderCareBannerLocator);
        ele.click();

    }
    public void onClickPostNatalBanner()
    {
        WebElement ele = driver.findElement(postNatalCareBannerLocator);
        ele.click();
    }
    public void onClickDoctorsBanner()
    {
        WebElement ele = driver.findElement(doctorsBannerLocator);
        ele.click();
    }
    public void onClickVaccinationsBanner()
    {
        WebElement ele = driver.findElement(vaccinationsBannerLocator);
        ele.click();
    }
    public void onClickEquipmentBanner()
    {
        WebElement ele = driver.findElement(equipmentsBannerLocator);
        ele.click();
    }

    public void getAlreadyAddedAddress()
    {
        java.util.List<WebElement> selectAddress = (java.util.List<WebElement>) driver.findElement(By.xpath("//android.widget.FrameLayout[contains(@id,'com.weecode.portea.stage:id/tv_list_item_existing_address_address')]"));
        selectAddress.get(1).click();
    }
    

    public void onClickServicesMenu()
    {
        WebElement ele = driver.findElement(servicesMenuLocator);
        while(driver.findElement(serviceScreenLocator).isDisplayed())
        {
        ele.click();
        break;
        }
        
    }

    public void getAddNewAddress()
    {
        WebElement addNew = driver.findElement(By.name("Add New Address"));
        addNew.click();
        GlobalUtil.wait(2);
        WebElement address = driver.findElement(By.name("House no., Building/Street name"));
        address.sendKeys("222,test address");
        GlobalUtil.wait(2);
        WebElement arr = driver.findElement(By.id("com.weecode.portea.stage:id/edt_locality"));
        arr.sendKeys("Domlur");
        GlobalUtil.wait(2);
        java.util.List<WebElement> area = (java.util.List<WebElement>) driver.findElement(By.xpath("//android.widget.ListView"));
        area.get(0);
        GlobalUtil.wait(2);
        WebElement proceed = driver.findElement(By.name("Proceed"));
        proceed.click();
    }
    public void bookAppointments()
    {
        getAlreadyAddedAddress();
        GlobalUtil.wait(2);
        java.util.List<WebElement> slot = driver.findElements(By.xpath("//android.support.v7.widget.RecyclerView[contains(@class,'android.widget.LinearLayout')]"));
        slot.get(0);
        java.util.List<WebElement> date = (java.util.List<WebElement>) slot.get(0).findElement(By.xpath("//android.widget.TextView"));
        date.get(0).click();
        GlobalUtil.wait(2);
        java.util.List<WebElement> timings = driver.findElements(By.xpath("//android.widget.RelativeLayout[contains(@class,'android.widget.ScrollView')]"));
        timings.get(1).click();
        WebElement apptTime = driver.findElement(By.className("//android.widget.TextView"));
        apptTime.sendKeys("11:00 AM");
        GlobalUtil.wait(2);

    }

    public void bookApptForLab()
    {
        java.util.List<WebElement> ele = (java.util.List<WebElement>) driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@class,'android.widget.Button')]"));
        ele.get(0).click();
        WebElement cont = driver.findElement(By.name("Continue"));
        cont.click();



    }

    public void bookPharmacyByUploadFromGallery()
    {
        WebElement request = driver.findElement(By.name("REQUEST NOW"));
        request.click();
        GlobalUtil.wait(2);
        getAlreadyAddedAddress();
        GlobalUtil.wait(2);
        WebElement searchMed = driver.findElement(By.name("Search medicines"));
        searchMed.sendKeys("Crocin");
        searchMed.sendKeys(Keys.DOWN);
        GlobalUtil.wait(2);
        WebElement con = driver.findElement(By.name("Continue"));
        con.click();
        WebElement upload = driver.findElement(By.name("UPLOAD FROM GALLERY"));
        upload.click();
    }

    public void bookPharmacyBySelectFromRequestHistory()
    {
        WebElement request = driver.findElement(By.name("REQUEST NOW"));
        request.click();
        GlobalUtil.wait(2);
        getAlreadyAddedAddress();
        GlobalUtil.wait(2);
        WebElement searchMed = driver.findElement(By.name("Search medicines"));
        searchMed.sendKeys("Crocin");
        Select sel = new Select(driver.findElement(By.id("com.weecode.portea.stage:id/cart_list")));
        sel.selectByVisibleText("Crocin");
        searchMed.sendKeys(Keys.DOWN);
        GlobalUtil.wait(2);
        WebElement con = driver.findElement(By.name("CONTINUE"));
        con.click();
        WebElement upload = driver.findElement(By.name("SELECT FROM REQUEST HISTORY"));
        upload.click();
        GlobalUtil.wait(2);
        java.util.List <WebElement> pres = driver.findElements(By.xpath("//android.support.v7.widget.RecyclerView[contains(@class,'android.widget.LinearLayout')]"));
        pres.get(0).click();
        GlobalUtil.wait(2);
        con.click();

    }

    public void scrollTabs() {
        //Get the size of screen.
        //driver.manage().window().getSize();

        //Find swipe start and end point from screen's with and height.
        //Find startx point which is at right side of screen.
        int startx = (int) (driver.manage().window().getSize().width * 0.70);
        //Find endx point which is at left side of screen.
        int endx = (int) (driver.manage().window().getSize().width * 0.30);
        //Set Y Coordinates of screen where tabs display.
        int YCoordinates = 150;

        //Swipe tabs from Right to Left.
        driver.swipe(startx, YCoordinates, endx, YCoordinates, 3000);
    }
}

