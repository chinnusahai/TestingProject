package org.calc;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
public class RCalender {
public static void main(String[] args) throws MalformedURLException {
	//Same as system.setProperties webdeiver.chrome.driver/ 
// to give device details
DesiredCapabilities cap = new DesiredCapabilities();
cap.setCapability("platformName","Android");
cap.setCapability("platformversion","12");
cap.setCapability("deviceName","V2151");
cap.setCapability("udid","13862558020002Z");
cap.setCapability("appPackage","com.vivo.calculator");
cap.setCapability("appActivity","com.vivo.calculator.Calculator");
URL url = new URL("http://0.0.0.0:4723/wd/hub");///wd/hub for version v1 in appium
AndroidDriver ad = new AndroidDriver(url,cap);
WebElement five = ad.findElement(By.id("com.vivo.calculator:id/digit5"));
five.click();
WebElement two = ad.findElement(By.id("com.vivo.calculator:id/digit2"));
two.click();
WebElement plus = ad.findElement(By.id("com.vivo.calculator:id/plus"));
plus.click();
WebElement three = ad.findElement(By.id("com.vivo.calculator:id/digit3"));
three.click();
WebElement one = ad.findElement(By.id("com.vivo.calculator:id/digit1"));
one.click();
WebElement equal = ad.findElement(By.id("com.vivo.calculator:id/equal"));
equal.click();}}
