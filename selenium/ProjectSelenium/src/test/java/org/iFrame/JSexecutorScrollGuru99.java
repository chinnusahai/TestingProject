package org.iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSexecutorScrollGuru99 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\WorkSpace\\inmakes\\selenium\\ProjectSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		//driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		System.out.println(iframe.getSize());
		
		Thread.sleep(5000);
		WebElement frames = driver.findElement(By.tagName("iframe"));
		frames.click();
		
		Thread.sleep(5000);
		driver.quit();

	}


}
