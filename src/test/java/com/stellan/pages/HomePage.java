package com.stellan.pages;

import com.stellan.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends LoginPage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user-name")
    public WebElement profileName;

    @FindBy(xpath = "//span[@class='menu-popup-item-text']")
    public List<WebElement> actualListWebElements;
    //span[@class='menu-popup-item-text']

    @FindBy(xpath = "//span[normalize-space()='Chat and Calls']")  //US08
    public WebElement chatAndCallsButton;

    @FindBy(xpath = "//div[@class='bx-desktop-appearance-tab']//span/..")  //US08
    public List<WebElement> chatAndCallsOptions;

    @FindBy(xpath = "//a[@title='Time and Reports']")
    public WebElement TimeAndReports;

    @FindBy(xpath = "//span[@class='main-buttons-item-text-title']")
    public List<WebElement> TimeAndReportsModules;


    @FindBy(xpath = "(//div[@class='b24-app-block-content'])[1]")   //US04
    public WebElement operationSystems;


}
