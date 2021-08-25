package com.stepdef;

import org.adactinpage.ConformationPage;
import org.adactinpage.LoginPage;
import org.adactinpage.SearchPage;
import org.baseclass.LibGloble;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefine extends LibGloble {

@Given("verify user in adactinpage")
public void verify_user_in_adactinpage() {
  browserConfig();
  openUrl("https://adactinhotelapp.com/");

}

@When("enter {string} and {string}and  click login")
public void enter_and_and_click_login(String user, String pass) throws InterruptedException {

LoginPage l=new LoginPage();
l.login(user, pass);

}

@When("enter search detalis{string},{string}, {string},{string},{string},{string},{string},{string}")
public void enter_search_detalis(String loc, String hot, String romtyp, String Nroom, String datein,
		String dateout, String ad, String ch) {

	SearchPage s= new SearchPage();
	s.searchHotel(loc, hot, romtyp, Nroom, datein, dateout, ad, ch);

}

@Then("navigate to booking conformation")
public void navigate_to_booking_conformation() {

	ConformationPage cp=new ConformationPage();
	cp.conform();

}

	
}
