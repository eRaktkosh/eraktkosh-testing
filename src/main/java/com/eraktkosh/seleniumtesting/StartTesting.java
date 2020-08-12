package com.eraktkosh.seleniumtesting;

import org.testng.annotations.*;

@Test(groups = { "excludedClasses" })
public class StartTesting {
	public static void main(String[] args) throws InterruptedException  {
		
		ModuleUpTesting obj = new ModuleUpTesting();
		obj.moduleUpTesting();
	}
}
