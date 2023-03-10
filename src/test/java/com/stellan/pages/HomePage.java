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


    @FindBy(xpath = "//a[@title='Employees']")
    public WebElement EmployeesPage;
    @FindBy(xpath = "//span[.='Company Structure']")
    public WebElement CompanyStructureButton;

    @FindBy(xpath = "//span[.='Find Employee']")
    public WebElement FindEmployeeButton;

    @FindBy(xpath = "//span[.='Telephone Directory']")
    public WebElement TelephoneDirectoryButton;

    @FindBy(xpath = "//span[.='Staff Changes']")
    public WebElement StaffChangesButton;

    @FindBy(xpath = "//span[.='Efficiency Report']")
    public WebElement EfficiencyReportButton;

    @FindBy(xpath = "//span[.='Honored Employees']")
    public WebElement HonoredEmployeesButton;

    @FindBy(xpath = "//span[.='Birthdays']")
    public WebElement BirthdaysButton;

    @FindBy(xpath = "//span[.='New page']")
    public WebElement NewPageButton;

    @FindBy(id="user-name")
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

    @FindBy(xpath = "//a[@title='Drive']")
    public WebElement drivePageIcon; //Ai

    @FindBy(xpath = "//span[@class='main-buttons-item-text-title']")
    public List<WebElement> actualListDriveModules; // Ai

    @FindBy(xpath = "//div[contains(@class,'main-buttons-inner-container')]/div")//urko
    public List<WebElement> CompanyBtnList; //list of WebElement becouse locator lacating 8 of them

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[12]")
    public WebElement company_btn; //urko
}
