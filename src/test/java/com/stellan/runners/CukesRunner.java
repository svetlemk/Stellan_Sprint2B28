package com.stellan.runners;

// annotation on top of the class to make it runner for the whole project

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber=reports.html",
        features="src/test/resources/features", // features from resources- features
        glue="com/stellan/step_definitions", // step definitions// we wrote before using Gherkin language
        dryRun = false,   // turn on and off running of the step definitions//don't execute the code, but generate the snippets
        tags="",
        publish = true
)
public class CukesRunner {
}
