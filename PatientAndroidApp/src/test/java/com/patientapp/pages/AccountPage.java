package com.patientapp.pages;

import com.patientapp.common.BasePage;
import com.patientapp.common.GlobalUtil;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;

/**
 * Created by sapna on 8/25/2016.
 */
public class AccountPage  extends BasePage{
    public AccountPage(AppiumDriver driver) {
        super(driver);
    }

    private final By myAppointmentsLocator = By.name("My Appointments");
    public By getMyAppointmentsLocator()
    {
        return myAppointmentsLocator;
    }
    private final By myHealthRecordsLocator = By.name("My Health Records");
    public By getMyHealthRecordsLocator()
    {
        return myHealthRecordsLocator;
    }
    private final By myPaymentsLocator = By.name("My Payments");
    public By getMyPaymentsLocator()
    {
        return myPaymentsLocator;
    }
    private final By porteaWalletLocator = By.name("Portea Wallet");
    public By getPorteaWalletLocator()
    {
        return porteaWalletLocator;
    }
    private final By pharmacyRequestLocator = By.name("Pharmacy Requests");
    public By getPharmacyRequestLocator()
    {
        return pharmacyRequestLocator;
    }
    private final By porteaCherishLocator = By.name("Portea Cherish");
    public By getPorteaCherishLocator()
    {
        return porteaCherishLocator;
    }
    private final By bookmarkedArticles = By.name("Bookmarked Articles");
    public By getBookmarkedArticles()
    {
        return bookmarkedArticles;
    }

    private final By bookmarksOnBookmarkScreenLocator = By.className("android.support.v4.widget.DrawerLayout");
    public By getBookmarksOnBookmarkScreenLocator()
    {
        return bookmarksOnBookmarkScreenLocator;
    }

    private final By addWalletButtonLocator = By.name("Add Wallet");
    public By getAddWalletButtonLocator()
    {
        return addWalletButtonLocator;
    }

    private final By confirmButtonLocator = By.name("Confirm");
    public By getConfirmButtonLocator()
    {
        return confirmButtonLocator;
    }
    private final By walletScreenLocator = By.name("Wallet");
    public By getWalletScreenLocator()
    {
        return walletScreenLocator;
    }
    private final By loadWalletButtonLocator = By.name("Load Wallet");
    public By getLoadWalletButtonLocator()
    {
        return loadWalletButtonLocator;
    }

    private final By balanceAmountLocator = By.id("com.weecode.portea.stage:id/balanceAmount");
    public By getBalanceAmountLocator()
    {
        return balanceAmountLocator;
    }
    private final By walletBalanceLocator = By.id("com.weecode.portea.stage:id/cash");
    public By getWalletBalanceLocator()
    {
        return walletBalanceLocator;
    }
    private final By voucherBalanceLocator = By.id("com.weecode.portea.stage:id/vouchers");
    public By getVoucherBalanceLocator()
    {
        return voucherBalanceLocator;
    }
    private final By backButtonLocator = By.name("Navigate up");
    public By getBackButtonLocator()
    {
        return backButtonLocator;
    }

    private final By netBankingLocator = By.name("NET BANKING");
    public By getNetBankingLocator()
    {
        return netBankingLocator;
    }

    private final By savedCardsLocator = By.name("SAVED CARDS");
    public By getSavedCardsLocator()
    {
        return savedCardsLocator;
    }
    private final By cardsLocator = By.name("CARD");
    public By getCardsLocator()
    {
        return cardsLocator;
    }

    private  final By apptDateLocator = By.id("com.weecode.portea.stage:id/date");
    private final By totalBalanceAmountOnPayments = By.id("com.weecode.portea.stage:id/totalBalanceAmount");
    private final By paidTabLocator = By.name("PAID");
    public By getPaidTabLocator()
    {
        return paidTabLocator;
    }

    private final By unBilledTabLocator = By.name("UNBILLED");
    public By getUnBilledTabLocator()
    {
    	return unBilledTabLocator;
    }
    
    private final By billedTabLocator = By.name("BILLED");
    public By getBilledTabLocator()
    {
    	return billedTabLocator;
    }
    
    
 

    public void onClickBookmarkedArticles()
    {
        WebElement ele = driver.findElement(bookmarkedArticles);
        ele.click();
    }
    public void getBookmarkedArticlesOnBookmarkScreen()
    {
        java.util.List<WebElement> listView = (java.util.List<WebElement>) driver.findElement(By.xpath("//android.widget.FrameLayout"));
        listView.get(1);

    }
    public void viewBookMarks()
    {
        java.util.List<WebElement> listView = driver.findElements(bookmarksOnBookmarkScreenLocator);
        listView.get(0);
    }

    public void onClickMyAppointments()
    {
        WebElement ele = driver.findElement(myAppointmentsLocator);
        ele.click();
    }
    public void onClickMyHealthRecords()
    {
        WebElement ele = driver.findElement(myHealthRecordsLocator);
        ele.click();
    }

