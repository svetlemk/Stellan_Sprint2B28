package com.stellan.pages;

import com.stellan.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TimeAndReports_page {
    public TimeAndReports_page() {
       PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//a[@title='Time and Reports']")
        public WebElement TimeAndReports  ;

    @FindBy(xpath="//span[@class='main-buttons-item-text-title']")

    public List<WebElement> TimeAndReportsModules ;

    }


