package JavascriptExecutorPRG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSexecutorFacebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\WorkSpace\\inmakes\\selenium\\ProjectSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		//typecasting
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','abc@gmail.com')", email);
		
		WebElement pass = driver.findElement(By.name("pass"));
		js.executeScript("arguments[0].setAttribute('value','qwerty')", pass);

		WebElement logIn = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", logIn);
	
		Thread.sleep(5000);
		driver.quit();

	}


}
