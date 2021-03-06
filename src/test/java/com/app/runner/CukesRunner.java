package com.app.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"pretty", 
				"html:target/cucumber-report",
				"json:target/cucumber.json"
				},
		tags = "@Shavkat", 
		features="src/test/resources/features",
		glue="com.app.step_definitions",
		dryRun=false
		)
public class CukesRunner extends AbstractTestNGCucumberTests  {
	
}
