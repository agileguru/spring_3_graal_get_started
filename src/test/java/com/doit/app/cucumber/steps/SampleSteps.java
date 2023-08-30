package com.doit.app.cucumber.steps;

import org.assertj.core.api.Assertions;

import com.doit.app.calc.Calculator;

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
	
	
	@Given("Numbers {double} and {double} the sum should be {double}")
	public void numbers_and_the_sum_should_be(Double num1, Double num2, Double sum) {
		Calculator calculator = new Calculator();
		double result = calculator.sum(num1, num2);
		log.info("The result is : {}\n", result);
		Assertions.assertThat(result).isEqualTo(sum);
	}
}
