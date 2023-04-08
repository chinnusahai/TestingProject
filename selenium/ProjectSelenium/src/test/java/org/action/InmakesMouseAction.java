package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InmakesMouseAction {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
"D:\\WorkSpace\\inmakes\\maven\\projectMaven\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://lh.inmakesedu.com/");
		
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement cources = driver.findElement(By.id("navbarDropdown"));
		a.moveToElement(cources).perform();
		
		WebElement softwaretestng = driver.findElement(By.xpath("//p[text()='Software Testing Tamil']"));
		a.moveToElement(softwaretestng).perform();
		
		
		WebElement mastertstng = driver.findElement(By.xpath("//a[text()='ST Master Class']"));
		a.moveToElement(mastertstng).perform();
		
		Thread.sleep(5000);
		driver.quit();


	}

}
