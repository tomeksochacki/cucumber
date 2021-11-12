package com.udemy;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/com/udemy/login.feature")
// glue = "")
// features = "src/test/resources/")
public class RunLoginTest {
}