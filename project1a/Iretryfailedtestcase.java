package project1a;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Iretryfailedtestcase  implements IRetryAnalyzer{
	
	int InitialCount=0;
	int RetryCount=0;
	@Override
	public boolean retry(ITestResult result) {
		{
			if(InitialCount<RetryCount)
			{
				InitialCount++;
				return true;
			}
		     }
		return false;
	}}

