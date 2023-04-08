package org.pojo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginFB extends BaseClass {

	public static void main(String[] args) {

		LaunchTheBrowser();
		LaunchUrl("https://www.facebook.com/");
		
//		WebElement email = driver.findElement(By.id("email"));
//		WebElement password = driver.findElement(By.name("pass"));
	
		FbLoginpojo f = new FbLoginpojo();
		PassText("selenium", f.getMail());
		
		PassText("priya", f.getPass());
		
		driver.navigate().refresh();
		PassText("josh", f.getMail());
		PassText("shara", f.getPass());
		
	}

}
