package com.belatrix.connect;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Example of Automation.
 */
@CucumberOptions(plugin = { "html:target/cucumber-html-reports",
		"json:target/cucumber-html-reports/cucumber.json",
		"junit:target/surefire-reports/cucumber-junit.xml" }, 
		features = "src/test/resources/features/", 
		tags = "@Regression", 
		glue = { "com.belatrix.connect.steps" })

public class AppTest extends AbstractTestNGCucumberTests {
}