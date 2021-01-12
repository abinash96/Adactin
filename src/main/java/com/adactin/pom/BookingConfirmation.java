package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation {
	
	private WebDriver driver;

	public BookingConfirmation(WebDriver bcdriver) {
		this.driver = bcdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@id='my_itinerary']")
	private WebElement myitinerary;

	public WebElement getMyitinerary() {
		return myitinerary;
	}

	@FindBy(id ="logout")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
	
	

}
