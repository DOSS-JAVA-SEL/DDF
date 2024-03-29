package org.tgp6;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class RetryFailed implements IRetryAnalyzer{
int count = 0;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if (count<2) {
			count++;
			
			return true;
		}
		return false;
	}
}