package com.stellan.pages;

import com.stellan.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrivePage_Ai {

    public DrivePage_Ai(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//a[@title='Drive'])")
    public WebElement drivePageIcon;


    @FindBy(xpath = "(//div[@id='top_menu_id_docs'])")
    public WebElement drivePageModules;




}