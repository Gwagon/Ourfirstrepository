/**
 * 
 */
package cucumber.WEG;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import AutoPages.page_homepage;

public class PageObjectforall extends Driverforall implements page_homepage {

	

	public void base_url(String text) {
		driver.manage().window().maximize();
		driver.navigate().to(text);
	}

	public void dropdown_selector(String text, String text1) {
		Select select = new Select(driver.findElement(By.xpath(text)));
		select.selectByVisibleText(text1);
	}

	public String click_function(String text) {
		driver.findElement(By.id(text)).click();
		return text;
	}
	public String isEnabled_element(String text) {
		driver.findElement(By.id(text)).isEnabled();
		return text;
	}
	
	public String isDisplayed_element(String text) {
		driver.findElement(By.id(text)).isDisplayed();
		return text;
	}
	
	public String assert_text(String text) {
		String Actual_Title = driver.getTitle();
		String Expected_Title = text;
		Assert.assertEquals(Actual_Title, Expected_Title);
		return text;
	}

	public  void assert_text(String para1, String para2, String para3) {
		String Actual_text = driver.findElement(By.xpath(para1)).getAttribute(para2);
		String Expected_Text = para3;
		Assert.assertEquals(Actual_text, Expected_Text);
	}
	
	public void assert_text(String para, String para1) {
		String Actual_text = driver.findElement(By.xpath(para)).getText();
		String Expected_Text = para1;
		Assert.assertEquals(Actual_text, Expected_Text);
	}
	
	public  void sendtext(String para, String para1) {
		driver.findElement(By.id(para)).sendKeys(para1);
	}
    
	public String radio_button(String text) {
		driver.findElement(By.id(text)).click();
		return text;
	}

	public void closebrowser() {
		Set<Cookie> allCookies = driver.manage().getCookies();
		driver.quit();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Browser bug");
		}
	}
	
	public void switch_windows() {
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window

		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);

	}
   public void getsize() {
	   WebElement Image = driver.findElement(By.xpath("//img[@border='0']"));
       
       //Get width of element.
       int ImageWidth = Image.getSize().getWidth();
       System.out.println("Image width Is "+ImageWidth+" pixels");
       
       //Get width of element
       int ImageHeight = Image.getSize().getHeight(); 
       System.out.println("Image height Is "+ImageHeight+" pixels");
   }
	public LocalDateTime getTodayDate() {
		/**
		 * LocalDateTime now = LocalDateTime.now(); DateTimeFormatter formatter
		 * = DateTimeFormatter.ofPattern(DATEFORMAT); now.format(formatter);
		 **/
		return null;
	}

	public void gettime() {
		/**
		 * String validationMessage; private int year; private int month;
		 * private int day; private int hour = 24; private int minute; private
		 * static final String DATEFORMAT = "dd/mm/yyyy HH:mm";
		 * 
		 * LocalDateTime now = getTodayDate(); year = now.getYear(); month =
		 * now.getMonthValue(); day = now.getDayOfMonth(); hour = now.getHour();
		 * minute = now.getMinute();
		 * driver.findElement(By.id(FIRSTNAME)).sendKeys(Integer.toString(day));
		 **/
	}

	public void takescreenshot(String screenshot) {
		try {
			TakesScreenshot capture = (TakesScreenshot) driver;
			File source = capture.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screeenshot/" + screenshot + ".png"));
		} catch (Exception e) {
			System.out.println("Captured screen shot for fun");
		}

	}
	
	public void loop_click(){
			int counter = 0;
			while (counter < 10){
				counter = counter + 1;
				System.out.println(counter);
			}
			
		}
	}


