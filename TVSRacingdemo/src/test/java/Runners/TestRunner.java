package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features ="src/test/resources/Feature/",
		glue="stepDefinitions",
		plugin = { "pretty", "html:target/report/cucumber.html", "json:target/report/cucumber.json" },
				monochrome = true  )
		public class TestRunner {}


