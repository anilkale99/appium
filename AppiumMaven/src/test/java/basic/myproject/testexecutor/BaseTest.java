package basic.myproject.testexecutor;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {
	
	
	public void launchApp(WebDriver driver) throws MalformedURLException {
		
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

}
