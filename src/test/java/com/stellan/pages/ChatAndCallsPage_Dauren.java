package com.stellan.pages;

import com.stellan.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatAndCallsPage_Dauren extends BasePage_Dauren{

    public ChatAndCallsPage_Dauren(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[normalize-space()='Chat and Calls']")
    public WebElement chatAndCallsButton;

    @FindBy(xpath = "//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-im']")
    public WebElement messageButtonIcon;

    @FindBy(id = "bx-desktop-tab-notify")
    public WebElement notificationsButtonIcon;

    @FindBy(id = "bx-desktop-tab-config")
    public WebElement settingsButtonIcon;

    @FindBy(id = "bx-desktop-tab-im-lf")
    public WebElement activityStreamButtonIcon;
}
