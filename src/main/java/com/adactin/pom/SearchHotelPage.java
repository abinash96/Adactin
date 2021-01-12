package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {
	public static WebDriver driver;
	
	public SearchHotelPage(WebDriver sdriver) {
		this.driver = sdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	@FindBy(id = "room_type")
	private WebElement room_type;
	
	@FindBy(id = "room_nos")
	private WebElement room_nos;
		
	@FindBy (id ="datepick_in")
	private WebElement checkin;
	
	@FindBy (id ="datepick_out")
	private WebElement checkout;

	@FindBy (id ="adult_room")
	private WebElement adultroom;
	
	@FindBy (id ="child_room")
	private WebElement childrens;
		
	@FindBy (id ="Submit")
	private WebElement submit;
	
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}
	public WebElement getDate() {
		return checkin;
	}
	
	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildrens() {
		return childrens;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
}
