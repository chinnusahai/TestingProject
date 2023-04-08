package org.appTestNG;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
public class Calculator{
	public static AndroidDriver ad ;

	@BeforeClass
	private void launchbrowser() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();	
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformversion", "12");
		dc.setCapability("deviceName", "V2151");
		dc.setCapability("udid"  , "13862558020002Z");
		dc.setCapability("appPackage", "com.vivo.calculator");
		dc.setCapability("appActivity", "com.vivo.calculator.Calculator");
		dc.setCapability("newCommandTimeout", 120);
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		ad = new AndroidDriver(url,dc);	
	}
	@Test
	private void tc1() {

		WebElement two = ad.findElement(By.id("com.vivo.calculator:id/digit2"));
		two.click();
	}@Test
	private void tc2() {
		WebElement five = ad.findElement(By.id("com.vivo.calculator:id/digit5"));
		five.click();
	}@Test
	private void tc3() {
		WebElement add = ad.findElement(By.id("com.vivo.calculator:id/plus"));
		add.click();
	}@Test
	private void tc4() {
		WebElement one = ad.findElement(By.id("com.vivo.calculator:id/digit1"));
		one.click();		
	}@Test
		
	private void tc5() {
		WebElement five = ad.findElement(By.id("com.vivo.calculator:id/digit5"));
		five.click();		
	}@Test
	private void tc6() {
		WebElement equal = ad.findElement(By.id("com.vivo.calculator:id/equal"));
		equal.click();	
	}	@AfterClass
	private void closebrowser() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)ad;
		File img = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("./screenshoot\\cal.png");
		FileUtils.copyFile(img, f);
		ad.quit();
	}	@BeforeMethod
	private void startDate() {
		Date d =new Date();
		System.out.println(d);
	}	@AfterMethod
	private void EndDate() {
		Date d =new Date();
		System.out.println(d);
	}
}
  