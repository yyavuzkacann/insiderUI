package com.main.pages;

import com.main.base.BaseMethods;

import java.util.ArrayList;

public class PositionDetailPage extends BaseMethods {
    public void checkPositionDetailPageLoad() {
        ArrayList<String> newTb = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));
    }
}
