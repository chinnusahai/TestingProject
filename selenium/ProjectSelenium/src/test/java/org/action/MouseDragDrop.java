package org.action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragDrop {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\WorkSpace\\inmakes\\selenium\\ProjectSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/");
		
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement sele = driver.findElement(By.xpath("(//a[contains(text(),'Selenium')])[2]"));
		sele.click();
		
		// to locate CreateAcc tab by TEXT PATH
		WebElement DDaction = driver.findElement(By.xpath("(//a[contains(text(),' Action')])"));
		DDaction.click();		
	
		Thread.sleep(3000); // not working
		WebElement bank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement debitside = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(bank, debitside).perform();
		
		WebElement B500 = driver.findElement(By.xpath("(//li[@data-id='2'])[1]"));
		WebElement debitAmt = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.dragAndDrop(B500, debitAmt).perform();
		
		WebElement sales = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement credi = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		a.dragAndDrop(sales, credi).perform();
		
		WebElement c500 = driver.findElement(By.xpath("(//li[@data-id='2'])[2]"));
		WebElement creditAmt = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		a.dragAndDrop(c500, creditAmt).perform();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
