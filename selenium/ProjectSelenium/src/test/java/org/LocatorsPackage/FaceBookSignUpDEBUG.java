package org.LocatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookSignUpDEBUG {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
"D:\\WorkSpace\\inmakes\\maven\\projectMaven\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement CreateAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
		CreateAcc.click();	//setting breakpoint	
		// prss fn +f6
		WebElement female = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			//skips the line
		female.click();
	
		Thread.sleep(5000);
		driver.quit();


	}

}
