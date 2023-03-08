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


}
