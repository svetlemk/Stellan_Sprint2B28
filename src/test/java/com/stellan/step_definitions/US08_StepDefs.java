package com.stellan.step_definitions;

import com.stellan.pages.ChatAndCallsPage_Dauren;
import com.stellan.utilities.BrowserUtils;
import com.stellan.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class US08_StepDefs {
    ChatAndCallsPage_Dauren chatAndCallsPage_dauren = new ChatAndCallsPage_Dauren();

    @When("users click the CHAT and Calls module")
    public void usersClickTheCHATAndCallsModule() {
        chatAndCallsPage_dauren.chatAndCallsButton.click();

    }

    @Then("verify the users see following 4 options:")
    public void verifyTheUsersSeeFlowingOptions(List<String> expectedOptions) {
        List<String> actualOptions = BrowserUtils.getElementsText(chatAndCallsPage_dauren.chatAndCallsOptions);
        Assert.assertEquals(expectedOptions, actualOptions);

    }

}
