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

import com.sun.jna.Platform;

public class AndroidCalculatorTest {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "ABCD");
		cap.setCapability(CapabilityType.BROWSER_NAME, "Android");
		cap.setCapability(CapabilityType.VERSION, "5.0.1");
		cap.setCapability(CapabilityType.PLATFORM, "Android");
		cap.setCapability("platformName", "Android");
		
		cap.setCapability("appPackage","com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");
		
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test
	public void calculate() {
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_02")).click();
		//driver.findElement(By.xpath("//android.widget.Button[@text='+']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.sec.android.app.popupcalculator:id/bt_add']")).click();
		
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_02")).click();
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_equal")).click();
		
		String s  = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/txtCalc")).getText();
		System.out.println("======"+s);
		
	}
	
	
	public void doSum() {
		
	}
	
	
	
	

}
