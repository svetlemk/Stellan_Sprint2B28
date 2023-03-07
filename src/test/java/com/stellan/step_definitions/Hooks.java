package com.stellan.step_definitions;

import com.stellan.utilities.*;
import com.stellan.utilities.BrowserUtils;
import com.stellan.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

import java.time.Duration;

/*
iN this class we will be able to create "pre" and "post" condition
for ALL of the scenarios or even steps
 */
public class Hooks {
    //import the @Before coming from io.cucumber.java

    //import the @Before coming from io.cucumber.java
    @Before (order = 1)
    public void setupMethod(){

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @After // from cucumber
    public void tearDownMethod(){
        System.out.println("--->@After running after each scenario");
        BrowserUtils.sleep(3);
        Driver.closeDriver();
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("--->@BeforeStep running before each step ");
    }

    public void teardownStep(){
        System.out.println("--->@AfterStep running after each step");
    }

}
