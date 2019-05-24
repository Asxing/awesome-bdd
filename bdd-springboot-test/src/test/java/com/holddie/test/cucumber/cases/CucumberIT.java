package com.holddie.test.cucumber.cases;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "src/test/features", glue = {"com.holddie.test.cucumber"})
public class CucumberIT {

}
