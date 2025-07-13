package utilities;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.model.ReportStats;

public class Mylisteners implements ITestListener {
	Screenshot ss;
	ExtentTest test;
	ExtentReports rp = new MyReport().report();

	@Override
	public void onTestStart(ITestResult result) {
		test = rp.createTest(result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.pass("passed" + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail("failed" + result.getName());
		String path = Screenshot.screenshot(result.getName());
		 String fileName = new File(path).getName();
		   String relativePath = "Screenshot/" + fileName;
		   test.addScreenCaptureFromPath(relativePath);

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {
		rp.flush();

	}

}
