package fbPojo;
import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbook  extends BaseClass{

	public static void main(String[] args) {

		LaunchBrowser();
		launchURL("https://en-gb.facebook.com/");
		
		windowMaximize();
		
	}
}
