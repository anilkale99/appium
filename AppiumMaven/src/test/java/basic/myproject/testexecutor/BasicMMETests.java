package basic.myproject.testexecutor;

import org.testng.annotations.Test;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basic.myproject.actionable.GeneralPageAction;
import basic.myproject.actionable.MainPageActions;
import basic.myproject.pageobjects.web.MainPage;



public class BasicMMETests extends BaseTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		launchApp(driver);
	}
	
	
	@Test(priority=0,groups="smoke")
	public void testCloseMainPage() throws MalformedURLException {
			MainPageActions.closeMainPage(driver);
	}
	
	@Test(priority=1,groups="dummy")
	public void test2() throws MalformedURLException {
			GeneralPageAction.clickNavUp(driver);
	}
	
	@Test(priority=0,groups="smoke")
	public void testCloseMainPage2() throws MalformedURLException {
			MainPageActions.closeMainPage(driver);
	}
	
	
	


}
