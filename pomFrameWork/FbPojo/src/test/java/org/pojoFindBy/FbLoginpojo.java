package org.pojoFindBy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginpojo extends BaseClass {

	public FbLoginpojo() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({
	@FindBy(xpath = "//input[@id='email']"),
	@FindBy(xpath = "//input[@name='email']"),
	@FindBy(xpath = "//input[@data-testid='royal_email']]")
	})
	private WebElement mail;
	
	@FindBy(xpath = "//input[@data-testid='royal_pass']")
	private WebElement pass;
	
	@FindBy(name = "login")
	private WebElement login;

	public WebElement getMail() {
		return mail;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}
}
