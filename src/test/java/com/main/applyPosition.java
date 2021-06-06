package com.main;

import com.main.pages.CareersPage;
import com.main.pages.HomePage;
import com.main.pages.OpenPositionsPage;
import com.main.pages.PositionDetailPage;
import org.testng.annotations.Test;

public class applyPosition {

    @Test
    public void ApplyQAPosition() {
        HomePage homePage = new HomePage();
        CareersPage careersPage = new CareersPage();
        OpenPositionsPage openPositionsPage = new OpenPositionsPage();
        PositionDetailPage positionDetailPage = new PositionDetailPage();

        homePage
                .checkPageLoad()
                .clickMenu()
                .clickCareers();
        careersPage
                .checkOurStoryLoaded()
                .checkFindYourCallingLoaded()
                .checkOurLocationsLoaded()
                .checkLifeAtInsiderLoaded()
                .clickDreamJobButton();
        openPositionsPage
                .selectLocation()
                .selectDepartment()
                .checkPositionsNamesContains()
                .checkPositionsLocationsContains()
                .clickApplyNowButton();
        positionDetailPage
                .checkPositionDetailPageLoad();
    }
}