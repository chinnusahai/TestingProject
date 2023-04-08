package org.projectMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class azSessionNotCreatedException {

	public static void main(String[] args) {//serssion not created
			//Step 1 : web browser configuration 
		System.setProperty("webdriver.chrome.driver",
"D:\\WorkSpace\\inmakes\\maven\\projectMaven\\driver\\chromedriver.exe");
		
			// step 2 browser launching
		WebDriver driver = new ChromeDriver();
		
		//when there is a problem with the url
			//step 3 launch url
		driver.get("https://www.amazon.in/");
		
			//step 4 maximise browser
		driver.manage().window().maximize();
		
			//step 5 get page title
		String title = driver.getTitle();
		System.out.println(title);

			//step 6 get current url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
			// step 7 to close the current page
		driver.close();
		
			// step 8 to close the entire browser
		driver.quit();
	}

}
