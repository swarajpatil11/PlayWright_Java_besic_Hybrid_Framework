package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class MyReport {

	public ExtentReports report() {

		String path = System.getProperty("user.dir") + "/target/reports.html";
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(path);
		extent.attachReporter(spark);

		extent.setSystemInfo("role", "QA");
		extent.setSystemInfo("os", "windows");
		extent.setSystemInfo("name", "swaraj chaudhari");

		return extent;

	}

}
