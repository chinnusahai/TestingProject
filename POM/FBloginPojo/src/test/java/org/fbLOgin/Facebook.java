package org.fbLOgin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	public static WebDriver driver;
	public static void LaunchBrowser() {
		WebDriverManager.chromedriver().setup(); //import maven dependency in pom. xml
		driver = new ChromeDriver();
	}
	
	public static void main(String[] args) {

		LaunchBrowser();

		
 
	}

}