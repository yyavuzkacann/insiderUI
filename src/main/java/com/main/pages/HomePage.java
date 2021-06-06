package com.main.pages;

import com.main.base.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.main.base.Constants.expectedTitle;

public class HomePage extends BaseMethods {
    WebElement BTN_MENU = driver.findElement(By.xpath("//span[text()='More']"));
    WebElement BTN_CAREERS = driver.findElement(By.xpath("//h5[text()='Careers']"));

    public HomePage checkPageLoad() {
        Assert.assertEquals(driver.getTitle(), expectedTitle);
        return this;
    }

    public HomePage clickMenu() {
        BTN_MENU.click();
        return this;
    }

    public void clickCareers() {
        BTN_CAREERS.click();
    }
}
