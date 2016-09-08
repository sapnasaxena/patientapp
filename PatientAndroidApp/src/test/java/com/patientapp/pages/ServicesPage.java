package com.patientapp.pages;

import com.patientapp.common.BasePage;
import com.patientapp.common.GlobalUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import io.appium.java_client.AppiumDriver;

/**
 * Created by sapna on 8/26/2016.
 */
public class ServicesPage extends BasePage {
    public ServicesPage(AppiumDriver driver) {
        super(driver);
    }

    private final By physioLocator = By.name("service_physiotheraphy");
    private final By bookNowButtonLocator = By.name("BOOK NOW");
    public By getBookNowButtonLocator()
    {
        return bookNowButtonLocator;
    }
    
    private final By nursingLocator = By.name("service_nursing");
    public By getNursingLocator()
    {
    	return nursingLocator;
    }
    private final By postNatalCareLocator = By.name("service_postnatal");
    public By getPostNatalCareLocator()
    {
    	return postNatalCareLocator;
    }
    

    private final By pharmacyLocator = By.name("service_pharmacy");
    public By getPharmacyLocator()
    {
        return pharmacyLocator;
    }

    private final By vaccinationLocator = By.name("service_vaccination");
    public By getVaccinationLocator()
    {
        return vaccinationLocator;
    }

    private final By orderConfirmationScreenLocator = By.name("Thank You");
    public By getOrderConfirmationScreenLocator()
    {
        return orderConfirmationScreenLocator;
    }

    private final By equipmentLocator = By.name("service_equipment");
    public By getEquipmentLocator()
    {
        return equipmentLocator;
    }

    private final By orderIDLocator = By.id("");
    public By getOrderIDLocator()
    {
        return orderIDLocator;
    }
    public void onClickBookNowButton()
    {
        WebElement ele = driver.findElement(bookNowButtonLocator);
        ele.click();
    }

    public void onClickPharmacy()
    {
        WebElement ele = driver.findElement(pharmacyLocator);
        ele.click();
    }

    public void onClickEquipment()
    {
        WebElement ele = driver.findElement(equipmentLocator);
        ele.click();
    }

    public void onClickVaccination()
    {
        WebElement ele = driver.findElement(vaccinationLocator);
        ele.click();
    }

    public void bookPharmacy()
    {
        WebElement request = driver.findElement(By.name("REQUEST NOW"));
        request.click();
        GlobalUtil.wait(2);
        List<WebElement> address = (List<WebElement>) driver.findElement(By.xpath(""));
        address.get(0);
        GlobalUtil.wait(2);
        WebElement search = driver.findElement(By.name("Search medicines"));
        search.sendKeys("Crocin");
        Select listView = new Select((WebElement) driver.findElements(By.id("com.weecode.portea.stage:id/cart_list")));
        listView.selectByVisibleText("CROCIN ADVANCE 500MG TAB");
        GlobalUtil.wait(2);
        WebElement cont = driver.findElement(By.name("CONTINUE"));
        cont.click();
        WebElement selectpres = driver.findElement(By.name("Select from Request History"));
        selectpres.click();
        cont.click();
        WebElement placeRequest = driver.findElement(By.name("PLACE REQUEST"));
        placeRequest.click();


    }
    
    public void onClickPhysio()
    {
    	WebElement ele = driver.findElement(physioLocator);
    	ele.click();
    }
    
    public void onClickNursing()
    {
    	WebElement ele = driver.findElement(nursingLocator);
    	ele.click();
    }
    
    
    public void onClickPostNatalCare()
    {
    	WebElement ele = driver.findElement(postNatalCareLocator);
    	ele.click();
    }
    
    private final By elderCareLocator = By.name("service_eldercare");
    public By getElderCareLocator()
    {
    	return elderCareLocator;
    }
    
    public void onClickElderCare()
    {
    	WebElement ele = driver.findElement(elderCareLocator);
    	ele.click();
    }
    
    private final By attendantLocator = By.name("service_attendant");
    public By getAttendantsLocator()
    {
    	return attendantLocator;
    }
    
    public void onClickAttendants()
    {
    	WebElement ele = driver.findElement(attendantLocator);
    	ele.click();
    }
    
    private final By labLocator = By.name("service_lab");
    public By getLabLocator()
    {
    	return labLocator;
    }
    
    public void onClickLab()
    {
    	WebElement ele = driver.findElement(labLocator);
    	ele.click();
    }

    private final By doctorLocator = By.name("service_doctor");
    public By getDoctorLocator()
    {
    	return doctorLocator;
    }
    
    public void onClickDoctor()
    {
    	WebElement ele = driver.findElement(doctorLocator);
    	ele.click();
    }

}
