package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\WorkSpace\\inmakes\\selenium\\ProjectSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		
		//declare select class
		Select s = new Select(fruits);
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		s.selectByIndex(0);
		s.selectByValue("apple");
		s.selectByVisibleText("Orange");
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		System.out.println(allSelectedOptions);
		
		s.deselectAll();
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
