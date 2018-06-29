package basic;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TemplateCodeForNative {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup1() throws MalformedURLException {
		
		File appDir = new File(System.getProperty("user.dir", "../../../apps/"));
		File app = new File(appDir,"App_Name.app");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("browserName", "");
		cap.setCapability("deviceName", "8c99a698");
		//cap.setCapability(CapabilityType.BROWSER_NAME, "Android");
		cap.setCapability(CapabilityType.VERSION, "5.0.1");
		cap.setCapability(CapabilityType.PLATFORM, "Android");
		cap.setCapability("platformName", "Android");
		cap.setCapability("app", app.getAbsolutePath());
		cap.setCapability("appPackage","com.money.manager.ex");
		cap.setCapability("appActivity","com.money.manager.ex.home.MainActivity");
		
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4729/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void teardown() {
		//driver.quit();
	}

}
