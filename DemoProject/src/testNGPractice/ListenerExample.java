package testNGPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
 
public class ListenerExample  implements ITestListener
{
	
	public void onTestStart(ITestResult result)
	{
		
		System.out.println("Test case is going to excute");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		
		System.out.println("Test case is passed");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test case is failed");
		
	}
	public void onTestSkipped(ITestResult result)
	{
		
		System.out.println("Test case is skipped");
	}
	
	public void onTestFailureButwithinSuccessPercentage(ITestResult result)
	{
		
		
	}
   
	public void onStart(ITestContext context)
	{
		
		System.out.println("Before Everything");
	}
	
	public void onFinish(ITestContext context)
	{
		
		System.out.println("After Everything");
	}
}
