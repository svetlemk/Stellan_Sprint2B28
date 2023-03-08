package com.stellan.step_definitions;

import com.stellan.pages.CRM_log_out;
import com.stellan.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US03_Yuriy_StepDef {

    CRM_log_out crmLogOut = new CRM_log_out();

    @When("users click the user profile name")
    public void usersClickTheUserProfileName() {

        crmLogOut.user_btn.click();

    }

    @And("users select the “Log Out” option")
    public void usersSelectTheLogOutOption() {

        crmLogOut.log_out_btn.click();
    }

    @Then("verify the user back to the login page")
    public void verifyTheUserBackToTheLoginPage() {

        BrowserUtils.verifyTitle("Authorization");
    }
}
