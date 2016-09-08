package com.patientapp.pages;

import com.patientapp.common.BasePage;
import com.patientapp.common.GlobalUtil;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import java.util.*;

/**
 * Created by sapna on 8/24/2016.
 */
public class HealthFeedPage extends BasePage {
    public HealthFeedPage(AppiumDriver driver) {
        super(driver);
    }

    private final By filterLocator = By.name("filter");
    public By getFilterLocator()
    {
        return filterLocator;
    }

    private final By clearButtonLocator = By.name("Clear All");
    public By getClearButtonLocator()
    {
        return clearButtonLocator;
    }
    private final By saveButtonLocator = By.name("Save");
    public By getSaveButtonLocator()
    {
        return saveButtonLocator;
    }
    private final By categoryCheckBoxLocator = By.id("com.weecode.portea.stage:id/category_checked");
    public By getCategoryCheckBoxLocator()
    {
        return categoryCheckBoxLocator;
    }
    private final By categoryLocator = By.id("com.weecode.portea.stage:id/category_name");
    public By getCategoryLocator()
    {
        return categoryLocator;
    }

    private final By shareArticleLocator = By.id("com.weecode.portea.stage:id/share_iv");
    public By getShareArticleLocator()
    {
        return shareArticleLocator;
    }
    private final By likeArticleLocator = By.id(" com.weecode.portea.stage:id/like_iv");
    public By getLikeArticleLocator()
    {
        return likeArticleLocator;
    }
    private final By bookMarkArticleLocator = By.id("com.weecode.portea.stage:id/bookmark_iv");
    public By getBookMarkArticleLocator()
    {
        return bookMarkArticleLocator;
    }


    public void onClickFilter()
    {
        WebElement filter = driver.findElement(filterLocator);
        filter.click();

    }

    public void selectFilter(String filter)
    {
        java.util.List<WebElement> listView = driver.findElements(categoryCheckBoxLocator);
        listView.get(0).click();
        GlobalUtil.wait(2);
//        WebElement select = category.findElement(categoryCheckBoxLocator);
//        select.click();
        WebElement save = driver.findElement(saveButtonLocator);
        save.click();
    }

    public void likeArticle()
    {
        java.util.List<WebElement> listView = driver.findElements(By.xpath("//android.widget.LinearLayout[contains(@class,'android.widget.ImageView')]"));
        listView.get(0).click();
    }

    public void shareArticle()
    {
        java.util.List<WebElement> listView = driver.findElements(By.xpath("//android.widget.LinearLayout[contains(@class,'android.widget.ImageView')]"));
        listView.get(2).click();
    }

    public void bookMarkArticle()
    {
        java.util.List<WebElement> listView = driver.findElements(By.xpath("//android.widget.RelativeLayout[contains(@class,'android.widget.ImageView')]"));
        listView.get(1).click();
    }

    public String getLikeCount()
    {
        WebElement likeCount = driver.findElement(By.id("com.weecode.portea.stage:id/like_no_tv"));
        return likeCount.getText();
    }

    public  String increaseLikeCount()
    {
        WebElement likeCount = driver.findElement(By.id("com.weecode.portea.stage:id/like_no_tv"));
        return likeCount.getText();

    }


}
