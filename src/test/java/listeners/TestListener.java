package listeners;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import hooks.Hooks;

import org.testng.ITestListener;
import org.testng.ITestResult;
import reports.ExtentManager;


public class TestListener implements ITestListener {

    private ExtentReports extent =
            ExtentManager.createReport();

    private ExtentTest test;


    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test started");
        test = extent.createTest(result.getMethod().getMethodName());
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        test.pass("Test passed");
        extent.flush();
    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.fail("Test failed");
        test.fail(result.getThrowable());
        if (Hooks.failureScreenshot != null) {
            test.addScreenCaptureFromBase64String(
                    Hooks.failureScreenshot,
                    "Failure Screenshot"
            );
        }
     extent.flush();
    }
}