    public void onClickMyPayments()
    {
//        java.util.List<WebElement> ls = driver.findElements(By.xpath("//android.widget.ScrollView[contains(@class,'android.view.View')]"));
//        ls.get(5).click();
//        GlobalUtil.wait(1);
        WebElement ele = driver.findElement(myPaymentsLocator);
                //driver.findElement(By.xpath("//android.view.View[contains(@class,'android.widget.TextView') and contains(@name,'My Payments')]"));
        ele.click();
    }

    public void onClickPorteaWallet()
    {
        WebElement ele = driver.findElement(porteaWalletLocator);
        ele.click();
    }

    public void onClickPharmacyRequests()
    {
        WebElement ele = driver.findElement(pharmacyRequestLocator);
        ele.click();
    }

    public void onClickPorteaCherish()
    {
        WebElement ele = driver.findElement(porteaCherishLocator);
        ele.click();
    }

    public void onClickTransactionsTab()
    {
        WebElement ele = driver.findElement(By.name("TRANSACTIONS"));
        ele.click();
    }

    public void onClickMyPrescriptions() {
        WebElement ele = driver.findElement(porteaCherishLocator);
        ele.click();
    }

    public void onClickAddWallet()
    {
        WebElement ele = driver.findElement(By.name("ADD WALLET"));
        ele.click();
    }
    public void addWallet()
    {
        WebElement ele = driver.findElement(By.name("Confirm"));
        GlobalUtil.wait(5);
    }

    public void loadWalletBySavedCards()
    {
        WebElement ele = driver.findElement(By.id("com.weecode.portea.stage:id/et_amount"));
        ele.sendKeys("10");
        GlobalUtil.wait(2);
        WebElement load = driver.findElement(loadWalletButtonLocator);
        load.click();
        GlobalUtil.wait(2);
        WebElement savedCards = driver.findElement(By.name("Portea"));
        savedCards.click();
        GlobalUtil.wait(2);
        WebElement cvv = driver.findElement(By.name("CVV"));
        cvv.click();
        		//(By.id("245955988732"));
        cvv.sendKeys("316");
        GlobalUtil.wait(2);
        WebElement payBtn = driver.findElement(By.name("PAY"));
        payBtn.click();
        Assert.assertTrue(true, "Payments");
        GlobalUtil.wait(3);
        WebElement password = driver.findElement(By.name("Password"));
        password.click();
        password.sendKeys("portea123");
        Assert.assertTrue(true,"Wallet");

    }

    public void loadWalletByCard()
    {
        WebElement ele = driver.findElement(By.id("com.weecode.portea.stage:id/et_amount"));
        ele.sendKeys("10");
        GlobalUtil.wait(2);
        WebElement load = driver.findElement(loadWalletButtonLocator);
        load.click();
        GlobalUtil.wait(2);
        WebElement cardTab = driver.findElement(cardsLocator);
        cardTab.click();
        GlobalUtil.wait(2);
        WebElement savedCards = driver.findElement(By.name("Portea"));
        savedCards.click();
        GlobalUtil.wait(2);
        WebElement cvv = driver.findElement(By.id("245955988732"));
        cvv.sendKeys("136");
        GlobalUtil.wait(2);
        WebElement payBtn = driver.findElement(By.name("PAY"));
        payBtn.click();

    }

