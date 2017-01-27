
package cucumber.WEG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Driverforall {
	
	//public static WebDriver driver;
	
	
	 public static WebDriver driver = new FirefoxDriver();
	 
	
	 
	/*
	
	protected static WebDriver driver;
	protected WebDriver callDriver() {
		if(driver == null ) 
		{
			// driver = new ChromeDriver();
			 driver = new FirefoxDriver();
			 // driver = new InternetExplorerDriver();
           //  driver = new HtmlUnitDriver();
			 
		}
		return driver;
     }
	*/
	    
}