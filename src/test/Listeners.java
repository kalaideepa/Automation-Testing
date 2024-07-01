package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
		
	   System.out.println("I am failing, method name is: "+result.getName()); 
	  //result.getClass().getN	
	   }

}
