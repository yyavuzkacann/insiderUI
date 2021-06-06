package com.main;

import com.main.pages.CareersPage;
import com.main.pages.HomePage;
import com.main.pages.OpenPositionsPage;
import com.main.pages.PositionDetailPage;
import org.testng.annotations.Test;

public class applyPosition {

    @Test(priority=0)
    public void GoToCareers() {
        HomePage homePage = new HomePage();
        homePage
                .checkPageLoad()
                .clickMenu()
                .clickCareers();

    }

    @Test(priority=1)
    public void GoToDreamJob() {
        CareersPage careersPage = new CareersPage();
        careersPage
                .checkOurStoryLoaded()
                .checkFindYourCallingLoaded()
                .checkOurLocationsLoaded()
                .checkLifeAtInsiderLoaded()
                .clickDreamJobButton();
    }

    @Test(priority=2)
    public void CheckPosition() {
        OpenPositionsPage openPositionsPage = new OpenPositionsPage();
        openPositionsPage
                .selectLocation()
                .selectDepartment()
                .checkPositionsNamesContains()
                .checkPositionsLocationsContains()
                .clickApplyNowButton();
    }

    @Test(priority=3)
    public void ApplyPosition() {
        PositionDetailPage positionDetailPage = new PositionDetailPage();
        positionDetailPage
                .checkPositionDetailPageLoad();
    }
}