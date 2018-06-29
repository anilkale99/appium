package basic.myproject.applayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	
	String closeButtonLoc = "com.money.manager.ex:id/skipTextView";
	
	public void clickClose(WebDriver driver) {
		
		driver.findElement(By.id(closeButtonLoc)).click();
		
	}

}
