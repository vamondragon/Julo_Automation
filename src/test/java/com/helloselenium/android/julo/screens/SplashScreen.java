package com.helloselenium.android.julo.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.helloselenium.android.julo.commons.AndroidActions;
import com.helloselenium.android.julo.tests.AbstractBaseTest;
import com.helloselenium.android.julo.utils.ElementLocators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

@SuppressWarnings("rawtypes")

public class SplashScreen {

	private static AppiumDriver mobileDriver = AbstractBaseTest.getAndroidDriver;

	public static void skip() {
		By skip = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("skipButton"));
		try {
			new WebDriverWait(mobileDriver, 15).until(ExpectedConditions.visibilityOfElementLocated(skip));
			AndroidActions.click(mobileDriver.findElement(skip));
		} catch (Exception e) {
			System.out.println("Splash screen is not loaded!!");
		}
	}

}
