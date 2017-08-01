package com.helloselenium.android.julo.commons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.helloselenium.android.julo.tests.AbstractBaseTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

@SuppressWarnings("rawtypes")
public class AndroidActions {

	private static AppiumDriver mobileDriver = AbstractBaseTest.getAndroidDriver;

	public static void sendKeys(WebElement element, String value) {
		if (element.isDisplayed() && element.isEnabled()) {
			element.clear();
			element.sendKeys(value);
		} else {
			System.out.println("Either element is not displayed or not enabled.");
		}
	}

	public static void click(WebElement element) {
		if (element.isDisplayed() && element.isEnabled()) {
			element.click();
		} else {
			System.out.println("Either element is not displayed or not enabled.");
		}
	}

	public static void confimAccess(String confirm) {
		try {
			if (confirm.equalsIgnoreCase("allow")) {
				new WebDriverWait(mobileDriver, 30).until(ExpectedConditions.visibilityOfElementLocated(
						MobileBy.id("com.android.packageinstaller:id/permission_allow_button")));
				click(mobileDriver.findElement(MobileBy.id("com.android.packageinstaller:id/permission_allow_button")));
			} else {
				new WebDriverWait(mobileDriver, 30).until(ExpectedConditions.visibilityOfElementLocated(
						MobileBy.id("com.android.packageinstaller:id/permission_deny_button")));
				click(mobileDriver.findElement(MobileBy.id("com.android.packageinstaller:id/permission_deny_button")));
			}
		} catch (Exception e) {
			System.out.println("Alert not present!!");
		}
	}

	public static void waitTillSeconds(int second) {
		try {
			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
