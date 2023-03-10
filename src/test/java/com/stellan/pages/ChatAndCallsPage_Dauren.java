package com.stellan.pages;

import com.stellan.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ChatAndCallsPage_Dauren extends BasePage {

    public ChatAndCallsPage_Dauren(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
   @FindBy(xpath = "//span[normalize-space()='Chat and Calls']")
    public WebElement chatAndCallsButton;

    @FindBy(xpath = "//div[@class='bx-desktop-appearance-tab']//span/..")
    public List<WebElement> chatAndCallsOptions;
}
