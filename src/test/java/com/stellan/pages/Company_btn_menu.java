package com.stellan.pages;

import com.stellan.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Company_btn_menu {

    public Company_btn_menu(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[contains(@class,'main-buttons-inner-container')]/div")
    public List<WebElement> CompanyButtonMenu; //list of WebElement becouse locator lacating 8 of them

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[12]")
    public WebElement company_btn;


}
