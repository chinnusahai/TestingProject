package JavascriptExecutorPRG;

import org.openqa.selenium.By;
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
		
		Thread.sleep(5000);
		WebElement sites = driver.findElement(By.xpath("//h4[contains(text(),'Network')]"));
		//typecasting
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", sites);
		
		Thread.sleep(5000);
		driver.quit();

	}


}
