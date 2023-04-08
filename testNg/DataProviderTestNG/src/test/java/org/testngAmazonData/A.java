package org.testngAmazonData;	
import org.testng.annotations.Test;
public class A {
@Test(dataProvider = "aData" , dataProviderClass = AmazonDataProvider.class)
private void tc33(String data) {
System.out.println(data);
}
}
