package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginObjects {
	
	@FindBy(name = "userName")
	 private WebElement txtUsername;
	
	@FindBy(name = "password")
	 private WebElement txtPassword;
	
	@FindBy(name = "login")
	 private WebElement loginBtn;
	
	public void setUsername(String _userName){
		txtUsername.sendKeys(_userName);
	}
	
	public void setPassword(String _password){
		txtPassword.sendKeys(_password);
	}

	public void clickLoginButton() {
			loginBtn.click();
	}
}