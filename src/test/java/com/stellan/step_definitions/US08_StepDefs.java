package com.stellan.step_definitions;

import com.stellan.pages.ChatAndCallsPage_Dauren;
import com.stellan.pages.LoginPage_Dauren;
import com.stellan.utilities.ConfigurationReader;
import com.stellan.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US08_StepDefs {

    LoginPage_Dauren loginPage_dauren = new LoginPage_Dauren();
    ChatAndCallsPage_Dauren chatAndCallsPage_dauren = new ChatAndCallsPage_Dauren();

    @Given("users are on the homepage")
    public void users_are_on_the_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("azulCrmUrl"));
        loginPage_dauren.login();
    }
    @When("users click the Chat and Calls module")
    public void users_click_the_chat_and_calls_module() throws Throwable {
        Thread.sleep(1000);
        chatAndCallsPage_dauren.chatAndCallsButton.click();
    }
    @Then("users see a Message button icon")
    public void users_see_a_message_s_button_icon() {
        Assert.assertTrue(chatAndCallsPage_dauren.messageButtonIcon.isDisplayed());
    }
    @Then("user should see a Notifications button icon")
    public void user_should_see_a_notifications_button_icon() throws Throwable {
        Thread.sleep(2000);
        Assert.assertTrue(chatAndCallsPage_dauren.notificationsButtonIcon.isDisplayed());
    }
    @Then("user should see a Settings button icon")
    public void user_should_see_a_settings_button_icon() throws Throwable{
        Thread.sleep(2000);
        Assert.assertTrue(chatAndCallsPage_dauren.settingsButtonIcon.isDisplayed());
    }
    @Then("user should see a Activity Stream button icon")
    public void user_should_see_a_activity_stream_button_icon() throws Throwable{
        Thread.sleep(2000);
        Assert.assertTrue(chatAndCallsPage_dauren.activityStreamButtonIcon.isDisplayed());
    }
}
