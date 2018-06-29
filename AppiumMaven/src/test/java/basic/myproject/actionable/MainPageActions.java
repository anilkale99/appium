package basic.myproject.actionable;


import org.openqa.selenium.WebDriver;

import basic.myproject.pageobjects.web.MainPage;

public class MainPageActions {
	
	
		public static void clickClose(WebDriver driver) {
			MainPage.closeButton(driver).click();
		}

}
