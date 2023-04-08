package org.pojoFindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginFB extends BaseClass {

	public static void main(String[] args) {

		LaunchTheBrowser();
		LaunchUrl("https://www.facebook.com/");
	
		FbLoginpojo f = new FbLoginpojo();
		PassText("selenium", f.getMail());
		
		PassText("priya", f.getPass());
		
		driver.navigate().refresh();
		PassText("josh", f.getMail());
		PassText("shara", f.getPass());
		
	}

}
