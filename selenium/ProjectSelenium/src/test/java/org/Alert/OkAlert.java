package org.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OkAlert {
	

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\WorkSpace\\inmakes\\selenium\\ProjectSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// to locate email tab by id
//		WebElement alert1= driver.findElement(By.id());
//		alert1.click();
//		
//		
		WebElement alert1= driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alert1.click();
		
		//switch to alert
		Alert alert = driver.switchTo().alert();
		alert.accept();	
	
		Thread.sleep(5000);
		driver.quit();
	}
}
