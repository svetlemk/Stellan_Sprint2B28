package com.stellan.step_definitions;

import com.stellan.pages.HomePage;
import com.stellan.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class US13_ConfigureMenu_StepDefs_Vasyl {

    HomePage homePage = new HomePage();

    @When("users click Configure Menu")
    public void users_click_configure_menu() {
    homePage.configMenu.click();


    }
    @Then("verify the users see flowing 6 options:")
    public void verify_the_users_see_flowing_options(List<String> expectedList) {
/*
        List<String> actualList = new ArrayList<>(); // new empty List

        for (WebElement each : homePage.configMenuList) {
            actualList.add(each.getText());
        }
        Assert.assertEquals(expectedList, actualList);

 */
        BrowserUtils.sleep(1);
        List<String> actualList = BrowserUtils.getElementsText(homePage.configMenuList);

        Assert.assertEquals(expectedList,actualList);

    }


}