    public void onClickAnyAppointments()
    {
    	 WebElement ls = driver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'Package ID')]"));//("Package ID"));
         ls.click();
    }
    
    public void selectPackageForPayment()
    {
    	 WebElement ls = driver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'Package ID')]"));//("Package ID"));
         ls.click();
         GlobalUtil.wait(2);
         WebElement pay = driver.findElement(By.name("Pay Now"));
         pay.click();
         GlobalUtil.wait(2);
         WebElement enterAmount = driver.findElement(By.id("com.weecode.portea.stage:id/amount"));
         enterAmount.click();
         enterAmount.clear();
         enterAmount.sendKeys("1");
         GlobalUtil.wait(2);
         driver.hideKeyboard();
    }

    public void payByWallet()
    {
        //WebElement ls = driver.findElement(By.xpath("//android.widget.TextView[contains(@id,'com.weecode.portea.stage:id/packageIdText')]/android.widget.LinearLayout"));
//        System.out.println("debug starts");
//
//        WebElement ls = driver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'Package ID')]"));//("Package ID"));
//        ls.click();
//        GlobalUtil.wait(2);
//        WebElement pay = driver.findElement(By.name("Pay Now"));
//        pay.click();
//        GlobalUtil.wait(2);
//        WebElement enterAmount = driver.findElement(By.id("com.weecode.portea.stage:id/amount"));
//        enterAmount.click();
//        enterAmount.clear();
   //     enterAmount.sendKeys("1");
    	selectPackageForPayment();
        GlobalUtil.wait(2);
        WebElement walletOption = driver.findElement(By.id("com.weecode.portea.stage:id/walletRadioButton"));
        walletOption.click();
        GlobalUtil.wait(2);
        WebElement payBtn = driver.findElement(By.id("com.weecode.portea.stage:id/proceedButton"));
        payBtn.click();
    }

    public void payByNetBanking()
    {
    	selectPackageForPayment();
        GlobalUtil.wait(2);
        driver.scrollToExact("NetBanking");
        GlobalUtil.wait(2);
        WebElement netOption = driver.findElement(By.id("com.weecode.portea.stage:id/netRadio"));
        netOption.click();
        GlobalUtil.wait(2);
        WebElement payBtn = driver.findElement(By.id("com.weecode.portea.stage:id/proceedButton"));
        payBtn.click();
        GlobalUtil.wait(2);
        payBtn.click();
     
    }

    public void payByCard()
    {
    	selectPackageForPayment();
        GlobalUtil.wait(2);
        driver.scrollToExact("Cards");
        GlobalUtil.wait(2);
        WebElement netOption = driver.findElement(By.id("com.weecode.portea.stage:id/cardsRadio"));
        netOption.click();
        GlobalUtil.wait(2);
        WebElement proceed = driver.findElement(By.id("com.weecode.portea.stage:id/proceedButton"));
        proceed.click();
        GlobalUtil.wait(2);
        WebElement cardNo = driver.findElement(By.id("com.weecode.portea.stage:id/cardNumber"));
        cardNo.sendKeys("4077069018497201");
        GlobalUtil.wait(2);
        WebElement mm = driver.findElement(By.id("com.weecode.portea.stage:id/cardMonth"));
        mm.click();
        mm.sendKeys("10");
        GlobalUtil.wait(2);
        WebElement yy = driver.findElement(By.id("com.weecode.portea.stage:id/cardYear"));
        yy.click();
        yy.sendKeys("16");
        GlobalUtil.wait(2);
        WebElement cvv = driver.findElement(By.id("com.weecode.portea.stage:id/cardCvv"));
        cvv.sendKeys("316");
        GlobalUtil.wait(2);
        WebElement cardName = driver.findElement(By.id("com.weecode.portea.stage:id/cardName"));
        cardName.sendKeys("Portea");
        GlobalUtil.wait(2);
        driver.hideKeyboard();
        GlobalUtil.wait(1);
        WebElement payBtn = driver.findElement(By.name("Proceed"));
        payBtn.click();
        GlobalUtil.wait(3);
        WebElement submit = driver.findElement(By.name("Submit"));
        submit.click();
    }

    public void payByPaytm()
    {
//        //        List<WebElement> ele = (List<WebElement>) driver.findElements(By.xpath("//android.support.v4.view.ViewPager[contains(@class,'android.widget.LinearLayout')]"));
////        ele.get(0).click();
//        WebElement ls = driver.findElement(By.xpath("//android.widget.FrameLayout[contains(@id,'com.weecode.portea.stage:id/packageIdText')]/android.widget.LinearLayout"));
//        ls.click();
//        GlobalUtil.wait(2);
//        WebElement pay = driver.findElement(By.name("Pay Now"));
//        pay.click();
//        GlobalUtil.wait(2);
//        WebElement enterAmount = driver.findElement(By.id("com.weecode.portea.stage:id/amount"));
//        enterAmount.sendKeys("1");
    	selectPackageForPayment();
        GlobalUtil.wait(3);
        WebElement paytmOption = driver.findElement(By.id("com.weecode.portea.stage:id/paytmRadio"));
        GlobalUtil.wait(1);
        paytmOption.click();
        GlobalUtil.wait(2);
        driver.scrollToExact("Pay Rs 1");
        GlobalUtil.wait(1);
        WebElement payBtn = driver.findElement(By.id("com.weecode.portea.stage:id/proceedButton"));
        payBtn.click();
        GlobalUtil.wait(3);
        //paytm page login
        WebElement login = driver.findElement(By.name("Login"));
        login.click();
        GlobalUtil.wait(2);
        WebElement mobNo = driver.findElement(By.name("Enter your Mobile or Email"));
        mobNo.sendKeys("7777777777");
        GlobalUtil.wait(2);
        WebElement pwd = driver.findElement(By.name("Password"));
        		//(By.xpath("//android.widget.EditText[contains(@text,'Password')]"));
        pwd.sendKeys("Paytm12345");
        GlobalUtil.wait(2);
        driver.hideKeyboard();
        GlobalUtil.wait(2);
        WebElement signIn = driver.findElement(By.name("Secure Sign In"));
        signIn.click();
        GlobalUtil.wait(2);
        WebElement payNw = driver.findElement(By.name("Pay now"));
        payNw.click();

    }

}


