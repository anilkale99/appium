package basic.myproject.pageobjects.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	
	static String  closeButtonLoc = "com.money.manager.ex:id/skipTextView";
	
	public static WebElement closeButton(WebDriver driver) {
		return driver.findElement(By.id(closeButtonLoc));
		
	}
	


}
