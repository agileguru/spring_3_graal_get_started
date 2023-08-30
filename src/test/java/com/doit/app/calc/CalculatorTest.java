package com.doit.app.calc;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator calc = new Calculator();
	
	@Test
	void testAdd() {
		double result = calc.sum(1,1);
		Assertions.assertThat(result).isEqualTo(2);
	}
	
	@Test
	void testAddWithDecimal() {
		double result = calc.sum(1.1,1.2);
		Assertions.assertThat(result).isEqualTo(2.3);
	}

	@Test
	void testAddWithDouble() {
		double result = calc.sum(1.144444,1.211111);
		Assertions.assertThat(result).isEqualTo(2.355555);
	}
	
	@Test
	void testAddNegetive() {
		double result = calc.sum(-1 ,-2);
		Assertions.assertThat(result).isEqualTo(-3);
	}
	
	@Test
	void testAddZeros() {
		double result = calc.sum(0 ,0);
		Assertions.assertThat(result).isEqualTo(0);
		
		result = calc.sum(0 ,1);
		Assertions.assertThat(result).isEqualTo(1);
		
		result = calc.sum(1 ,0);
		Assertions.assertThat(result).isEqualTo(1);
	}
}

