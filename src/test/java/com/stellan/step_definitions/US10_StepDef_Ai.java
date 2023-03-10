package com.stellan.step_definitions;

import com.stellan.pages.DrivePage_Ai;
import com.stellan.pages.HomePage;
import com.stellan.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US10_StepDef_Ai {

    DrivePage_Ai drivePage_ai = new DrivePage_Ai();

    @When("User clicks on the Drive icon on the homepage")
    public void userClicksOnTheDriveIconOnTheHomepage() {
        drivePage_ai.drivePageIcon.click();
    }
    @Then("Verify if user sees all following 6 modules:")
    public void verifyIfUserSeesAllFollowingModules(List<String> expectedList) {

        List<String> actualList = BrowserUtils.getElementsText(drivePage_ai.actualListDriveModules);

        Assert.assertEquals(expectedList,actualList);

    }



    }

