package cucumber.WEG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.When;

public class Tradeyourjet extends Driverforall{
	
	PageObjectforall genericclass = new PageObjectforall();
	
	@When("^I click on \"([^\"]*)\" Radio button$")
	public void i_click_on_Radio_button(String Radio) throws Throwable {
	   
		switch(Radio){
		case"Range":
			genericclass.click_function("q5");
			break;
			
		case"Take off time":
			genericclass.click_function("q7");
			break;
			
			default:
				break;
		}
	}

}
