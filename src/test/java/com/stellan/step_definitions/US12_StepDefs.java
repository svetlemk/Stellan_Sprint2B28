package com.stellan.step_definitions;

import com.stellan.pages.HomePage;
import com.stellan.pages.LoginPage;
import com.stellan.utilities.ConfigurationReader;
import com.stellan.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US12_StepDefs {
   HomePage homepage = new HomePage();
    @Given("User is logged into NextBaseCRM")
    public void userIsLoggedIntoNextBaseCRM() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys("hr1@cybertekschool.com");
        loginPage.password.sendKeys("UserUser");
        loginPage.loginButton.click();
    }

    @When("user clicks onto Employees page")
    public void userClicksOntoEmployeesPage() {
        homepage.EmployeesPage.click();
    }

    @Then("User will be able to view all modules")
    public void userWillBeAbleToViewAllModules() {
        Assert.assertTrue(homepage.CompanyStructureButton.isDisplayed());
        Assert.assertTrue(homepage.FindEmployeeButton.isDisplayed());
        Assert.assertTrue(homepage.TelephoneDirectoryButton.isDisplayed());
        Assert.assertTrue(homepage.StaffChangesButton.isDisplayed());
        Assert.assertTrue(homepage.EfficiencyReportButton.isDisplayed());
        Assert.assertTrue(homepage.HonoredEmployeesButton.isDisplayed());
        Assert.assertTrue(homepage.BirthdaysButton.isDisplayed());
        Assert.assertTrue(homepage.NewPageButton.isDisplayed());
    }
}
