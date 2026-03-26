package generic_utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ListenersImplementation implements ITestListener {
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/test_result.html");
	ThreadLocal<ExtentTest> test = new ThreadLocal();
	WebDriver driver;

	@Override
	public void onTestStart(ITestResult result) {
		ExtentTest et = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.get().pass("Test Status: Pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.get().fail("Test Status : Fail");
		test.get().fail(result.getThrowable());
		Object obj = result.getInstance();
		BaseClass bsc = (BaseClass) obj;
		WebDriver driver = bsc.driver;
		ScreenshotUtility sc = new ScreenshotUtility();
		try {
			String path = sc.captureScreenshot(driver, result.getMethod().getMethodName());
			test.get().addScreenCaptureFromPath(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
		extent.flush();

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.get().skip("Test Status : Skipped");

	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
}