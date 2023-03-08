package com.stellan.pages;

import com.stellan.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_Dauren extends BasePage_Dauren{
    @FindBy(css = "input[placeholder='Login']")
    public WebElement emailBox;

    @FindBy(css = "input[placeholder='Password']")
    public WebElement passwordBox;

    @FindBy(css = "input[value='Log In']")
    public WebElement logInBtn;

    public void login(){
        String userEmail = ConfigurationReader.getProperty("hr5_username");
        String userPassword = ConfigurationReader.getProperty("azulCrm_password");
        //String userEmail = ConfigurationReader.getProperty(user + "_username");
        //String userPassword = ConfigurationReader.getProperty(user + "_password");
        emailBox.sendKeys(userEmail);
        passwordBox.sendKeys(userPassword);
        logInBtn.click();
    }
}
