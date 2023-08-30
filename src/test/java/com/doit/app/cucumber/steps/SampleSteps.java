package com.doit.app.cucumber.steps;

import io.cucumber.java.en.Given;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SampleSteps {
	
	@Given("Test Step")
    public void iAmTestStep() {
        log.info("This is a {} Step", "Test");
    }
	
	@Given("My name is {string}")
    public void printName(String name) {
        log.info("You have specified name as : {}\n", name);
    }
}
