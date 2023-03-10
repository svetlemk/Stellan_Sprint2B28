package com.stellan.step_definitions;

import com.stellan.pages.HomePage;
import com.stellan.pages.TimeAndReports_page;
import com.stellan.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US11_StepDef {

   TimeAndReports_page timeAndReports_page = new TimeAndReports_page();

    @When("users click the Time and Reports module")
    public void usersClickTheTimeAndReportsModule() {
       timeAndReports_page.TimeAndReports.click();
    }

    @Then("verify the users see flowing 5 modules:")
    public void verifyTheUsersSeeFlowingModules(List<String> expectedList) {

        List<String> actualList = BrowserUtils.getElementsText(timeAndReports_page.TimeAndReportsModules);

        Assert.assertEquals(expectedList,actualList);
    }
}
