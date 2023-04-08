package org.testng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Crossbrowser {
	
	@Parameters("browser")
	@Test
	private void tc1(String BrowserName) {
		if(BrowserName.equals("edge")) {
		WebDriverManager.edgedriver().setup();
		WebDriver d = new EdgeDriver();
		d.get("https://www.amazon.in/");		}
		else if(BrowserName.equals("fireFox")) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver d = new FirefoxDriver();
		d.get("https://www.flipkart.com/");}
		else if(BrowserName.equals("fireFox")) {
		WebDriverManager.edgedriver().setup();
		WebDriver d = new EdgeDriver();
		d.get("https://www.myntra.com/");}
	}
}
