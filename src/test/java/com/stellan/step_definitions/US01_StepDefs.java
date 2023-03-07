package com.stellan.step_definitions;

import com.stellan.pages.CRM_log_out;
import com.stellan.pages.Company_btn_menu;
import com.stellan.pages.LoginPage;
import com.stellan.utilities.BrowserUtils;
import com.stellan.utilities.ConfigurationReader;
import com.stellan.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

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

    }

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

        BrowserUtils.verifyTitleContains("logout=yes");
    }

    Company_btn_menu companyBtnMenu = new Company_btn_menu();
    @When("users click the Company module")
    public void usersClickTheCompanyModule() {

        companyBtnMenu.company_btn.click();

    }

    @Then("verify the users see flowing {int} options:")
    public void verifyTheUsersSeeFlowingOptions(int arg0) {

        String expected_menu_button_1 = "Official Information";
        WebElement actual_menu_button_1 = companyBtnMenu.Official_Info_btn;
        String expected_menu_button_2 = "Our Life";
        WebElement actual_menu_button_2 = companyBtnMenu.Our_Life_btn;
        String expected_menu_button_3 = "About Company";
        WebElement actual_menu_button_3 = companyBtnMenu.About_btn;
        String expected_menu_button_4 = "Photo Gallery";
        WebElement actual_menu_button_4 = companyBtnMenu.Photo_Gal_btn;
        String expected_menu_button_5 = "Career";
        WebElement actual_menu_button_5 = companyBtnMenu.Career_btn;
        String expected_menu_button_6 = "Video";
        WebElement actual_menu_button_6 = companyBtnMenu.Video_btn;
        String expected_menu_button_7 = "Business News (RSS)";
        WebElement actual_menu_button_7 = companyBtnMenu.Business_News_btn;

        Assert.assertEquals(actual_menu_button_1.getText(),expected_menu_button_1);
        Assert.assertEquals(actual_menu_button_2.getText(),expected_menu_button_2);
        Assert.assertEquals(actual_menu_button_3.getText(),expected_menu_button_3);
        Assert.assertEquals(actual_menu_button_4.getText(),expected_menu_button_4);
        Assert.assertEquals(actual_menu_button_5.getText(),expected_menu_button_5);
        Assert.assertEquals(actual_menu_button_6.getText(),expected_menu_button_6);
        Assert.assertEquals(actual_menu_button_7.getText(),expected_menu_button_7);





    }
}
