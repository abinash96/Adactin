package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	
	private WebDriver driver;

	public SelectHotel(WebDriver hdriver) {
		this.driver = hdriver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(id ="radiobutton_0")
	private WebElement select;
		
	@FindBy(id ="continue")
	private WebElement click;
	
	public WebElement getSelect() {
		return select;
	}

	public WebElement getClick() {
		return click;
	}
	
}
