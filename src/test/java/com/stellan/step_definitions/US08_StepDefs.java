package com.stellan.step_definitions;

import com.stellan.pages.ChatAndCallsPage_Dauren;
import com.stellan.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class US08_StepDefs {
    ChatAndCallsPage_Dauren chatAndCallsPage_dauren = new ChatAndCallsPage_Dauren();

    @Given("users are on the homepage")
    public void users_are_on_the_homepage() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa.azulcrm.com/");

        chatAndCallsPage_dauren.emailBox.sendKeys("hr5@cybertekschool.com");
        chatAndCallsPage_dauren.passwordBox.sendKeys("UserUser");
        chatAndCallsPage_dauren.logInBtn.click();
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
