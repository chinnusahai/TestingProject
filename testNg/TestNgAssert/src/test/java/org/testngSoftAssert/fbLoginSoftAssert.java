package org.testngSoftAssert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class fbLoginSoftAssert extends BaseClass{
	@Parameters({"user","pass"})
@Test
private void tc1() {
LaunchTheBrowser();
LaunchUrl("https://www.facebook.com/");
String title = driver.getTitle();
//SoftAssert
SoftAssert s = new SoftAssert();
s.assertEquals(title.contains("facebook"),"Check ur page title");
s.assertAll();
FbLoginpojo f = new FbLoginpojo();
PassText("selenium@gamil.com", f.getMail());
PassText("inmakes", f.getPass());
	}
}
