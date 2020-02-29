package com.cts.training.tests;



import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.cts.training.Calculator.Calculator;

public class CalculatorTest {

	private static Calculator calculator;
	@Before
	public void init() {
		calculator = new Calculator();
		System.out.println("Object Created");

	}

	@After
	public static void destroy() {
		calculator = null;
		System.out.println("Object Destroyed");
	}
	@Ignore
	@Test
	public void test_add_success() {
		assertEquals(17, calculator.add(12, 5));
		assertEquals(7, calculator.sub(5, 12));
		System.out.println("Inside Sub Test");
	}
	
	@Test
	public void test_multiply_success() {
		assertEquals(60, calculator.mul(12, 5));
		System.out.println("Inside Sub Test");
	}
	@Test
	public void test_prime_number() {
		assertEquals(true,calculator.isPrime(5));
		System.out.println("prime");
	}
	
	@Test
	public void test_divide_success() {
		assertEquals(5, calculator.sub(12, 5));
		System.out.println("Inside Sub Test");
	}
	
	}


