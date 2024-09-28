package com.example.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.calculator.services.CalculatorService;

@SpringBootTest
class CalculatorApplicationTests {

	@Test
	@DisplayName("This tests is used to check whether the sum function is correct")
	void testCalculator() {
		CalculatorService calculatorService = new CalculatorService();
		int result = calculatorService.sum(2, 5);
		assertEquals(result, 7);
	}

}
