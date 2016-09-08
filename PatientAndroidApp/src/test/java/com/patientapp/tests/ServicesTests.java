package com.patientapp.tests;

import com.patientapp.common.GlobalUtil;
import com.patientapp.common.TestBase;
import com.patientapp.pages.AccountPage;
import com.patientapp.pages.HomeScreenPage;
import com.patientapp.pages.LoginPage;
import com.patientapp.pages.ServicesPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by sapna on 8/26/2016.
 */
public class ServicesTests extends TestBase {

    public static final String phoneNo ="8553013244";
    public static final String password ="123456";

    //@BeforeClass(alwaysRun=true)
    public void initServicesTests() throws MalformedURLException {
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
	public void ensureServicePage() throws MalformedURLException{
        System.out.println("Account page could not be restored. Performing relogin.");
        //driver.quit();
        driver.closeApp();
//        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.launchApp();
        //loginpage.login(phoneNo, password);
      
}
    

    //@Test(address not able to locate)
    public  void testVerifyBookPharmacy()
    {
        System.out.print("Verify that user should able to book Pharmacy");
        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(2);
        homescreenpage.onClickServicesMenu();
        GlobalUtil.wait(2);
        servicesPage.onClickPharmacy();
        GlobalUtil.wait(2);
        servicesPage.bookPharmacy();
        Assert.assertNotNull(servicesPage.getOrderConfirmationScreenLocator());
    }

    @Test
    public  void testVerifyBookVaccination()
    {
        System.out.print("Verify that user should able to book vaccination");
        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(2);
        homescreenpage.onClickServicesMenu();
        GlobalUtil.wait(2);
        driver.scrollToExact("Vaccinations");
        GlobalUtil.wait(2);
        servicesPage.onClickVaccination();
        GlobalUtil.wait(2);
        WebElement cont = driver.findElement(By.name("CONTINUE"));
        cont.click();
        GlobalUtil.wait(2);
        driver.hideKeyboard();
        GlobalUtil.wait(2);
        WebElement age = driver.findElement(By.id("com.weecode.portea.stage:id/et_leadgen_age"));
        age.click();
        age.clear();
        age.sendKeys("30");
        GlobalUtil.wait(2);
        WebElement getInTouchBtn = driver.findElement(By.id("com.weecode.portea.stage:id/btn_leadgen_submit"));
        GlobalUtil.wait(2);
        getInTouchBtn.click();
        GlobalUtil.wait(5);
        Assert.assertNotNull(servicesPage.getOrderConfirmationScreenLocator());
    }


    //@Test
    public void testVerifyBookEquipment()
    {
        System.out.print("Verify that user should able to book equipment");
        loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(5);
        homescreenpage.onClickServicesMenu();
        GlobalUtil.wait(2);
        driver.scrollToExact("Equipment");
        GlobalUtil.wait(2);
        servicesPage.onClickEquipment();
        GlobalUtil.wait(2);
        WebElement cont = driver.findElement(By.name("Request Equipment"));
        cont.click();
        GlobalUtil.wait(2);
        List<WebElement> address = (List<WebElement>)driver.findElement(By.xpath("//android.widget.TextView[contains(@id,'tv_list_item_existing_address_address')]"));
        address.get(0).click();
        GlobalUtil.wait(2);
        List<WebElement> equip = (List<WebElement>)driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@class,'android.widget.Button')]"));
        		//(By.xpath("//android.widget.Button[contains(@id,'com.weecode.portea.stage:id/bookButton')]"));
        equip.get(0).click();
        GlobalUtil.wait(2);
        WebElement getInTouchBtn = driver.findElement(By.id("com.weecode.portea.stage:id/btn_leadgen_submit"));
        GlobalUtil.wait(2);
        getInTouchBtn.click();
        GlobalUtil.wait(2);
        Assert.assertNotNull(servicesPage.getOrderConfirmationScreenLocator());
    }
    
    //@Test
    public void testVerifyAddPhysioAppointment()
    {
    	System.out.println("Verify that user should able to add appointment for Physio");
    	loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(5);
        homescreenpage.onClickServicesMenu();
        GlobalUtil.wait(2);
        servicesPage.onClickPhysio();
        GlobalUtil.wait(2);
        WebElement bookNowBtn = driver.findElement(By.name("BOOK NOW"));
        bookNowBtn.click();
        GlobalUtil.wait(2);
        WebElement address = driver.findElement(By.xpath("//"));
        GlobalUtil.wait(2);
        address.click();
        GlobalUtil.wait(2);
        WebElement selectSlots = driver.findElement(By.name("11:00 AM"));
        selectSlots.click();
        GlobalUtil.wait(2);
        WebElement bookAppt = driver.findElement(By.name("BOOK APPOINTMENT"));
        bookAppt.click();
        Assert.assertNotNull(driver.findElement(By.name("Appointment Details")));
        Assert.assertNotNull(driver.findElement(By.name("PAY NOW")));
        Assert.assertNotNull(driver.findElement(By.name("PAY LATER")));
        
    }
    
    //@Test
    public void testVerifyAddLabAppointment()
    {
    	System.out.println("Verify that user should able to add appointment for Lab");
    	loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(5);
        homescreenpage.onClickServicesMenu();
        GlobalUtil.wait(2);
        driver.scrollToExact("Lab Tests");
        GlobalUtil.wait(2);
        servicesPage.onClickLab();
        GlobalUtil.wait(2);
        WebElement bookNowBtn = driver.findElement(By.name("BOOK NOW"));
        bookNowBtn.click();
        GlobalUtil.wait(2);
        WebElement address = driver.findElement(By.xpath("//"));
        GlobalUtil.wait(2);
        address.click();
        WebElement selectLabTest = driver.findElement(By.xpath(""));
        selectLabTest.click();
        GlobalUtil.wait(2);
        WebElement continueBtn = driver.findElement(By.name(""));
        GlobalUtil.wait(2);
        WebElement selectSlots = driver.findElement(By.name("11:00 AM"));
        selectSlots.click();
        GlobalUtil.wait(2);
        WebElement bookAppt = driver.findElement(By.name("BOOK APPOINTMENT"));
        bookAppt.click();
        Assert.assertNotNull(driver.findElement(By.name("Appointment Details")));
        Assert.assertNotNull(driver.findElement(By.name("PAY NOW")));
        Assert.assertNotNull(driver.findElement(By.name("PAY LATER")));
        
    }
    @Test
    public void testVerifyAddNursingAppointment()
    {
    	System.out.println("Verify that user should able to add appointment for Nursing");
    	loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(5);
        homescreenpage.onClickServicesMenu();
        GlobalUtil.wait(2);
        driver.scrollToExact("Nursing");
        GlobalUtil.wait(2);
        servicesPage.onClickNursing();
        GlobalUtil.wait(2);
        WebElement bookNowBtn = driver.findElement(By.name("BOOK NOW"));
        bookNowBtn.click();
        GlobalUtil.wait(2);
        WebElement nursingServices = driver.findElement(By.name("12 Hours"));
        nursingServices.click();
        GlobalUtil.wait(2);
        WebElement age = driver.findElement(By.id("com.weecode.portea.stage:id/et_leadgen_age"));
        age.click();
        age.clear();
        age.sendKeys("30");
        GlobalUtil.wait(2);
        WebElement getInTouchBtn = driver.findElement(By.id("com.weecode.portea.stage:id/btn_leadgen_submit"));
        GlobalUtil.wait(2);
        getInTouchBtn.click();
        GlobalUtil.wait(5);
        Assert.assertNotNull(servicesPage.getOrderConfirmationScreenLocator());
    }
    
    @Test
    public void testVerifyAddAttendantsAppointment()
    {
    	System.out.println("Verify that user should able to add appointment for attendants");
    	loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(5);
        homescreenpage.onClickServicesMenu();
        GlobalUtil.wait(2);
        driver.scrollToExact("Attendants");
        GlobalUtil.wait(2);
        servicesPage.onClickAttendants();
        GlobalUtil.wait(2);
        WebElement bookNowBtn = driver.findElement(By.name("CONTINUE"));
        bookNowBtn.click();
        GlobalUtil.wait(2);
        WebElement nursingServices = driver.findElement(By.name("12 Hours"));
        nursingServices.click();
        GlobalUtil.wait(2);
        WebElement age = driver.findElement(By.id("com.weecode.portea.stage:id/et_leadgen_age"));
        age.click();
        age.clear();
        age.sendKeys("30");
        GlobalUtil.wait(2);
        WebElement getInTouchBtn = driver.findElement(By.id("com.weecode.portea.stage:id/btn_leadgen_submit"));
        GlobalUtil.wait(2);
        getInTouchBtn.click();
        GlobalUtil.wait(5);
        Assert.assertNotNull(servicesPage.getOrderConfirmationScreenLocator());
    }
    
    @Test
    public void testVerifyAddElderCareAppointment()
    {
    	System.out.println("Verify that user should able to add appointment for Elder care");
    	loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(5);
        homescreenpage.onClickServicesMenu();
        GlobalUtil.wait(2);
        driver.scrollToExact("Elder Care");
        GlobalUtil.wait(2);
        servicesPage.onClickElderCare();
        GlobalUtil.wait(2);
        WebElement bookNowBtn = driver.findElement(By.name("CONTINUE"));
        bookNowBtn.click();
        GlobalUtil.wait(2);
        WebElement age = driver.findElement(By.id("com.weecode.portea.stage:id/et_leadgen_age"));
        age.click();
        age.clear();
        age.sendKeys("30");
        GlobalUtil.wait(2);
        WebElement getInTouchBtn = driver.findElement(By.id("com.weecode.portea.stage:id/btn_leadgen_submit"));
        GlobalUtil.wait(2);
        getInTouchBtn.click();
        GlobalUtil.wait(5);
        Assert.assertNotNull(servicesPage.getOrderConfirmationScreenLocator());
    }
    
    @Test
    public void testVerifyAddPostNatalCareAppointment()
    {
    	System.out.println("Verify that user should able to add appointment for Post Natal care");
    	loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(5);
        homescreenpage.onClickServicesMenu();
        GlobalUtil.wait(2);
        driver.scrollToExact("Postnatal Care");
        GlobalUtil.wait(2);
        servicesPage.onClickPostNatalCare();
        GlobalUtil.wait(2);
        WebElement bookNowBtn = driver.findElement(By.name("CONTINUE"));
        bookNowBtn.click();
        GlobalUtil.wait(2);
        WebElement age = driver.findElement(By.id("com.weecode.portea.stage:id/et_leadgen_age"));
        age.click();
        age.clear();
        age.sendKeys("30");
        GlobalUtil.wait(2);
        WebElement getInTouchBtn = driver.findElement(By.id("com.weecode.portea.stage:id/btn_leadgen_submit"));
        GlobalUtil.wait(2);
        getInTouchBtn.click();
        GlobalUtil.wait(5);
        Assert.assertNotNull(servicesPage.getOrderConfirmationScreenLocator());
    }
    
    //@Test
    public void testVerifyAddDoctorAppointment()
    {
    	System.out.println("Verify that user should able to add appointment for doctor");
    	loginpage.skip();
        GlobalUtil.wait(2);
        loginpage.login(phoneNo, password);
        GlobalUtil.wait(3);
        homescreenpage.onClickServicesMenu();
        GlobalUtil.wait(2);
        driver.scrollToExact("Doctors");
        GlobalUtil.wait(2);
        servicesPage.onClickDoctor();
        GlobalUtil.wait(2);
        WebElement bookNowBtn = driver.findElement(By.name("BOOK NOW"));
        bookNowBtn.click();
        GlobalUtil.wait(2);
        WebElement address = driver.findElement(By.xpath("//"));
        GlobalUtil.wait(2);
        address.click();
        GlobalUtil.wait(2);
        WebElement selectSlots = driver.findElement(By.name("11:00 AM"));
        selectSlots.click();
        GlobalUtil.wait(2);
        WebElement bookAppt = driver.findElement(By.name("BOOK APPOINTMENT"));
        bookAppt.click();
        Assert.assertNotNull(driver.findElement(By.name("Appointment Details")));
        Assert.assertNotNull(driver.findElement(By.name("PAY NOW")));
        Assert.assertNotNull(driver.findElement(By.name("PAY LATER")));
        
    }
    
}
