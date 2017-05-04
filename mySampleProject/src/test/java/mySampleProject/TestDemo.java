package mySampleProject;

import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestDemo {
	
		@SuppressWarnings("rawtypes")
		public static void main(String[] args) throws MalformedURLException, InterruptedException{
		@SuppressWarnings({ "unused" })
		AndroidDriver driver;
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");     
	    capabilities.setCapability(CapabilityType.VERSION, "4.2");	   
	    capabilities.setCapability("deviceName", "HTC One X+");
	    
	    //Opens Flipkart application
	    capabilities.setCapability("appPackage", "com.flipkart.android");	
		capabilities.setCapability("appActivity", "com.flipkart.android.SplashActivity");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);	
		}
}
