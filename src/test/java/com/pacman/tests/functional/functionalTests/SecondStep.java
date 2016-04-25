package com.pacman.tests.functional.functionalTests;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SecondStep {
	

@Given("^Sample feature file is ready$")
public void Sample_feature_file_is_ready() throws Throwable {
	System.out.println("Ran Given");
}

@When("^I run the feature file$")
public void I_run_the_feature_file() throws Throwable {
	System.out.println("Ran When");
}

@Then("^Run should be successful$")
public void Run_should_be_successful() throws Throwable {
	System.out.println("Ran Then");
}


}
