package org.app;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class Chrome
{
	public static AndroidDriver ad ;
	public static void main(String[] args) throws MalformedURLException, AWTException, InterruptedException
 {	
		DesiredCapabilities dc = new DesiredCapabilities();	
		dc.setCapability("latformName", "Android");
		dc.setCapability("platformversion", "12");
		dc.setCapability("deviceName", "V2151");
		dc.setCapability("udid"  , "13862558020002Z");
		dc.setCapability("appPackage", "com.android.chrome");
		dc.setCapability("appActivity", "com.google.android.apps.chrome.IntentDispatcher");
		dc.setCapability("newCommandTimeout", 120);
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		ad = new AndroidDriver(url,dc);
		
		WebElement accept = ad.findElement(By.id("com.android.chrome:id/terms_accept"));
		accept.click();
		WebElement no = ad.findElement(By.id("com.android.chrome:id/negative_button"));
		no.click();
		Thread.sleep(2000);
		WebElement home = ad.findElement(By.id("com.android.chrome:id/home_button"));
		home.click();
		WebElement search = ad.findElement(By.id("com.android.chrome:id/search_box_text"));
		search.click();
		WebElement urlbar = ad.findElement(By.id("com.android.chrome:id/url_bar"));
		urlbar.sendKeys("inmakes infotech");
		 Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
}}