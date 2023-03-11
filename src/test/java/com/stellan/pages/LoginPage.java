package com.stellan.pages;

import com.stellan.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="USER_LOGIN")
    public WebElement username;

    @FindBy(name="USER_PASSWORD")
    public  WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement errorMessage;



    // LoginPage features by Vasyl
    @FindBy(xpath = "//label[@for='USER_REMEMBER']")
    public WebElement rememberMeOnThisComputer; //US02_Vasyl


    @FindBy (xpath = "//input[@id='USER_REMEMBER']")
    public WebElement checkBoxRememberMe; //US02_Vasyl

    @FindBy (xpath = "//a[@class='login-link-forgot-pass']")
    public WebElement forgotPassword; //US02_Vasyl








    public void login(String usernameStr, String passwordStr){
        username.sendKeys(usernameStr);
        password.sendKeys(passwordStr);
        loginButton.click();
    }

}
