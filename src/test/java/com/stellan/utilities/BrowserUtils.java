package com.stellan.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {


    // this method accepts int in second and
    //execute Thread.sleep methods for given duration
    // Args int second
    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }

    public static void switchWindowAndVerify(String expectedInUrl, String expectedInTitle) {

        // returns and stores all window handles in a set
        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowsHandles) {
            Driver.getDriver().switchTo().window(each);
            System.out.println("Current url: " + Driver.getDriver().getCurrentUrl());
            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    public static void verifyTitle( String expectedTitle) {

        String actualTitle =Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

    }

    public static void verifyTitleContains(String expectedInTitle) {

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }

    // this Method accepts WebElement target and waits for element not to be displayed
    public static void waitingForInvisibilityOf(WebElement target) {
        // create the object of the webdriver class and set up constructor arguments
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        // wait object is ready to be used to create specific expected conditions
        wait.until(ExpectedConditions.invisibilityOf(target));

    }

    public static void waitingForTitleContains(String title) {
        // create the object of the webdriver class and set up constructor arguments
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        // wait object is ready to be used to create specific expected conditions
        wait.until(ExpectedConditions.titleContains(title));

    }
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>(); // empty list of Text
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }
}

    /*
    TC #2: Create utility method
1. Create a new class called BrowserUtils
2. Create a method to make Task1 logic re-usable
3. When method is called, it should switch window and verify title.
Method info:
• Name: switchWindowAndVerify
• Return type: void
• Arg1: WebDriver
*/
