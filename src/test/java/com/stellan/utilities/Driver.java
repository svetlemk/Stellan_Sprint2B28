package com.stellan.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
    //create private constructor to remove access to this object
    private Driver(){
    }

 /* we make the web driver private because we want to close the access t
 the object from outside the class
 We are making it static because we will use it in static method,
 instantiating before everything else, having only one instance
  */
    private static WebDriver driver; // what is teh default value = null
    /* create re-usable method which will return the same driver instance once we call it
    If and instance does not exist, it will create first and then it will always return the same instance
     */
    public static WebDriver getDriver(){
        if(driver == null){
            /*
            We will read our browser type form configuration. properties file
            this way we can control which  browser is open from outside our code
             */
            String browserType = ConfigurationReader.getProperty("browser");
            /*
            Depending on the browser type returned from the configuration properties, switch statement will determine
             the case and open the matching browser

             */
            switch(browserType){
                case "chrome":
                   // WebDriverManager.chromedriver().setup(); --->>> we dont need it anymore
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    driver = new ChromeDriver(options);
                    driver.manage().window().maximize();
                    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                case "firefox":
                   // WebDriverManager.firefoxdriver().setup(); //--> we dont need it any more
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
            }

        }

        return driver;
    }

    public static void closeDriver(){
        if(driver!= null){
            driver.quit();
            // this line will terminate teh current driver completely, it will not exist
            driver = null;
            // we assign the value back to null so that my singleton can create a new driver
        }

    }

}
