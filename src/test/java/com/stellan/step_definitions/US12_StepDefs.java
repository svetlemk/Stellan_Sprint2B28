package com.stellan.step_definitions;

import com.stellan.pages.EmployeesPage;
import com.stellan.pages.LoginPage;
import com.stellan.utilities.ConfigurationReader;
import com.stellan.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US12_StepDefs {
    EmployeesPage employeesPage = new EmployeesPage();
    @Given("User is logged into NextBaseCRM")
    public void userIsLoggedIntoNextBaseCRM() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys("hr1@cybertekschool.com");
        loginPage.password.sendKeys("UserUser");
        loginPage.loginButton.click();
    }

    @When("User clicks onto Employees Page")
    public void userClicksOntoEmployeesPage() {
        employeesPage.EmployeesPage.click();
    }

    @Then("User will be able to view all modules")
    public void userWillBeAbleToViewAllModules() {
        Assert.assertTrue(employeesPage.CompanyStructureButton.isDisplayed());
        Assert.assertTrue(employeesPage.FindEmployeeButton.isDisplayed());
        Assert.assertTrue(employeesPage.TelephoneDirectoryButton.isDisplayed());
        Assert.assertTrue(employeesPage.StaffChangesButton.isDisplayed());
        Assert.assertTrue(employeesPage.EfficiencyReportButton.isDisplayed());
        Assert.assertTrue(employeesPage.HonoredEmployeesButton.isDisplayed());
        Assert.assertTrue(employeesPage.BirthdaysButton.isDisplayed());
        Assert.assertTrue(employeesPage.NewPageButton.isDisplayed());
    }
}
