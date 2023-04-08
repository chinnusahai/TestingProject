package org.install;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class seleniumInstall {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\inmakes\\selenium\\SeleniumLibDri\\driver\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver(); 
		
		
	}
}
