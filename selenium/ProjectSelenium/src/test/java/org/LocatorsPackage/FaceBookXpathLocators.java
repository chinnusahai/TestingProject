package org.LocatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookXpathLocators {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
"D:\\WorkSpace\\inmakes\\maven\\projectMaven\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		// to locate email tab by id
		WebElement email = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		email.sendKeys("abc@gmail.com");
		
		// to locate password tab by NAME
		WebElement pass = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
		pass.sendKeys("abcasd");
		
		// to locate login tab by NAME
		WebElement logIn = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		logIn.click();		
	
		Thread.sleep(5000);
		driver.quit();


	}

}
