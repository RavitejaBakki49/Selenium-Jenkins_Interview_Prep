package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {


    public static ExtentReports createReport() {

        ExtentSparkReporter spark =  new ExtentSparkReporter("target/ExtentReport.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(spark);
        return extent;
    }




}
