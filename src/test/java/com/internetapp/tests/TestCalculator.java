package com.internetapp.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.internetapp.tests.asserts.SomeClassToTest;

public class TestCalculator {
	
	@Test(groups = "Addition")
	public void add() {
		System.out.println("\nRunning Test -> add");
		Reporter.log("TestNG_ReportsAndLogs -> addition", true);
		Calculator cal = new Calculator();
		int result = cal.add(1, 2);
		Assert.assertEquals(result, 3);
	}

	@Test(groups = "Substration")
	public void Substration() {
		System.out.println("\nRunning Test -> sub");
		Reporter.log("TestNG_ReportsAndLogs -> Subsration", true);
		Calculator cal = new Calculator();
		int result = cal.sub(5, 2);
		int expectedResult = 3;
		Assert.assertEquals(result, expectedResult);
	}
	
	@Test(groups = "multiplication")
	public void multiplication() {
		System.out.println("\nRunning Test -> multiplication");
		Reporter.log("TestNG_ReportsAndLogs -> multliplication", true);
		Calculator cal = new Calculator();
		int result = cal.mul(5, 2);
		int expectedResult = 10;
		Assert.assertEquals(result, expectedResult);
	}
	
	@Test(groups = "division")
	public void division() {
		System.out.println("\nRunning Test -> division");
		Reporter.log("TestNG_ReportsAndLogs -> division", true);
		Calculator cal = new Calculator();
		int result = cal.divInt(6, 2);
		int expectedResult = 3;
		Assert.assertEquals(result, expectedResult);
	}
	
	
		
	
}
