package fbPojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FbLOgin {
	
	public FbLOgin(){
	}

		@FindBy(id = "email")
		private WebElement email;
	
		@FindBy(xpath = "//input[@data-testid='royal_pass']")
		private WebElement password;
		
		@FindBy(name = "login")
		private WebElement login;

		public WebElement getEmail() {
			return email;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLogin() {
			return login;
		}	
}
