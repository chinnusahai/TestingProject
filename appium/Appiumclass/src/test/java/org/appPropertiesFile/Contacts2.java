package org.appPropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class Contacts2 {
	public static AndroidDriver ad ;

	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		FileInputStream fi = new FileInputStream("D:\\WorkSpace\\inmakes\\appium\\Appiumclass\\File\\config.properties");
		p.load(fi);

		DesiredCapabilities dc = new DesiredCapabilities();	
		dc.setCapability("platformName", p.getProperty("platformName"));
		dc.setCapability("platformversion", p.getProperty("platformVersion"));
		dc.setCapability("deviceName", p.getProperty("deviceName"));
		dc.setCapability("udid"  , p.getProperty("udid"));
		dc.setCapability("appPackage", p.getProperty("appPackage"));
		dc.setCapability("appActivity", p.getProperty("appActivity"));
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		ad = new AndroidDriver(url,dc);	
		
		WebElement allow  = ad.findElement(By.id("allow"));
		allow.click();
		
		WebElement allow1  = ad.findElement(By.id("allow1"));
		allow1.click();


	}
}





//WebElement plus = ad.findElement(By.id("plus"));
//plus.click();
//WebElement name = ad.findElement(By.xpath("name"));
//name.sendKeys("priya");
//WebElement phone = ad.findElement(By.id("phone"));
//phone.sendKeys("7788445511");
//WebElement save = ad.findElement(By.id("save"));
//save.click();