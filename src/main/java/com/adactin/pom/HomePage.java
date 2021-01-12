package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public static WebDriver driver;
	
	public HomePage(WebDriver ldriver ) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath ="//input[@type='text']")
	private WebElement username;

	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id ="login")
	private WebElement login;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
}
