package com.pacman.tests.functional.functionalTests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(
		format = { "pretty", "html:target/test-report" },
		features = {"src/test/resources"})

public class CucumberRunner {
}
