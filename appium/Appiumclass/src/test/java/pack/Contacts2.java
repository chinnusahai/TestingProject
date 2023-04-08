package pack;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.appium.java_client.android.AndroidDriver;

public class Contacts2 {
	public static AndroidDriver ad ;
	ExtentHtmlReporter rep;
	ExtentReports e;
	ExtentTest test;
	
@BeforeSuite
private void tc1() throws IOException {

		rep = new ExtentHtmlReporter("r1.html") ; 
		e = new ExtentReports();
		e.attachReporter(rep);
		
		 test = e.createTest("Android","contact application");
		
		Properties p = new Properties();
		FileInputStream fi = new FileInputStream("D:\\WorkSpace\\inmakes\\appium\\Appiumclass\\File\\configCont.properties");
		p.load(fi);

		DesiredCapabilities dc = new DesiredCapabilities();	
		dc.setCapability("platformName", p.getProperty("platformName"));
		dc.setCapability("platformversion", p.getProperty("platformVersion"));
		dc.setCapability("deviceName", p.getProperty("deviceName"));
		dc.setCapability("udid"  , p.getProperty("udid"));
		dc.setCapability("appPackage", p.getProperty("appPackage"));
		dc.setCapability("appActivity", p.getProperty("appActivity"));
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		ad = new AndroidDriver(url,dc);	
		
		test.log(Status.INFO,"Click the allow button");
		WebElement allow  = ad.findElement(By.id("allow"));
		allow.click();
		
		test.log(Status.PASS,"Click the allow button");
		WebElement allow1  = ad.findElement(By.id("allow1"));
		allow1.click();
	}
	@Test(priority = 1)
	private void tc2() {
		test.log(Status.PASS," appium write tc 2");
		System.out.println("tc2");
	}
	@Test(priority = 1)
	private void tc3() {
		test.log(Status.PASS," appium write tc 3");
		System.out.println("tc3");
	}
	@AfterSuite
	private void tc4() {

		test.log(Status.PASS," appium close apk");
		System.out.println("tc4");
		ad.quit();
	}
}





//WebElement plus = ad.findElement(By.id("plus"));
//plus.click();
//WebElement name = ad.findElement(By.xpath("name"));
//name.sendKeys("priya");
//WebElement phone = ad.findElement(By.id("phone"));
//phone.sendKeys("7788445511");
//WebElement save = ad.findElement(By.id("save"));
//save.click();