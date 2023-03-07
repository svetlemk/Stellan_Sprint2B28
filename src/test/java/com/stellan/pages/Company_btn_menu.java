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
    public List<WebElement> CompanyBtnList; //list of WebElement becouse locator lacating 8 of them

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[12]")
    public WebElement company_btn;

    @FindBy(xpath = "//span[.='Official Information']")
    public WebElement Official_Info_btn;
    @FindBy(xpath = "//span[.='Our Life']")
    public WebElement Our_Life_btn;
    @FindBy(xpath = "//span[.='About Company']")
    public WebElement About_btn;
    @FindBy(xpath = "//span[.='Photo Gallery']")
    public WebElement Photo_Gal_btn;
    @FindBy(xpath = "//span[.='Video']")
    public WebElement Video_btn;
    @FindBy(xpath = "//span[.='Career']")
    public WebElement Career_btn;
    @FindBy(xpath = "//span[.='Business News (RSS)']")
    public WebElement Business_News_btn;



}
