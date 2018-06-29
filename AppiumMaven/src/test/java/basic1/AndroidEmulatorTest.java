package basic;

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

import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidEmulatorTest {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void setup1() throws MalformedURLException {
		
	
		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability("browserName", "Chrome");
		cap.setCapability("deviceName", "emulator-5556");
		cap.setCapability(CapabilityType.BROWSER_NAME, "Android");
		cap.setCapability(MobileCapabilityType.VERSION, "5.0.1");
		cap.setCapability(MobileCapabilityType.PLATFORM, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		cap.setCapability("platformName", "Android");
		//cap.setCapability("chromedriverExecutable", "C:\\seleniumdrivers\\chromedriver");
		//cap.setCapability("app", app.getAbsolutePath()); //only if its hybrid app
//		cap.setCapability("appPackage","com.sec.android.app.popupcalculator");
//		cap.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");
		
		cap.setCapability("appPackage","com.money.manager.ex");
		cap.setCapability("appActivity","com.money.manager.ex.home.MainActivity");
		
	
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4725/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	
	@Test
	public void test() {
		System.out.println("hello");
		//driver.get("https://www.google.com/");
		
		driver.findElement(By.id("com.money.manager.ex:id/skipTextView")).click();
		
//		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_02")).click();
//		//driver.findElement(By.xpath("//android.widget.Button[@text='+']")).click();
//		driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.sec.android.app.popupcalculator:id/bt_add']")).click();
//		
//		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_02")).click();
//		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_equal")).click();
//		
//		String s  = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/txtCalc")).getText();
//		System.out.println("======"+s);
	}
	

}
