/**
 * 
 */
package cucumber.WEG;

import org.openqa.selenium.WebDriver;

import AutoPages.page_homepage;
import AutoPages.trade_lux;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



/**
 * @author Godswill
 *
 */
public class Homepage_Step_Def implements page_homepage, trade_lux {
	
	 WebDriver driver;
	 

	 
	 
	 public Homepage_Step_Def(){
		 this.driver = Driverforall.driver;
	 }
	 PageObjectforall genericclass = new PageObjectforall();
	
	@Given("^I launch the url$")
	public void I_launch_the_url() throws Throwable {
		 genericclass.base_url(Base_Url);
		 genericclass.getsize();
	}


	@Then("^the \"([^\"]*)\" is displayed$")
	public void the_is_displayed(String text) throws Throwable {
		switch (text){
		case Home_Page:
			genericclass.assert_text(Home_Page);
			break;
		case ENTER_FN_PARAM:
		      genericclass.assert_text(FIRSTNAME, Placeholder_Object, PLACEHOLDER);
			break;
		case "Pagetext_Offer":
			genericclass.assert_text(page_Offer_selector, page_Offer_text);
			
			break;
			default:
				break;
		}
	}
	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
	   genericclass.closebrowser();
	}
}
	/**
	@After
	public void closebrowser(){
		driver.close();
		try {
			Thread.sleep(2000);
		}
		catch(Exception e){
			System.out.println("Browser bug");
		     }
		}
}
	**/
	//POM.takescreenshot("Screenshot");
	
    
