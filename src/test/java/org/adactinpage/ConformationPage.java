package org.adactinpage;

import org.baseclass.LibGloble;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConformationPage extends LibGloble {
	
	public ConformationPage() {
	
		PageFactory.initElements(driver, this);
	
	}
	

	@FindBy(id="radiobutton_0")
	private WebElement rbtn;
	

	@FindBy(name="continue")
	private WebElement count;


	public WebElement getRbtn() {
		return rbtn;
	}


	public WebElement getCount() {
		return count;
	}
	
public void conform() {

click(rbtn);
click(count);
}
	
	
}
