package com.helloselenium.android.julo.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.helloselenium.android.julo.commons.AndroidActions;
import com.helloselenium.android.julo.tests.AbstractBaseTest;
import com.helloselenium.android.julo.utils.AppConfig;
import com.helloselenium.android.julo.utils.ElementLocators;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

@SuppressWarnings("rawtypes")

public class SignUpScreen {

	private static AppiumDriver mobileDriver = AbstractBaseTest.getAndroidDriver;
	private static WebDriverWait wait = new WebDriverWait(mobileDriver,
			AppConfig.INSTANCE.getNumber("timeout").longValue());

	public static void openSignUpOption1() {
		By signUpOption1Button = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("signUpOption1Button"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(signUpOption1Button)));
		AndroidActions.click(mobileDriver.findElement(signUpOption1Button));
		
		mobileDriver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"DAFTAR\"));"));

	}

	public static void clickFillOutTheFormButton() {
		By fillOutTheFormButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("fillOutTheFormButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(fillOutTheFormButton)));
		AndroidActions.click(mobileDriver.findElement(fillOutTheFormButton));
	}

	public static void fillOutTheForm(String domicile, String age, String employeeType, String salary,
			String ownPhone) {
		By yaOption = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("yaOption"));

		By menuDomicileDropdown = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("menuDomicileDropdown"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(menuDomicileDropdown)));
		AndroidActions.click(mobileDriver.findElement(menuDomicileDropdown));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(yaOption)));
		if (age.equalsIgnoreCase("ya")) {
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(0));
		} else {
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(1));
		}

		By menuAgeDropdown = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("menuAgeDropdown"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(menuAgeDropdown)));
		AndroidActions.click(mobileDriver.findElement(menuAgeDropdown));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(yaOption)));
		if (age.equalsIgnoreCase("ya")) {
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(0));
		} else {
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(1));
		}

		By menuEmployeeTypeDropdown = MobileBy
				.AndroidUIAutomator(ElementLocators.INSTANCE.get("menuEmployeeTypeDropdown"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(menuEmployeeTypeDropdown)));
		AndroidActions.click(mobileDriver.findElement(menuEmployeeTypeDropdown));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(yaOption)));
		if (employeeType.equalsIgnoreCase("ya")) {
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(0));
		} else {
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(1));
		}

		By menuSalaryDropdown = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("menuSalaryDropdown"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(menuSalaryDropdown)));
		AndroidActions.click(mobileDriver.findElement(menuSalaryDropdown));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(yaOption)));
		if (salary.equalsIgnoreCase("ya")) {
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(0));
		} else {
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(1));
		}

		By menuOwnPhoneDropdown = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("menuOwnPhoneDropdown"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(menuOwnPhoneDropdown)));
		AndroidActions.click(mobileDriver.findElement(menuOwnPhoneDropdown));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(yaOption)));
		if (ownPhone.equalsIgnoreCase("ya")) {
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(0));
		} else {
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(1));
		}

		By okayButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("okayButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(okayButton)));
		AndroidActions.click(mobileDriver.findElement(okayButton));
	}

	public static void fillOutLoginDetails(String email, String password) {

		By emailTextbox = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("emailTextbox"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(emailTextbox)));
		AndroidActions.sendKeys(mobileDriver.findElement(emailTextbox), email);

		By passwordTextbox = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("passwordTextbox"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(passwordTextbox)));
		AndroidActions.sendKeys(mobileDriver.findElement(passwordTextbox), password);

		By confirmPasswordTextbox = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("confirmPasswordTextbox"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(confirmPasswordTextbox)));
		AndroidActions.sendKeys(mobileDriver.findElement(confirmPasswordTextbox), password);
		AndroidActions.click(mobileDriver.findElement(passwordTextbox));

		By registerButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("registerButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(registerButton)));
		AndroidActions.click(mobileDriver.findElement(registerButton));
	}

}
