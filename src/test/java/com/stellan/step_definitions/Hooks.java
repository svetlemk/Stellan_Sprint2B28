package com.stellan.step_definitions;

import com.stellan.utilities.*;
import com.stellan.utilities.BrowserUtils;
import com.stellan.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

/*
iN this class we will be able to create "pre" and "post" condition
for ALL of the scenarios or even steps
 */
public class Hooks {
    //import the @Before coming from io.cucumber.java

    @Before (order = 1)
    public void setupMethod(){

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


  // from cucumber
    @After
    public void teardownMethod(Scenario scenario) {

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }


    }


}
