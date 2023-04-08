package org.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookScreenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", 
	"D:\\WorkSpace\\inmakes\\selenium\\ProjectSelenium\\driver\\chromedriver.exe");

		WebDriver d= new ChromeDriver();
		d.get("https://demo.automationtesting.in/Alerts.html");
		
		TakesScreenshot ts = (TakesScreenshot)d;
		
		File SS = ts.getScreenshotAs(OutputType.FILE);
		
		File f = new File("D:\\WorkSpace\\inmakes\\selenium\\ProjectSelenium\\Screenshot\\Alert.png");
		//add common io jar and add to buildpath.
		FileUtils.copyFile(SS, f);
	}

}
