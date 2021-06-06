package com.main.pages;

import com.main.base.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class CareersPage extends BaseMethods {
    WebElement LBL_OUR_STORY = driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-0c06ebc elementor-widget elementor-widget-heading']"));
    WebElement LBL_FIND_YOUR_CALLING = driver.findElement(By.xpath("//div[@class='col-12 mb-xl-5 py-xl-4 py-2 text-center']"));
    WebElement LBL_OUR_LOCATIONS = driver.findElement(By.xpath("//div[@class='col-12 col-md-6']"));
    WebElement LBL_LIFE_AT_INSIDER = driver.findElement(By.xpath("//div[@class='elementor-column-wrap elementor-element-populated']//h2[text()='Life at Insider']"));
    WebElement BTN_FIND_DREAM_JOB = driver.findElement(By.xpath("(//a[text()='Find your dream job'])[2]"));

    public CareersPage checkOurStoryLoaded() {
        Assert.assertTrue(LBL_OUR_STORY.isDisplayed());
        return this;
    }

    public CareersPage checkFindYourCallingLoaded() {
        Assert.assertTrue(LBL_FIND_YOUR_CALLING.isDisplayed());
        return this;
    }

    public CareersPage checkOurLocationsLoaded() {
        Assert.assertTrue(LBL_OUR_LOCATIONS.isDisplayed());
        return this;
    }

    public CareersPage checkLifeAtInsiderLoaded() {
        Assert.assertTrue(LBL_LIFE_AT_INSIDER.isDisplayed());
        return this;
    }

    public CareersPage clickDreamJobButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", BTN_FIND_DREAM_JOB);
        BTN_FIND_DREAM_JOB.click();
        return this;
    }
}
