package com.stellan.step_definitions;

import com.stellan.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US14_Yuriy_StepDef {

    HomePage homePage = new HomePage();

    @When("users click the Company module")
    public void usersClickTheCompanyModule() {

        homePage.company_btn.click();

    }

    @Then("verify the users see flowing 7 options:")
    public void verify_the_users_see_flowing_options(List<String> expectedList) {

        List<String> actualList = new ArrayList<>(); // new empty List

        for (WebElement each : homePage.CompanyBtnList) {
            actualList.add(each.getText());
        }
        Assert.assertEquals(expectedList, actualList);


    }
}
