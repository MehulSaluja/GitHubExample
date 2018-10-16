package com.qa.myblackjack;

import org.junit.runner.*;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Test2 

{
	public static void main (String[] args) 
	{
		Test2.allTests();
	}
	
	public static void allTests() 
	{
		Result result = JUnitCore.runClasses(InvalidEntriesSuite.class,ValidEntriesSuite.class);
		
		System.out.println("All results passed:" + result.wasSuccessful() );
	
	
	if (!result.wasSuccessful()) 
	{
		System.out.println("Failed Tests:");
		
		for (Failure failure: result.getFailures()) 
		{
			System.out.println(failure.getMessage());
		}
	}
	
}
}
