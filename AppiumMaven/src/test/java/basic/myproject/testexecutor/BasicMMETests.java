package basic.myproject.testexecutor;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basic.myproject.actionable.GeneralPageAction;
import basic.myproject.actionable.MainPageActions;
import basic.myproject.pageobjects.web.MainPage;



public class BasicMMETests extends BaseTest {
	
	
	WebDriver driver;
	
	@Test(priority=0)
	public void test1() throws MalformedURLException {
			launchApp(driver);
			MainPageActions.clickClose(driver);
	}
	
	@Test(priority=1)
	public void test2() throws MalformedURLException {
			launchApp(driver);
			GeneralPageAction.clickNavUp(driver);
	}
	
	
	


}
