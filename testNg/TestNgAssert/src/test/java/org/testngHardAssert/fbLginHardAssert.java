package org.testngHardAssert;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class fbLginHardAssert extends BaseClass{
	@Parameters({"user","pass"})
@Test
private void tc1() {
LaunchTheBrowser();
LaunchUrl("https://www.facebook.com/");
String title = driver.getTitle();
//hard Assert
Assert.assertTrue(title.contains("facebook"),"Check ur page title");
FbLoginpojo f = new FbLoginpojo();
PassText("testNg@gmail.com", f.getMail());
PassText("Assert", f.getPass());
	}
}
