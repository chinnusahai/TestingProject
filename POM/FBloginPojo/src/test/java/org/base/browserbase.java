package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserbase {
	public static void launchbrowser() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get(" https://www.facebook.com");
	}

}
