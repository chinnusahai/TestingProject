	package org.appReport;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.Properties;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.Test;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

	import io.appium.java_client.android.AndroidDriver;
	public class calculatorReport {
		public static AndroidDriver ad;
		ExtentHtmlReporter rep;
		ExtentReports e;
		ExtentTest test;	
		@BeforeSuite
		private void setUp() throws IOException {
			rep = new ExtentHtmlReporter("D:\\WorkSpace\\inmakes\\appium\\Appiumclass\\File\\rcal.html");
			e = new ExtentReports();
			e.attachReporter(rep);
			test = e.createTest("Android", "contact application");
			Properties p = new Properties();
			FileInputStream fi = new FileInputStream("D:\\WorkSpace\\inmakes\\appium\\Appiumclass\\File\\configCont.properties");
			p.load(fi);
			DesiredCapabilities dc = new DesiredCapabilities();	
			dc.setCapability("platformName", "Android");
			dc.setCapability("platformVersion", "12");
			dc.setCapability("deviceName", "V2151");
			dc.setCapability("udid", "13862558020002Z");
			dc.setCapability("appPackage", "com.android.contacts");
			dc.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
			URL url = new URL("http://0.0.0.0:4723/wd/hub");
			ad = new AndroidDriver(url, dc);
			test.log(Status.INFO, "Click the allow button");
			WebElement allow = ad.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
			allow.click();
			test.log(Status.PASS, "Click the allow2 button");
			WebElement allow2 = ad.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
			allow2.click();
	}		@Test(priority = 1)
		private void test1() {
			test.log(Status.PASS, "Test case 1 passed");
			System.out.println("Test case 1");
}		@Test(priority = 2)
		private void test2() {
			test.log(Status.PASS, "Test case 2 passed");
			System.out.println("Test case 2");
}		@AfterSuite
		private void tearDown() {
			test.log(Status.PASS, "Close apk");
			System.out.println("Close apk");
			ad.quit();
			e.flush();
		}
	}

