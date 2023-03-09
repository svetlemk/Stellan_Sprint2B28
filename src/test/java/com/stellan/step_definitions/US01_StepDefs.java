package com.stellan.step_definitions;

import com.stellan.pages.LoginPage;
import com.stellan.utilities.ConfigurationReader;
import com.stellan.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US01_StepDefs {

    @Given("User is on the log in page")
    public void user_is_on_the_log_in_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    LoginPage loginPage = new LoginPage();

    @When("User enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String username, String password) {

        loginPage.login(username,password);

    }


    @Then("User see {string} message")
    public void userSeeMessage(String expectedMessage) {

        String actualMessage = loginPage.errorMessage.getText();

        Assert.assertEquals(actualMessage, expectedMessage);


    }


    @Then("User should see correct title")
    public void userShouldSeeDashboard() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Portal";

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    @When("User enter username {string} and password {string}")
    public void userEnterUsernameAndPassword(String username, String password) {
        loginPage.login(username,password);
    }
}
