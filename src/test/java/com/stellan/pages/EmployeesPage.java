package com.stellan.pages;

import com.stellan.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeesPage {
    public EmployeesPage(){
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



}
