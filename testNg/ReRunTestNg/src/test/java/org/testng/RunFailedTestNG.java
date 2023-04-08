package org.testng;
import org.testng.annotations.Test;
public class RunFailedTestNG extends BaseClass {
@Test(retryAnalyzer = Failed.class )

	private void tc1() {
		LaunchTheBrowser();
		LaunchUrl("https://www.amazon.i/");
	}
}
