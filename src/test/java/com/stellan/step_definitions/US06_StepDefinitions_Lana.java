package com.stellan.step_definitions;

import com.stellan.pages.HomePage;
import com.stellan.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.util.List;

public class US06_StepDefinitions_Lana {

    HomePage homePage = new HomePage();

    @When("users click the profile name")
    public void users_click_the_profile_name() {
        homePage.profileName.click();

    }

    @Then("verify the users see following 5 options:")
    public void verifyTheUsersSeeFollowing(List<String> expectedList) {
/*
     List<String> actualList = new ArrayList<>();

        for (WebElement each : homePage.actualListWebElements) {
            actualList.add(each.getText());
        }

        Assert.assertEquals(expectedList,actualList);
         }
         */
        BrowserUtils.sleep(1);
       List<String> actualList = BrowserUtils.getElementsText(homePage.actualListWebElements);

       Assert.assertEquals(expectedList,actualList);
    }


}


