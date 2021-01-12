package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	private WebDriver driver;

	public BookHotel(WebDriver bdriver) {
		this.driver = bdriver;
		PageFactory.initElements(driver, this);
}
	@FindBy(id ="first_name")
	private WebElement firstname;
	
	
	@FindBy(id ="last_name")
	private WebElement lastname;
	
	@FindBy(id ="address")
	private WebElement address;
	
	@FindBy(id ="cc_num")
	private WebElement cardno;
	
	@FindBy(id ="cc_type")
	private WebElement cardtype;
	
	@FindBy(id ="cc_exp_month")
	private WebElement cardmonth;
	
	@FindBy(id ="cc_exp_year")
	private WebElement cardyear;
	
	@FindBy(id ="cc_cvv")
	private WebElement cardnum;
	
	@FindBy(id ="book_now")
	private WebElement booknow;
	
	
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getCardmonth() {
		return cardmonth;
	}

	public WebElement getCardyear() {
		return cardyear;
	}

	public WebElement getCardnum() {
		return cardnum;
	}

	public WebElement getBooknow() {
		return booknow;
	}
}
