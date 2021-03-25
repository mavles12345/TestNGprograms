package org.failure;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailureTest implements IRetryAnalyzer {

	int a=0, b=4;
	
	public boolean retry(ITestResult result) {
		
		if (a < b) {
			a++;
			return true;
			
		}
		
		return false;
	}

}
