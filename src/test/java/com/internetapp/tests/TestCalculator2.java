package com.internetapp.tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestCalculator2 {
	@Parameters({"response"})
	public void testMethod1(String response) throws InterruptedException {
		String[] stringArray = response.split(",");
		System.out.println("TestNG_Parameters -> testMethod1");
		System.out.println("Response from xml file: " + response);
		System.out.println("stringArray[0] from xml file: " + stringArray[0]);
		System.out.println("stringArray[1] from xml file: " + stringArray[1]);
	}

	@Test
	@Parameters({"testData"})
	public void exponent(String testData) throws Exception {
		System.out.println("\nRunning Test -> exponent");
		Reporter.log("TestNG_ReportsAndLogs -> exponent", true);
		String[] str = testData.split(",");
		Calculator cal = new Calculator();
		System.out.println("Response from xml file: " + testData);
		System.out.println("stringArray[0] from xml file: " + str[0]);
		System.out.println("stringArray[1] from xml file: " + str[1]);
		double d=Double.parseDouble(str[0]);
		double d1=Double.parseDouble(str[1]);
		double result = cal.exp(d, d1);
		System.out.println(result);
		double expectedResult = 10;
		Assert.assertNotEquals(result, expectedResult);
	}
	

	@Test
	public void inverse() {
		System.out.println("\nRunning Test -> inverse");
		Reporter.log("TestNG_ReportsAndLogs -> Inverse", true);
		Calculator cal = new Calculator();
		double result = cal.inverse(5);
		
		
	}
	
	@Test
	public void negative() {
		System.out.println("\nRunning Test -> negative");
		Reporter.log("TestNG_ReportsAndLogs -> negative", true);
		Calculator cal = new Calculator();
		double result = cal.negate(2);
		Assert.assertTrue(true, "result is negative value: "+result);
	}
	
	@DataProvider (name = "data-provider")
	 public Object[][] dpMethod (Method m){ 
		 return new Object[][] {{2, 3 , 5}, {5, 4, 9}};
		 
		 }
		 
		   @Test (dataProvider = "data-provider")
		     public void Sum (int a, int b, int result) {
				Reporter.log("TestNG_ReportsAndLogs -> sum of two digits using data-provider", true);
		         Calculator cal = new Calculator();
		         int sum = cal.add(a, b);
		         System.out.println("sum of a and b is: "+sum);
		         Assert.assertEquals(result, sum);
		     }
		   
	}
	
	

