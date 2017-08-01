package com.helloselenium.android.julo.commons;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.helloselenium.android.julo.utils.AppConfig;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;

@SuppressWarnings("rawtypes")
public class DriverClass {

	public MobileDriver mobileDriver;

	public MobileDriver getAndroidDriver() {
		try {
			String testServer = AppConfig.INSTANCE.get("testServer");
			File app = new File("resources", AppConfig.INSTANCE.get("app"));
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("autoGrantPermissions", "true");
			capabilities.setCapability("unicodeKeyboard", true);
			capabilities.setCapability("resetKeyboard", true);
			if (testServer.equalsIgnoreCase("local")) {
				capabilities.setCapability(CapabilityType.VERSION, AppConfig.INSTANCE.get("androidVersion"));
				capabilities.setCapability("platformName", AppConfig.INSTANCE.get("platformName"));
				capabilities.setCapability("deviceName", AppConfig.INSTANCE.get("localDeviceName"));
				capabilities.setCapability("app", app.getAbsolutePath());
				capabilities.setCapability("appPackage", AppConfig.INSTANCE.get("appPackage"));
				capabilities.setCapability("appActivity", AppConfig.INSTANCE.get("appActivity"));
				// capabilities.setCapability("noReset", true);
				capabilities.setCapability("fullReset", true);
				mobileDriver = new AndroidDriver(new URL(AppConfig.INSTANCE.get("appiumServer")), capabilities);
			} else if (testServer.equalsIgnoreCase("testobject")) {
				capabilities.setCapability("testobject_api_key", AppConfig.INSTANCE.get("testobject_api_key"));
				// capabilities.setCapability("testobject_device",
				// AppConfig.INSTANCE.get("testobject_device"));
				capabilities.setCapability("testobject_test_name", AppConfig.INSTANCE.get("testobject_test_name"));
				mobileDriver = new AndroidDriver(new URL(AppConfig.INSTANCE.get("testObject_appium_server")),
						capabilities);
			}
			mobileDriver.manage().timeouts().implicitlyWait(AppConfig.INSTANCE.getNumber("timeout").longValue(),
					TimeUnit.SECONDS);
			return mobileDriver;
		} catch (MalformedURLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public void quitAndroidDriver() {
		if (mobileDriver != null) {
			mobileDriver.quit();
		}
	}
}
