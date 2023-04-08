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

	public class AppMyntra
	{
		public static AndroidDriver ad ;
		public static void main(String[] args) throws MalformedURLException, AWTException, InterruptedException
	 {	
			DesiredCapabilities dc = new DesiredCapabilities();	
			dc.setCapability("latformName", "Android");
			dc.setCapability("platformversion", "12");
			dc.setCapability("deviceName", "V2151");
			dc.setCapability("udid"  , "13862558020002Z");
			dc.setCapability("appPackage", "com.myntra.android");
			dc.setCapability("appActivity", "com.myntra.android.SplashActivity");
			dc.setCapability("newCommandTimeout", 120);
			
			URL url = new URL("http://0.0.0.0:4723/wd/hub");
			ad = new AndroidDriver(url,dc);
			
			Thread.sleep(2000);
			WebElement tab = ad.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"search\"]"));
			ad.navigate().back();
			tab.sendKeys("shirts");

			 Robot r = new Robot();
			 r.keyPress(KeyEvent.VK_ENTER);
			 r.keyRelease(KeyEvent.VK_ENTER);
	}
}
