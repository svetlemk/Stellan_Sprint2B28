package com.stellan.step_definitions;



import com.stellan.pages.LoginPage;
import com.stellan.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US02_LoginFeatures_StepDefs_Vasyl  {

    //  @Given("User is on the log in page")
     // public void user_is_on_the_log_in_page() {
   //         Driver.getDriver().get(ConfigurationReader.getProperty("url")); }


      LoginPage loginPage = new LoginPage();

      @When("user sees {string} checkbox on the login page")
      public void userSeesRememberMeOnThisComputerCheckboxOnTheLoginPage(String expectedText) {
         //   loginPage.rememberMeOnThisComputer.isDisplayed();
            String actualText = loginPage.rememberMeOnThisComputer.getText();
            Assert.assertEquals(expectedText,actualText);
      }

      @Then("user clicks Remember me on this computer checkbox on the login page")
      public void userClicksRememberMeOnThisComputerCheckboxOnTheLoginPage() {
          //  BrowserUtils.sleep(2);
            loginPage.checkBoxRememberMe.click();
      }

      @When("user clicks on Forgot Your Password? if user does not remember a password")
      public void userClicksOnForgotYourPasswordIfUserDoesNotRememberAPassword() {

            loginPage.forgotPassword.click();
      }

     @Then("user gets to the {string} page to reset password")
      public void userGetsToTheGetPasswordPageToResetPassword(String expectedTitle) {

            String actualTitle = Driver.getDriver().getTitle();
              Assert.assertEquals(expectedTitle, actualTitle);

      }
}




