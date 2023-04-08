package org.Alert;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class AlertwithText {
		

		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver",
	"D:\\WorkSpace\\inmakes\\selenium\\ProjectSelenium\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/Alerts.html");
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			// to locate email tab by id
			WebElement alert1= driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
			alert1.click();
			
			
			WebElement alert2= driver.findElement(By.xpath("//button[@class='btn btn-info']"));
			alert2.click();
			
			//switch to alert
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println(text);
			
			alert.sendKeys("priya");
			alert.accept();	
		
			Thread.sleep(5000);
			driver.quit();
		}
	}

