package com.stellan.pages;

import com.stellan.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="user-name")
    public WebElement profileName;

    @FindBy(xpath = "//span[@class='menu-popup-item-text']")
    public List<WebElement> actualListWebElements;
    //span[@class='menu-popup-item-text']

    @FindBy(xpath = "//span[normalize-space()='Chat and Calls']")  //US08
    public WebElement chatAndCallsButton;

    @FindBy(xpath = "//div[@class='bx-desktop-appearance-tab']//span/..")  //US08
    public List<WebElement> chatAndCallsOptions;


}
