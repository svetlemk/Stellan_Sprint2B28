package com.stellan.step_definitions;

import com.stellan.pages.LoginPage;
import com.stellan.utilities.ConfigurationReader;
import com.stellan.utilities.Driver;
import io.cucumber.java.en.And;
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
    @When("User enters username")
    public void user_enters_username() {

        loginPage.username.sendKeys("hr1@cybertekschool.com");

    }
    @When("User enters password")
    public void user_enters_password() {

        loginPage.password.sendKeys("UserUser");

    }
    @Then("User clicks Log in button")
    public void user_clicks_button() {

        loginPage.loginButton.click();

    }


    @When("User enters username {string}")
    public void userEntersUsername(String arg0) {
        loginPage.username.sendKeys(arg0);
    }

    @And("User enters password {string}")
    public void userEntersPassword(String arg0) {
        loginPage.password.sendKeys(arg0);
    }


    @Then("User clicks Log in button and see correct title")
    public void userClicksLogInButtonAndSeeCorrectTitle() {
        loginPage.loginButton.click();

        Driver.closeDriver();
    }
}
