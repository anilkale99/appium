package basic;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class AndroidWebTest {
	
	AndroidDriver driver;
	
	@BeforeTest
	public void setup1() throws MalformedURLException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\seleniumdrivers\\chromedriver.exe");
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//cap.setCapability(CapabilityType.BROWSER_NAME, "Android");
		
		cap.setCapability(CapabilityType.PLATFORM, "Android");
		cap.setCapability(CapabilityType.VERSION, "5.0.1");
		cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability("platformName", "Android");
		cap.setCapability("browserName", "Chrome");
		cap.setCapability("deviceName", "aaa");
		//cap.setCapability("chromedriverExecutable", "C:\\seleniumdrivers\\chromedriver");
		//cap.setCapability("app", app.getAbsolutePath()); //only if its hybrid app
//		cap.setCapability("appPackage","com.money.manager.ex");
//		cap.setCapability("appActivity","com.money.manager.ex.home.MainActivity");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		
	}
	
	
	@Test
	public void test() {
		System.out.println("hello");
		
		
		driver.get("https://www.google.com/");
	}
	
	

}
