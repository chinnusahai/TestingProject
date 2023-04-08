package org.fbLOgin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLoginPOJO {
	// non para constructor
	public FacebookLoginPOJO() {		
	}
	//private web elememts
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(name = "pass")
	private WebElement pass;

	@FindBy(id = "login")
	private WebElement loginBTN;
	
	//to get getters to access the element outsite the elements.
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginBTN() {
		return loginBTN;
	}

}
