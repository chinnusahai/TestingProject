
	package org.junitTesting;
	import java.util.Date;
	import org.junit.After;
	import org.junit.AfterClass;
	import org.junit.Before;
	import org.junit.BeforeClass;
	import org.junit.Test;
	

public class Shopping extends BaseClass{
		@Test
		public void tc5() {
			System.out.println(" test case 5");
		}
		@Before
		public void startdate() {
			Date d = new Date();
			System.out.println(d);
		}
		@After
		public void Enddate() {
			Date d = new Date();
			System.out.println(d);
		}
		@BeforeClass
	public static void launch()	{
			LaunchTheBrowser();
			System.out.println("launch the browser");
			WindowMaximize();
		}
		@AfterClass
	public static void launchclose() {
			CloseTheBrowser();
		}
		@Test
	public void tc3()	{
			System.out.println("snapdeal");
			LaunchUrl("https://www.snapdeal.com/");
		}@Test
	public void tc1() {
			System.out.println("facebook");
			LaunchUrl("https://www.facebook.com/");
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
