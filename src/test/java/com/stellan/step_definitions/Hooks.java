package com.stellan.step_definitions;

import com.stellan.utilities.BrowserUtils;
import com.stellan.utilities.Driver;
import com.stellan.utilities.BrowserUtils;
import com.stellan.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

/*
iN this class we will be able to create "pre" and "post" condition
for ALL of the scenarios or even steps
 */
public class Hooks {
    //import the @Before coming from io.cucumber.java
    @Before
    public void setUpMethod(){
        System.out.println("@Before Running before each scenario");
    }

    @After // from cucumber
    public void tearDownMethod(){
        System.out.println("--->@After running after each scenario");
        BrowserUtils.sleep(3);
        Driver.closeDriver();
    }

   // @BeforeStep
    public void setupStep(){
        System.out.println("--->@BeforeStep running before each step ");
    }

   // @AfterStep
    public void teardownStep(){
        System.out.println("--->@AfterStep running after each step");
    }

}
