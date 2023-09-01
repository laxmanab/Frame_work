package Generic_script;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("tc execution started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("tc executed sucessfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("tc is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	System.out.println("tc is skipped");
	}
}
