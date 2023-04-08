package org.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class fbLginTestNG extends BaseClass{
	@DataProvider(name = "data")
private Object[][] datas() {
return new Object[][] {
	{"a@gmail.com","7845"},
	{"b@gmail.com","9685"},
	{"c@gmail.com","1245"},
	{"d@gmail.com","3216"},
};
}
@Test(dataProvider = "data")
private void tc1(@Optional("asc") String e,@Optional("priya") String p) {
LaunchTheBrowser();
LaunchUrl("https://www.facebook.com/");
FbLoginpojo f = new FbLoginpojo();
PassText(e, f.getMail());
PassText(p, f.getPass());
	}
}
