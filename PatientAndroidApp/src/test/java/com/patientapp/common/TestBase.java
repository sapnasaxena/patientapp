package com.patientapp.common;
import com.patientapp.pages.AccountPage;
import com.patientapp.pages.HealthFeedPage;
import com.patientapp.pages.HomeScreenPage;
import com.patientapp.pages.LoginPage;
import com.patientapp.pages.MoreOptionsPage;
import com.patientapp.pages.RegistrationPage;
import com.patientapp.pages.ServicesPage;
import com.patientapp.common.GlobalUtil;
import com.patientapp.common.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;



/**
 * Created by sapna on 6/17/2016.
 */
public class TestBase {
    public static AppiumDriver driver;
    protected LoginPage loginpage;
    protected HomeScreenPage homescreenpage;
    protected RegistrationPage registrationPage;
    protected HealthFeedPage healthFeedPage;
    protected AccountPage accountPage;
    protected MoreOptionsPage moreOptionsPage;
    protected ServicesPage servicesPage;
    protected DesiredCapabilities capabilities;
//    protected ProfilePage profilepage;
//    protected AppointmentPage appointmentpage;

    @BeforeClass(alwaysRun=true)
    public void setUp() throws Exception {
        File app = new File(System.getProperty("user.dir")+"/src/test/resources/android","PA-4.0-stage-armeabi-v7a-release.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "21.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Micromax Q450");
        capabilities.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY,"com.weecode.portea.activities.SplashActivity");
        capabilities.setCapability(MobileCapabilityType.APP_PACKAGE,"com.weecode.portea.stage");
        capabilities.setCapability(MobileCapabilityType.APP_WAIT_ACTIVITY,"com.weecode.portea.activities.SplashActivity");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4327/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    protected void ensureLogin(String phoneNumber, String password){

        GlobalUtil.wait(2);
        loginpage = new LoginPage(driver);
        loginpage.login(phoneNumber, password);

    }

    @AfterClass(alwaysRun=true)
    public void cleanUp(){
        try{
            if(driver != null){
                driver.quit();

            }
        }finally{
            driver = null;
        }
    }    
   
}
