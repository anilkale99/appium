package basic.myproject.tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basic.myproject.applayer.MainPage;
import io.appium.java_client.remote.MobileCapabilityType;


public class BasicLaunchTestMM extends BaseTest{
	
	WebDriver driver;
	
	@BeforeTest
	public void setup1() throws MalformedURLException {
			launchApp(driver);
	}
	
	
	@Test
	public void test() {
		MainPage main= new MainPage();
		main.clickClose(driver);
		
	}

}
