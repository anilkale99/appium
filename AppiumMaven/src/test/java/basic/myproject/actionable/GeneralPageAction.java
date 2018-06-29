package basic.myproject.actionable;

import org.openqa.selenium.WebDriver;

import basic.myproject.pageobjects.web.MainPage;

public class GeneralPageAction {
	
	
	public static void clickNavUp(WebDriver driver) {
		MainPage.closeButton(driver).click();
	}

}
