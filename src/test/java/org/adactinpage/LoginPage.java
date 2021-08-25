package org.adactinpage;

import org.baseclass.LibGloble;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGloble {

	public LoginPage() {
	PageFactory.initElements(driver, this);
}
	
	@FindBy(id="username")
	private WebElement textuser;
	
	@FindBy(id="password")
	private WebElement textpass;
	
	@FindBy(name="login")
	private WebElement loginBtn;


	
	public WebElement getTextuser() {
		return textuser;
	}

	public WebElement getTextpass() {
		return textpass;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public void login(String user, String pass) throws InterruptedException {
     type(textuser, user);
      type(textpass, pass);
            click(loginBtn);

	}

	

	
	
	
	
	
	
	
	
	
	
	
}
