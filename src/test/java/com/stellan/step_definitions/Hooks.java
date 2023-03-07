package com.stellan.step_definitions;

import com.stellan.utilities.*;
import com.stellan.utilities.BrowserUtils;
import com.stellan.utilities.Driver;


/*
iN this class we will be able to create "pre" and "post" condition
for ALL of the scenarios or even steps
 */
public class Hooks {
    //import the @Before coming from io.cucumber.java


    @After // from cucumber
    public void tearDownMethod(Scenario scenario){

        if (scenario.isFailed()){ // if this is true, in case to not make screenshot everytime...

            byte[] screenshot  = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", scenario.getName());
        }

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
