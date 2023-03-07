package com.stellan.pages;

import com.stellan.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRM_log_out {

    public CRM_log_out(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="user-block")
    public WebElement user_btn;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement log_out_btn;




}
