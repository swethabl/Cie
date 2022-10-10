package com.MovieApp.web.cucumber.runner;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/sort_functionality.feature",

        glue = {"classpath:com.MovieApp.web.step.definition" },

        plugin = {
                "pretty",
                "html:target/cucumber-reports",
                 }
)
public class TestRunner {

}
