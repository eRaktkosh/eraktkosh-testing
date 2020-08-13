package com.eraktkosh.seleniumtesting;

import org.testng.TestNG;
import org.testng.annotations.Test;

//@Test(groups = { "excludedClasses" })
public class StartTesting {
	
	static TestNG testNg;
	
	public static void main(String[] args) {
		
		testNg = new TestNG(); 
		
		testNg.setTestClasses(new Class[] {ModuleUpTesting.class});
		//testNg.addListener(null);
		testNg.run();
		
	}

}
