package com.stellan.pages;

import com.stellan.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DriverPage_Ai {
    public void DriverPage_Ai(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//a[@title='Drive'])")
    WebElement drivePageIcon;


    @FindBy(xpath = "(//div[@id='top_menu_id_docs'])")
    WebElement driverPageModules;




}