package org.testng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CrossbrowserTestNG1 {

	@Test
	private void tc1() {
		WebDriverManager.edgedriver().setup();
		WebDriver d = new EdgeDriver();
		d.get("https://www.amazon.in/");
	}@Test
	private void tc5() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver d = new FirefoxDriver();
		d.get("https://www.flipkart.com/");
	}@Test
	private void tc3() {
		WebDriverManager.edgedriver().setup();
		WebDriver d = new EdgeDriver();
		d.get("https://www.myntra.com/");
	}@Test
	private void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
	}	
}
