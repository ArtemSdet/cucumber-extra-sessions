package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features" ,
        glue = "com/cydeo/steps",
        dryRun = true,
        tags = "@wip"
)
public class CukesRunner {
}
