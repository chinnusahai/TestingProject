package org.junitSuite;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
public class FbLoginJunit extends BaseClass{	
	@BeforeClass
	public static void launchBrowser() {
		 LaunchTheBrowser();
		 LaunchUrl("https://www.facebook.com/");
	} 	
	@Test
	public void tc1() {
		FbLoginpojo f = new FbLoginpojo();
		String title = pagetitle();
		String pageUrl = pageUrl();
		PassText("selenium", f.getMail());
		
		//assert org.junit
		Assert.assertTrue("Check ur page title", title.contains("Facebook"));
		
		PassText("priya", f.getPass());
		
	}@Test
	public void tc4() {
			System.out.println("myntra");
			LaunchUrl("https://www.myntra.com/");
		}@Test
	public void tc2() {
			System.out.println("flipkart");
			LaunchUrl("https://www.flipkart.com/");
}
}
