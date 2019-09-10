package com.sjm.bdd;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        monochrome = true,
        junit = "--step-notifications",
        features = "classpath:features",
        plugin = {"pretty", "html:target/cucumber-reports",
                  "json:target/cucumber.json",
                  "rerun:target/rerun.txt"}
                  ,tags = "@AllTests"
               )
public class TestRunner {}
