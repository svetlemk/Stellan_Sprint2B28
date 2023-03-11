package com.stellan.step_definitions;

import com.stellan.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US04_DesktopOption {

    HomePage homePage = new HomePage();

    @Then("verify the users see flowing {int} desktop options:")
    public void verify_the_users_see_flowing_desktop_options() {

      //  homePage.operationSystems.isDisplayed();

        Assert.assertTrue(homePage.operationSystems.isDisplayed());
    }


}
//(//div[@class='b24-app-block-content'])[1]