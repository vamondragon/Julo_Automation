package com.helloselenium.android.julo.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

/**
 * Unit test for simple App.
 */
@SuppressWarnings("rawtypes")
public class sampleTest {
	public static AppiumDriver driver = null;
	public static WebDriverWait wait = null;

	public static void main(String[] args) throws InterruptedException, IOException {

		File configFile = new File("config", "config.properties");
		FileInputStream config = new FileInputStream(configFile.getAbsolutePath());
		Properties configData = new Properties();
		configData.load(config);

		File app = new File("resources", configData.getProperty("app"));
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", configData.getProperty("deviceName"));
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
		capabilities.setCapability("platformVersion", configData.getProperty("platformVersion"));
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", configData.getProperty("appPackage"));
		capabilities.setCapability("appActivity", configData.getProperty("appActivity"));

		driver = new AndroidDriver(new URL(configData.getProperty("server")), capabilities);
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(configData.getProperty("timeout")),
				TimeUnit.SECONDS);

		wait = new WebDriverWait(driver, 60);

		wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AndroidUIAutomator(
				"new UiSelector().resourceId(\"com.julofinance.juloapp:id/intro_activity_leftButton\")")));
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiSelector().resourceId(\"com.julofinance.juloapp:id/intro_activity_leftButton\")")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy
				.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/btnLoanTypeSTL\")")));
		driver.findElement(MobileBy
				.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/btnLoanTypeSTL\")"))
				.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy
				.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/btnFillOutTheForm\")")));
		driver.findElement(MobileBy
				.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/btnFillOutTheForm\")"))
				.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy
				.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/btnMenuDomicile\")")));
		driver.findElement(MobileBy
				.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/btnMenuDomicile\")"))
				.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/title\")")));
		driver.findElement(
				MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/title\")"))
				.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/btnMenuAge\")")));
		driver.findElement(
				MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/btnMenuAge\")"))
				.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/title\")")));
		driver.findElement(
				MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/title\")"))
				.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AndroidUIAutomator(
				"new UiSelector().resourceId(\"com.julofinance.juloapp:id/btnMenuEmployeeType\")")));
		driver.findElement(MobileBy
				.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/btnMenuEmployeeType\")"))
				.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/title\")")));
		driver.findElement(
				MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/title\")"))
				.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy
				.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/btnMenuSalary\")")));
		driver.findElement(MobileBy
				.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/btnMenuSalary\")"))
				.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/title\")")));
		driver.findElement(
				MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/title\")"))
				.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy
				.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/btnMenuOwnPhone\")")));
		driver.findElement(MobileBy
				.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/btnMenuOwnPhone\")"))
				.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/title\")")));
		driver.findElement(
				MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/title\")"))
				.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/tvOkay\")")));
		driver.findElement(
				MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.julofinance.juloapp:id/tvOkay\")"))
				.click();

		acceptAlert();

		Thread.sleep(5000);
		driver.quit();
	}

	public static void acceptAlert() {
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public static void waitTillSeconds(int second) {
		try {
			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
