
package cucumber.WEG;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import AutoPages.page_homepage;
import AutoPages.trade_lux;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

 
public class Homepage_Tabs_Step_Def implements page_homepage, trade_lux {
WebDriver driver;
	public Homepage_Tabs_Step_Def(){
		this.driver = Driverforall.driver;
	}
	PageObjectforall genericclass = new PageObjectforall();

	@When("^I click on \"([^\"]*)\" tabs$")
	public void I_click_on_tabs(String regx) throws Throwable {
		switch (regx) {
		case "Trade your jet":
			genericclass.click_function(Tradeyourjet_tab);
			break;

		case "All Tabs":

			genericclass.isDisplayed_element(Homepage_tab);
			genericclass.isEnabled_element(Homepage_tab);
			genericclass.click_function(Homepage_tab);

			genericclass.isDisplayed_element(Tradeyourjet_tab);
			genericclass.isEnabled_element(Tradeyourjet_tab);
			genericclass.click_function(Tradeyourjet_tab);
			
			genericclass.click_function(Bookyourjet_tab);
			genericclass.click_function(Just_Trade_Tab);
			genericclass.click_function(Aboutus_tab);
			genericclass.click_function(Contact_support_tab);
			
			break;

		case "Homepage":
			Thread.sleep(2000);
			genericclass.click_function(Homepage_tab);
			break;

		case "Just your jet":
			genericclass.click_function(Just_Trade_Tab);
			break;

		case "Bookyourjet":
			genericclass.click_function(Bookyourjet_tab);
			break;
			
		case "Just Trade":
			genericclass.click_function(Just_Trade_Tab);
			break;

		case "About Us":
			genericclass.click_function("aboutustab");
			break;

		case "Contact Support":
			genericclass.click_function("contactsupporttab");
			break;
	
		default: System.out.print("object not found, please check your cucumber parameters");
			break;
		}
	}

	@Then("^\"([^\"]*)\" is displayed$")
	public void is_displayed(String confirm) throws Throwable {
		
		if (confirm.equals("Enteryourfirstname")){
			driver.findElement(By.name("firstname")).getAttribute("Enter your first name");
		}
        if (confirm.equals("Home")){
        	String Actual_Title = driver.getTitle();
			String Expected_Title = "Home";
			Assert.assertEquals(Actual_Title, Expected_Title);
           }
        if (confirm.equals("ContactPage")){
        	String Actual_Title = driver.getTitle();
			String Expected_Title = "ContactPage";
			Assert.assertEquals(Actual_Title, Expected_Title);
           }
        
	}

	
	@Then("^\"([^\"]*)\" text field is displayed$")
	public void text_field_is_displayed(String textfield) throws Throwable {
		switch (textfield) {
		case FIRSTNAME:
			genericclass.assert_text(FIRSTNAME, Placeholder_Object, PLACEHOLDER);
			break;

		default:
			break;
		}
	}

}
