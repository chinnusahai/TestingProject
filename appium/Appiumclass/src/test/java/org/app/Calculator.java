package org.app;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class Calculator
{
	public static AndroidDriver ad ;
	public static void main(String[] args) throws MalformedURLException
 {	
		DesiredCapabilities dc = new DesiredCapabilities();	
		dc.setCapability("latformName", "Android");
		dc.setCapability("platformversion", "12");
		dc.setCapability("deviceName", "V2151");
		dc.setCapability("udid"  , "13862558020002Z");
		dc.setCapability("appPackage", "com.vivo.calculator");
		dc.setCapability("appActivity", "com.vivo.calculator.Calculator");
		dc.setCapability("newCommandTimeout", 120);
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		ad = new AndroidDriver(url,dc);
		
		WebElement eight = ad.findElement(By.id("com.vivo.calculator:id/digit8"));
		eight.click();
		WebElement add = ad.findElement(By.id("com.vivo.calculator:id/plus"));
		add.click();
		WebElement five = ad.findElement(By.id("com.vivo.calculator:id/digit5"));
		five.click();
		WebElement equal = ad.findElement(By.id("com.vivo.calculator:id/equal"));
		equal.click();
		
	}
}
  