package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	
	static ExtentReports extent;
	public static ExtentReports getReportObject()
	{
		
		String path=System.getProperty("user.dir")+"\\test-output\\report.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);  // this class  is used to create& configure reports in html format
		reporter.config().setReportName("Web Automation Report");  //report name
		reporter.config().setDocumentTitle("Test Results");  //webpage title
		extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Harsha");
		return extent;
		
	}//classname.methodname;

}
