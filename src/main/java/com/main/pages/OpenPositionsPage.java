package com.main.pages;

import com.main.base.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class OpenPositionsPage extends BaseMethods {
    Select CMB_LOCATION = new Select(driver.findElement(By.xpath("//select[@id='filter-by-location']")));
    Select CMB_DEPARTMENT = new Select(driver.findElement(By.xpath("//select[@id='filter-by-department']")));
    List<WebElement> LBL_POSITION_NAMES = driver.findElements(By.xpath("//p[@class='position-title font-weight-bold']"));
    List<WebElement> LBL_POSITION_LOCATIONS = driver.findElements(By.xpath("//div[@class='position-location text-large']"));
    WebElement BTN_APPLY_NOW = driver.findElement(By.xpath("(//a[text()='Apply Now'])[1]"));

    public OpenPositionsPage selectLocation(){
        CMB_LOCATION.selectByValue("Istanbul, Turkey");
        return this;
    }

    public OpenPositionsPage selectDepartment(){
        CMB_DEPARTMENT.selectByValue("Quality Assurance");
        return this;
    }

    public OpenPositionsPage checkPositionsNamesContains(){
        for(WebElement position : LBL_POSITION_NAMES){
            if(!position.getText().contains("Quality Assurance"))
                Assert.fail("Position's name does not contain Quality Assurance");
        }
        return this;
    }

    public OpenPositionsPage checkPositionsLocationsContains(){
        for(WebElement position : LBL_POSITION_LOCATIONS){
            if(!position.getText().contains("Istanbul, Turkey"))
                Assert.fail("Position's location does not contain Istanbul, Turkey");
        }
        return this;
    }

    public OpenPositionsPage clickApplyNowButton(){
        BTN_APPLY_NOW.click();
        return this;
    }
}
