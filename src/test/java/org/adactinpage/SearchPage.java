package org.adactinpage;

import org.baseclass.LibGloble;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends LibGloble {
	
	public SearchPage() {
		
	PageFactory.initElements(driver, this);
	
	}
	

	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	 

	@FindBy(id="room_type")
	private WebElement roomType;

	@FindBy(id="room_nos")
	private WebElement noRoom;

	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(id="child_room")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement search;
	

	public WebElement getSearch() {
		return search;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoRoom() {
		return noRoom;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}
	 
	
	public void searchHotel(String loc, String hot, String romtyp, String Nroom, String datein, String dateout, String ad, String ch) {

		
		selectByVisibleText(location, loc);
	selectByVisibleText(hotel, hot);	
	selectByVisibleText(roomType, romtyp);
	selectByVisibleText(noRoom, Nroom);
	selectByVisibleText(checkin, datein);
	selectByVisibleText(checkout, dateout);
	selectByVisibleText(adult, ad);
	selectByVisibleText(child, ch);
	click(search);
	
	
	}
	
	
	
	
	

}
