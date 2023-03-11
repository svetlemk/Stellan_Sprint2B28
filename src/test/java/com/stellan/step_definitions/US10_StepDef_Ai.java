package com.stellan.step_definitions;

import com.stellan.pages.HomePage;
import com.stellan.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US10_StepDef_Ai {

    HomePage homePage = new HomePage();

    @When("User clicks on the Drive icon on the homepage")
    public void userClicksOnTheDriveIconOnTheHomepage() {
        homePage.drivePageIcon.click();
    }
    @Then("Verify if user sees all following 6 modules:")
    public void verifyIfUserSeesAllFollowingModules(List<String> expectedList) {

        List<String> actualList = BrowserUtils.getElementsText(homePage.actualListDriveModules);

        Assert.assertEquals(expectedList,actualList);

    }



    }

