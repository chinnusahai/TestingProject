package org.LocatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FaceBookDirectLocators {


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\WorkSpace\\inmakes\\selenium\\ProjectSelenium\\driver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		// to locate email tab by id
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abc@gmail.com");
		
		// to locate password tab by NAME
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("abcasd");
		
		// to locate login tab by NAME
		WebElement logIn = driver.findElement(By.name("login"));
		logIn.click();		
	
		Thread.sleep(5000);
		driver.quit();

	}

}
