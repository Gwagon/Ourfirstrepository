package cucumber.WEG;


import org.openqa.selenium.WebDriver;

import AutoPages.Tradeyourjetpage;
import AutoPages.bookjet_int;
import AutoPages.page_homepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class book_your_jet implements page_homepage, Tradeyourjetpage, bookjet_int{
	WebDriver driver;
	
	public book_your_jet(){
	this.driver = Driverforall.driver;
	}
	PageObjectforall genericclass = new PageObjectforall();
	
	@Given("^the \"([^\"]*)\" page is displayed$")
	public void the_page_is_displayed(String text) throws Throwable {
		switch(text) {
		case Home_Page:
			this.genericclass.assert_text(Home_Page);
			break;
		case "Bookyourjet":
			genericclass.assert_text(Bookyourjet_tab, bookyourjet_selector);
			break;
		default:
			break;
		}
	}

	@Given("^I enter \"([^\"]*)\" in the text field$")
	public void i_enter_in_the_text_field(String text) throws Throwable {
switch(text){
case startdestination_text:
	this.genericclass.isDisplayed_element(startdestination_selector);
	this.genericclass.sendtext(startdestination_selector, startdestination_data);
	break;
	
case enddestination_text:
	this.genericclass.sendtext(enddestination_selector, enddestination_data);
	break;
	
case "2m_Current_jet_price_text":
	genericclass.sendtext(current_jet_price_textfield,current_jet_price_Data);
	break;
	
case "15m_Purchase_price_text":
	genericclass.sendtext(purchase_price_textfield,purchase_price_Data);
	break;
	
case "120000h_Flight_time":
	genericclass.sendtext(flight_time_textfield,flight_time_Data);
	break;
	default:
		break;
}
	}

	@Given("^I select \"([^\"]*)\" from the select zone dropdown$")
	public void i_select_from_the_select_zone_dropdown(String arg1) throws Throwable {
    genericclass.dropdown_selector(".//*[@id='q15']", "US");
	}

	@When("^I check \"([^\"]*)\" checkbox$")
	public void i_check_radio_button(String text) throws Throwable {
    genericclass.radio_button(radiobutton_range);

	}
}
