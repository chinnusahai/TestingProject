package org.appTestNG;
	import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
	import java.util.Date;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.appium.java_client.android.AndroidDriver;

public class calc {

		public static AndroidDriver ad ;
		ExtentHtmlReporter calcReport ;
		ExtentReports er;
		ExtentTest t;

		@BeforeClass
		private void launchbrowser() throws IOException {
			calcReport = new ExtentHtmlReporter("D:\\WorkSpace\\inmakes\\appium\\Appiumclass\\File\\calcreport.html");
			er = new ExtentReports();
			er.attachReporter(calcReport);
				t = er.createTest("Android","Calc application") ;
			Properties p = new Properties();
			FileInputStream fi = new FileInputStream("D:\\WorkSpace\\inmakes\\appium\\Appiumclass\\File\\configCalc.properties");
			p.load(fi);
			
			DesiredCapabilities dc = new DesiredCapabilities();	
			dc.setCapability("platformName", p.getProperty("platformName"));
			dc.setCapability("platformversion", p.getProperty("version"));
			dc.setCapability("deviceName", p.getProperty("name"));
			dc.setCapability("udid"  , p.getProperty("udid"));
			dc.setCapability("appPackage",p.getProperty("package") );
			dc.setCapability("appActivity",p.getProperty("Activity") );
			dc.setCapability("newCommandTimeout", 120);
			URL url = new URL("http://0.0.0.0:4723/wd/hub");
			ad = new AndroidDriver(url,dc);	
		}
		@Test
		private void tc1() {
			t.log(Status.INFO,"Click the number 2 button");
			WebElement two = ad.findElement(By.id("com.vivo.calculator:id/digit2"));
			two.click();
		}@Test
		private void tc2() {
			t.log(Status.PASS,"Click the number 5 button");
			WebElement five = ad.findElement(By.id("com.vivo.calculator:id/digit5"));
			five.click();
		}@Test
		private void tc3() {
			t.log(Status.INFO,"Click the + button");
			WebElement add = ad.findElement(By.id("com.vivo.calculator:id/plus"));
			add.click();
		}@Test
		private void tc4() {
			t.log(Status.INFO,"Click the 1 button");
			WebElement one = ad.findElement(By.id("com.vivo.calculator:id/digit1"));
			one.click();		
		}@Test
		private void tc5() {
			t.log(Status.INFO,"Click the 5 button");
			WebElement five = ad.findElement(By.id("com.vivo.calculator:id/digit5"));
			five.click();		
		}@Test
		private void tc6() {
			t.log(Status.INFO,"Click the = button");
			WebElement equal = ad.findElement(By.id("com.vivo.calculator:id/equal"));
			equal.click();	
		}
		@AfterClass
		private void closebrowser() throws IOException {
			t.log(Status.INFO,"taking screen shot");
			TakesScreenshot ts = (TakesScreenshot)ad;
			File img = ts.getScreenshotAs(OutputType.FILE);
			File f = new File("./screenshoot\\cal.png");
			FileUtils.copyFile(img, f);
			ad.quit();
		}
		@AfterSuite
		private void tc47() {

			t.log(Status.PASS," appium close apk");
			System.out.println("tc7");
			ad.quit();
		}
	}
	  

