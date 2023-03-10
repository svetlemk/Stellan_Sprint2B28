package com.stellan.pages;

import com.stellan.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="user-name")
    public WebElement profileName;

    @FindBy(xpath = "//span[@class='menu-popup-item-text']")
    public List<WebElement> actualListWebElements;
    //span[@class='menu-popup-item-text']


}
