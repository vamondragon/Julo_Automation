package com.helloselenium.android.julo.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.helloselenium.android.julo.commons.AndroidActions;
import com.helloselenium.android.julo.tests.AbstractBaseTest;
import com.helloselenium.android.julo.utils.AppConfig;
import com.helloselenium.android.julo.utils.ElementLocators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

@SuppressWarnings("rawtypes")

public class LoginScreen {

	private static AppiumDriver mobileDriver = AbstractBaseTest.getAndroidDriver;
	private static WebDriverWait wait = new WebDriverWait(mobileDriver,
			AppConfig.INSTANCE.getNumber("timeout").longValue());

	public static void openLoginScreen() {
		By loginLink = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("loginLink"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(loginLink)));
		AndroidActions.click(mobileDriver.findElement(loginLink));
		// AndroidActions.confimAccess("allow");
	}

	public static void login(String email, String password) {

		By emailTextbox = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("emailTextbox2"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(emailTextbox)));
		AndroidActions.sendKeys(mobileDriver.findElement(emailTextbox), email);

		By passwordTextbox = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("passwordTextbox2"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(passwordTextbox)));
		AndroidActions.sendKeys(mobileDriver.findElement(passwordTextbox), password);

		By loginButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("loginButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(loginButton)));
		AndroidActions.click(mobileDriver.findElement(loginButton));
	}

}
