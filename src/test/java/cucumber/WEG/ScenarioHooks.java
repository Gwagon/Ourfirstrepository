package cucumber.WEG;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class ScenarioHooks {
	WebDriver driver;
	
		@After("@testcompleted")
		public void tearDown(Scenario scenario) {
			try {
				if (scenario.isFailed()) {
					final byte[] Screenshot = ((TakesScreenshot) Driverforall.driver)
							.getScreenshotAs(OutputType.BYTES);
					scenario.embed(Screenshot, "image/png");
				}
			} finally {
				if(!(driver ==null) ) 
				Driverforall.driver.quit();
				
			}
			//driver.close();
           // return driver;				
				//WebDriverWait Driverforall = new WebDriverWait(driver,10);
			}
		}

	


