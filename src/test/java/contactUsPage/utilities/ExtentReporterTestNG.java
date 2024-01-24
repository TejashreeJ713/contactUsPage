package contactUsPage.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterTestNG {
	
	public static ExtentReports getReportObject() {
		String path= System.getProperty("user.dir")+"//reports//index.html";//Store report here, initiated here reporter
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);//reporter is a object path variable stores in this obj
		reporter.config().setReportName("WebDriver University Contact Us Page Automation by Tejashree Jalindre");//method of extentSparkreporter
		reporter.config().setDocumentTitle("Test Result");//method of extentSparkreporter
		
		ExtentReports extent = new ExtentReports();//Extenreports class extent object created
		extent= new ExtentReports();
		extent.attachReporter(reporter);//reporter obj passed from extentSparkReporter and passed in attachedReporter method, This will attach report pass/fail
		extent.setSystemInfo("Tester", "Tejashree Jalindre");//called setSystemInfo method from ExtentReports.class
		return extent;//extent is returning extentReport where method is getReportObject
	}

}
