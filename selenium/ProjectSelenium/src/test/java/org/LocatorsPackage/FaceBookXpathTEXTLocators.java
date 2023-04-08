package org.LocatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookXpathTEXTLocators {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
"D:\\WorkSpace\\inmakes\\maven\\projectMaven\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
				
		// to locate text tab by contains text path
		WebElement txt = driver.findElement(By.xpath("//h2[contains(text(),'you connect')]"));
		System.out.println(txt.getText());
		
		// to locate CreateAcc tab by TEXT PATH
		WebElement CreateAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
		CreateAcc.click();		
	
		Thread.sleep(5000);
		driver.quit();


	}

}
