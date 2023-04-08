package org.junitSuite2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	public static void LaunchTheBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static void WindowMaximize() {
		driver.manage().window().maximize();
	}
	public static void CloseTheBrowser() {
		driver.close();
		driver.quit();
	}
	public static void LaunchUrl(String s) {
		driver.get(s);
	}
	public static void PassText(String s , WebElement e) {
	       e.sendKeys(s);
	}

	public static String pagetitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}
	public static String pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;
	}
	
	
}
