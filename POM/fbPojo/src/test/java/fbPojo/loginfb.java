package fbPojo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginfb {
	    public static WebDriver driver;
	    
	    public static void main(String[] args) {

	        // Set up the ChromeDriver
	    	
	        driver.manage().window().maximize();
	        
	        // Navigate to the Facebook login page
	        driver.get("https://www.facebook.com/");
	        
	        // Fill in the login form and click the Login button
	        WebElement email = driver.findElement(By.id("email"));
	         
	        WebElement password = driver.findElement(By.id("pass"));
	        WebElement loginButton = driver.findElement(By.name("login"));
	        
	        email.sendKeys("your_facebook_email");
	        password.sendKeys("your_facebook_password");
	        loginButton.click();

	    }
}
