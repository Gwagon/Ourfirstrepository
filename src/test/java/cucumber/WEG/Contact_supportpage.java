package cucumber.WEG;

import org.openqa.selenium.WebDriver;

import AutoPages.trade_lux;
import cucumber.api.java.en.Then;

public class Contact_supportpage extends Driverforall implements trade_lux{
	
	WebDriver driver;
	public Contact_supportpage(){
		this.driver = Driverforall.driver;
	}
	
	PageObjectforall common_function = new PageObjectforall();
	
	@Then("^the \"([^\"]*)\" is displayed in the text field$")
	public void the_is_displayed_in_the_text_field(String placeholder) throws Throwable {
		if (placeholder.equals("Name")){
			common_function.assert_text(".//*[@id='q1']", Placeholder_Object, "Enter your name"); 		
		}
		if (placeholder.equals("Middle name")){
			common_function.assert_text(".//*[@id='q2']",Placeholder_Object, "Enter your middle name");
		}
		if (placeholder.equals("Surname")){
			common_function.assert_text(".//*[@id='q3']",Placeholder_Object, "Enter your surname");
		}
		if (placeholder.equals("Address")){
			common_function.assert_text(".//*[@id='q8']",Placeholder_Object, "Enter your address");
		}
		if (placeholder.equals("Postcode")){
			common_function.assert_text(".//*[@id='q9']",Placeholder_Object, "Enter your postcode");
		}
		if (placeholder.equals("Email")){
			common_function.assert_text(".//*[@id='q10']",Placeholder_Object, "Enter your email");
		}
		else if (placeholder.equals("Message")){
			common_function.assert_text(".//*[@id='q11']",Placeholder_Object, "Enter your message");
		}
	}

}
