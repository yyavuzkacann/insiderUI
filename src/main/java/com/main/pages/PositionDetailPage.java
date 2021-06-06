package com.main.pages;

import com.main.base.BaseMethods;
import org.testng.Assert;

import java.util.ArrayList;

import static com.main.base.Constants.positionDetailExpectedTitle;

public class PositionDetailPage extends BaseMethods {
    public void checkPositionDetailPageLoad() {
        ArrayList<String> newTb = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));
        Assert.assertEquals(driver.getTitle(), positionDetailExpectedTitle);
    }
}
