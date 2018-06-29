package basic.myproject.pageobjects.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GeneralPage {
	
	static String navUp = "//android.widget.ImageButton[@content-desc='Navigate up']";
	
	
	public static WebElement navigateUp(WebDriver driver) {
		
		return driver.findElement(By.xpath(navUp));
		
	}

}
