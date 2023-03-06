package com.stellan.runners;

// annotation on top of the class to make it runner for the whole project

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber=reports.html",
        features="src/test/resources/features",
        glue="com/stellan/step_definitions",
        dryRun = false,
        tags="@regression",
        publish = true
)
public class CukesRunner {
}
