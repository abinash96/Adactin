package com.adactin.stepdefinition;

import javax.tools.DocumentationTool.Location;

import org.openqa.selenium.WebDriver;

import com.adactin.BaseClass;
import com.adactin.pom.BookHotel;
import com.adactin.pom.BookingConfirmation;
import com.adactin.pom.HomePage;
import com.adactin.pom.SearchHotelPage;
import com.adactin.pom.SelectHotel;

import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass {
	
	public static WebDriver driver;
	
	@Given("^User launches the application$")
	public void user_launches_the_application() throws Throwable {
		 driver = getBrowser("chrome");
		 geturl("http://adactinhotelapp.com/");
	}

	@When("^User enters the valid username in the username field$")
	public void user_enters_the_valid_username_in_the_username_field() throws Throwable {
		HomePage hp = new HomePage(driver);
		inputValueElement(hp.getUsername(),"abinash2796");
	}

	@When("^User enters the valid password in the password field$")
	public void user_enters_the_valid_password_in_the_password_field() throws Throwable {
		HomePage hp = new HomePage(driver);
		inputValueElement(hp.getPassword(), "Abinash@271996");
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		HomePage hp = new HomePage(driver);
		clickOnElement(hp.getLogin());
	}

	@Then("^User verifies whether the Homepage navigates to the Search Hotel Page$")
	public void user_verifies_whether_the_Homepage_navigates_to_the_Search_Hotel_Page() throws Throwable {
		SearchHotelPage shp = new SearchHotelPage(driver);
		
	}

	@When("^User selects the location \"([^\"]*)\" as \"([^\"]*)\" in the Select location field$")
	public void user_selects_the_location_as_in_the_Select_location_field(String arg1, String arg2) throws Throwable {
		SearchHotelPage shp = new SearchHotelPage(driver);
		selection(shp.getLocation() , "byIndex", "3"); 
	}

	@When("^User selects the Hotel \"([^\"]*)\" as \"([^\"]*)\" in select Hotel field$")
	public void user_selects_the_Hotel_as_in_select_Hotel_field(String arg1, String arg2) throws Throwable {
		SearchHotelPage shp = new SearchHotelPage(driver);
		selection(shp.getHotels() , "byIndex", "3"); 
	}

	@When("^User selects the room type in select Room type field$")
	public void user_selects_the_room_type_in_select_Room_type_field() throws Throwable {
		SearchHotelPage shp = new SearchHotelPage(driver);
		selection(shp.getRoom_nos() , "byIndex", "3"); 
	}

	@When("^User selects the number of rooms$")
	public void user_selects_the_number_of_rooms() throws Throwable {
		SearchHotelPage shp = new SearchHotelPage(driver);
		selection(shp.getRoom_type() , "byIndex", "3"); 
	}

	@When("^User selects the check in date$")
	public void user_selects_the_check_in_date() throws Throwable {
		SearchHotelPage shp = new SearchHotelPage(driver);
		inputValueElement(shp.getCheckin(), "11/01/2021");
	}

	@When("^User selects the check out date$")
	public void user_selects_the_check_out_date() throws Throwable {
		SearchHotelPage shp = new SearchHotelPage(driver);
		inputValueElement(shp.getCheckout(), "14/01/2021");
	}

	@When("^User selects the adults per Room$")
	public void user_selects_the_adults_per_Room() throws Throwable {
		SearchHotelPage shp = new SearchHotelPage(driver);
		selection(shp.getAdultroom(), "byIndex", "3");
	}

	@When("^User selects the children per room$")
	public void user_selects_the_children_per_room() throws Throwable {
		SearchHotelPage shp = new SearchHotelPage(driver);
		selection(shp.getChildrens(), "byIndex", "3");
	}

	@When("^User clicks on search button to search for the details$")
	public void user_clicks_on_search_button_to_search_for_the_details() throws Throwable {
		SearchHotelPage shp = new SearchHotelPage(driver);
		clickOnElement(shp.getSubmit());
	}

	@Then("^User veriy the Search Hotel Page navigates to Select hotel page$")
	public void user_veriy_the_Search_Hotel_Page_navigates_to_Select_hotel_page() throws Throwable {
		SelectHotel sh = new SelectHotel(driver);
	}

	@When("^User clicks on the selected radion button$")
	public void user_clicks_on_the_selected_radion_button() throws Throwable {
		SelectHotel sh = new SelectHotel(driver);
		clickOnElement(sh.getSelect());
	}

	@When("^User clicks on the continue button$")
	public void user_clicks_on_the_continue_button() throws Throwable {
		SelectHotel sh = new SelectHotel(driver);
		clickOnElement(sh.getClick());
	}

	@Then("^User verify the Select Hotel Page navigates to Book a Hotel page$")
	public void user_verify_the_Select_Hotel_Page_navigates_to_Book_a_Hotel_page() throws Throwable {
		BookHotel bh = new BookHotel(driver);
	}

	@When("^User enters the first name in FirstName field$")
	public void user_enters_the_first_name_in_FirstName_field() throws Throwable {
		BookHotel bh = new BookHotel(driver);
		inputValueElement(bh.getFirstname(), "John");
	}

	@When("^User enters the last name in LastName field$")
	public void user_enters_the_last_name_in_LastName_field() throws Throwable {
		BookHotel bh = new BookHotel(driver);
		inputValueElement(bh.getLastname(), "Wick");
	}

	@When("^User enters the billing Address in Billing Address field$")
	public void user_enters_the_billing_Address_in_Billing_Address_field() throws Throwable {
		BookHotel bh = new BookHotel(driver);
		inputValueElement(bh.getAddress(), "Sevvepet road, Thiruvallur");
	}

	@When("^User enters the Credit Card Number in Credit Card Number field$")
	public void user_enters_the_Credit_Card_Number_in_Credit_Card_Number_field() throws Throwable {
		BookHotel bh = new BookHotel(driver);
		inputValueElement(bh.getCardno(), "9874563210123456");
	}

	@When("^User enters the credit card type in Credit Card Type field$")
	public void user_enters_the_credit_card_type_in_Credit_Card_Type_field() throws Throwable {
		BookHotel bh = new BookHotel(driver);
		selection(bh.getCardtype(), "byIndex", "2");
		
	}

	@When("^User enters expiry month in Expiry Month field$")
	public void user_enters_expiry_month_in_Expiry_Month_field() throws Throwable {
		BookHotel bh = new BookHotel(driver);
		selection(bh.getCardmonth(), "byIndex", "2");
	}

	@When("^User enters expiry year in Expiry Year field$")
	public void user_enters_expiry_year_in_Expiry_Year_field() throws Throwable {
		BookHotel bh = new BookHotel(driver);
		selection(bh.getCardyear(), "byValue", "2022");
	}

	@When("^User enters the cvv number in CVV field$")
	public void user_enters_the_cvv_number_in_CVV_field() throws Throwable {
		BookHotel bh = new BookHotel(driver);
		inputValueElement(bh.getCardnum(), "953");
	}

	@When("^User clicks on the BookNow Button$")
	public void user_clicks_on_the_BookNow_Button() throws Throwable {
		BookHotel bh = new BookHotel(driver);
		clickOnElement(bh.getBooknow());
	}

	@Then("^User verify the Book a Hotel navigates to Booking confirmation page$")
	public void user_verify_the_Book_a_Hotel_navigates_to_Booking_confirmation_page() throws Throwable {

	}

	@When("^User clicks on book itinerary button$")
	public void user_clicks_on_book_itinerary_button() throws Throwable {
		BookingConfirmation bc = new BookingConfirmation(driver);
		Thread.sleep(3000);
		clickOnElement(bc.getMyitinerary());
	}

	@When("^User clicks on log our button to exit the page$")
	public void user_clicks_on_log_our_button_to_exit_the_page() throws Throwable {
		BookingConfirmation bc = new BookingConfirmation(driver);
		clickOnElement(bc.getLogout());
	}

	@Then("^User verify Book Itinerary page navigates to sucessfully logged out page$")
	public void user_verify_Book_Itinerary_page_navigates_to_sucessfully_logged_out_page() throws Throwable {

	}

}
