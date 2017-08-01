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

public class ProfileScreen {

	private static AppiumDriver mobileDriver = AbstractBaseTest.getAndroidDriver;
	private static WebDriverWait wait = new WebDriverWait(mobileDriver,
			AppConfig.INSTANCE.getNumber("timeout").longValue());

	public static void openProfileScreen() {
		By profileLink = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("profileLink"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(profileLink)));
		AndroidActions.click(mobileDriver.findElement(profileLink));
	}

	public static void clickLoanDetailsOption() {
		By loanDetailsOption = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("loanDetailsOption"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(loanDetailsOption)));
		AndroidActions.click(mobileDriver.findElement(loanDetailsOption));
	}

	public static void clickPersonalDataOption() {
		By personalDataOption = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("personalDataOption"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(personalDataOption)));
		AndroidActions.click(mobileDriver.findElement(personalDataOption));
	}

	public static void clickFamilyInfoOption() {
		By familyInfoOption = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("familyInfoOption"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(familyInfoOption)));
		AndroidActions.click(mobileDriver.findElement(familyInfoOption));
	}

	public static void clickWorkAndEduOption() {
		By workAndEduOption = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("workAndEduOption"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(workAndEduOption)));
		AndroidActions.click(mobileDriver.findElement(workAndEduOption));
	}

	public static void clickFormFinancialOption() {
		By formFinancialOption = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("formFinancialOption"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(formFinancialOption)));
		AndroidActions.click(mobileDriver.findElement(formFinancialOption));
	}

	public static void clickUploadFormButton() {
		By uploadFormButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("uploadFormButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(uploadFormButton)));
		AndroidActions.click(mobileDriver.findElement(uploadFormButton));
	}

	public static void fillLoanDetails(String loanInterest, String loanDesc, String aboutJulo, String referralCode,
			String personalPhone) {

		By yaOption = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("yaOption"));

		By descLoanTextbox = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("descLoanTextbox"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(descLoanTextbox)));
		AndroidActions.sendKeys(mobileDriver.findElement(descLoanTextbox), loanDesc);

		By interestLoanDropdown = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("interestLoanDropdown"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(interestLoanDropdown)));
		AndroidActions.click(mobileDriver.findElement(interestLoanDropdown));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(yaOption)));
		switch (loanInterest) {
		case "Modal usaha":
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(0));
			break;
		case "Kebutuhan sehari-hari":
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(1));
			break;
		case "Membayar hutang lainnya":
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(2));
			break;
		case "Biaya pendidikan":
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(3));
			break;
		case "Biaya kesehatan":
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(4));
			break;
		case "Belanja online":
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(5));
			break;
		case "Membeli elektronik":
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(6));
			break;
		case "Membeli kendaraan":
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(7));
			break;
		default:
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(0));
			break;
		}

		By aboutJuloDropdown = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("aboutJuloDropdown"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(aboutJuloDropdown)));
		AndroidActions.click(mobileDriver.findElement(aboutJuloDropdown));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(yaOption)));
		switch (aboutJulo) {
		case "Teman / saudara":
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(0));
			break;
		case "Facebook":
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(1));
			break;
		case "Artikel online":
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(2));
			break;
		case "Flyer":
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(3));
			break;
		case "Tokopedia":
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(4));
			break;
		case "Iklan online":
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(5));
			break;
		case "Google Play Store":
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(6));
			break;
		default:
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(0));
			break;
		}

		By referralCodeTextbox = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("referralCodeTextbox"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(referralCodeTextbox)));
		AndroidActions.sendKeys(mobileDriver.findElement(referralCodeTextbox), referralCode);

		mobileDriver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"SIMPAN\"));"));

		if (personalPhone.equalsIgnoreCase("ya")) {
			By personalPhnYesRadioButton = MobileBy
					.AndroidUIAutomator(ElementLocators.INSTANCE.get("personalPhnYesRadioButton"));
			wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(personalPhnYesRadioButton)));
			AndroidActions.click(mobileDriver.findElement(personalPhnYesRadioButton));
		} else {
			By personalPhnNoRadioButton = MobileBy
					.AndroidUIAutomator(ElementLocators.INSTANCE.get("personalPhnNoRadioButton"));
			wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(personalPhnNoRadioButton)));
			AndroidActions.click(mobileDriver.findElement(personalPhnNoRadioButton));
		}

		By loanDetailsSaveButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("loanDetailsSaveButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(loanDetailsSaveButton)));
		AndroidActions.click(mobileDriver.findElement(loanDetailsSaveButton));
	}

	public static void fillPersonalData(String name, String dob, String gender, String ktp, String address,
			String duration, String domicile, String phone1, String civilStatus, int dependents) {

		By yaOption = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("yaOption"));

		By fullNameTextbox = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("fullNameTextbox"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(fullNameTextbox)));
		AndroidActions.sendKeys(mobileDriver.findElement(fullNameTextbox), name);

		By dobCalendar = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("dobCalendar"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(dobCalendar)));
		AndroidActions.click(mobileDriver.findElement(dobCalendar));
		By dobDate = MobileBy.AccessibilityId(dob);
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(dobDate)));
		AndroidActions.click(mobileDriver.findElement(dobDate));
		By calendarOk = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("calendarOk"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(calendarOk)));
		AndroidActions.click(mobileDriver.findElement(calendarOk));

		By genderDropdown = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("genderDropdown"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(genderDropdown)));
		AndroidActions.click(mobileDriver.findElement(genderDropdown));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(yaOption)));
		if (gender.equalsIgnoreCase("Pria")) {
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(0));
		} else {
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(1));
		}

		By ktpTextbox = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("ktpTextbox"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(ktpTextbox)));
		AndroidActions.sendKeys(mobileDriver.findElement(ktpTextbox), ktp);

		By homeAddressTextbox = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("homeAddressTextbox"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(homeAddressTextbox)));
		AndroidActions.sendKeys(mobileDriver.findElement(homeAddressTextbox), address);

		By provinsiDropdown = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("provinsiDropdown"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(provinsiDropdown)));
		AndroidActions.click(mobileDriver.findElement(provinsiDropdown));
		By listItem1 = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("listItem1"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(listItem1)));
		AndroidActions.click(mobileDriver.findElement(listItem1));

		By kabupatenDropdown = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("kabupatenDropdown"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(kabupatenDropdown)));
		AndroidActions.click(mobileDriver.findElement(kabupatenDropdown));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(listItem1)));
		AndroidActions.click(mobileDriver.findElement(listItem1));

		By kecamatanDropdown = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("kecamatanDropdown"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(kecamatanDropdown)));
		AndroidActions.click(mobileDriver.findElement(kecamatanDropdown));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(listItem1)));
		AndroidActions.click(mobileDriver.findElement(listItem1));

		By kelurahanDropdown = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("kelurahanDropdown"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(kelurahanDropdown)));
		AndroidActions.click(mobileDriver.findElement(kelurahanDropdown));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(listItem1)));
		AndroidActions.click(mobileDriver.findElement(listItem1));

		By kodeposDropdown = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("kodeposDropdown"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(kodeposDropdown)));
		AndroidActions.click(mobileDriver.findElement(kodeposDropdown));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(listItem1)));
		AndroidActions.click(mobileDriver.findElement(listItem1));

		By durationCalendar = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("durationCalendar"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(durationCalendar)));
		AndroidActions.click(mobileDriver.findElement(durationCalendar));
		By durationDate = MobileBy.AccessibilityId(duration);
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(durationDate)));
		AndroidActions.click(mobileDriver.findElement(durationDate));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(calendarOk)));
		AndroidActions.click(mobileDriver.findElement(calendarOk));

		By domicileDropdown = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("domicileDropdown"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(domicileDropdown)));
		AndroidActions.click(mobileDriver.findElement(domicileDropdown));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(yaOption)));
		switch (domicile) {
		case "Kontrak":
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(0));
			break;
		case "Kos":
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(1));
			break;
		case "Milik keluarga":
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(2));
			break;
		case "Milik sendiri, lunas":
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(3));
			break;
		case "Milik sendiri, mencicil":
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(4));
			break;
		default:
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(0));
			break;
		}

		mobileDriver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"SIMPAN\"));"));

		By phone1Textbox = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("phone1Textbox"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(phone1Textbox)));
		AndroidActions.sendKeys(mobileDriver.findElement(phone1Textbox), phone1);

		By civilStatusDropdown = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("civilStatusDropdown"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(civilStatusDropdown)));
		AndroidActions.click(mobileDriver.findElement(civilStatusDropdown));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(yaOption)));
		switch (civilStatus) {
		case "Lajang":
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(0));
			break;
		case "Menikah":
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(1));
			break;
		case "Cerai":
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(2));
			break;
		case "Janda / duda":
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(3));
			break;
		default:
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(0));
			break;
		}

		By dependentsDropdown = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("dependentsDropdown"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(dependentsDropdown)));
		AndroidActions.click(mobileDriver.findElement(dependentsDropdown));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(yaOption)));
		switch (dependents) {
		case 0:
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(0));
			break;
		case 1:
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(1));
			break;
		case 2:
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(2));
			break;
		case 3:
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(3));
			break;
		case 4:
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(4));
			break;
		case 5:
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(5));
			break;
		case 6:
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(6));
			break;
		case 7:
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(7));
			break;
		case 8:
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(8));
			break;
		case 9:
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(9));
			break;
		case 10:
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(10));
			break;
		default:
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(0));
			break;
		}

		By personalDataSaveButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("personalDataSaveButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(personalDataSaveButton)));
		AndroidActions.click(mobileDriver.findElement(personalDataSaveButton));

	}

	public static void fillFamilyInfo(String name, String phone, String relation) {

		By yaOption = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("yaOption"));

		By familyFullNameTextbox = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("familyFullNameTextbox"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(familyFullNameTextbox)));
		AndroidActions.sendKeys(mobileDriver.findElement(familyFullNameTextbox), name);

		By relativePhoneTextbox = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("relativePhoneTextbox"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(relativePhoneTextbox)));
		AndroidActions.sendKeys(mobileDriver.findElement(relativePhoneTextbox), phone);

		By relationDropdown = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("relationDropdown"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(relationDropdown)));
		AndroidActions.click(mobileDriver.findElement(relationDropdown));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(yaOption)));
		if (relation.equalsIgnoreCase("Orang tua")) {
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(0));
		} else if (relation.equalsIgnoreCase("Saudara kandung")) {
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(1));
		} else {
			AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(2));
		}

		By familyInfoSaveButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("familyInfoSaveButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(familyInfoSaveButton)));
		AndroidActions.click(mobileDriver.findElement(familyInfoSaveButton));
	}

	public static void fillWorkAndEdu(String income) {

		By yaOption = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("yaOption"));

		By jobTypeDropdown = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("jobTypeDropdown"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(jobTypeDropdown)));
		AndroidActions.click(mobileDriver.findElement(jobTypeDropdown));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(yaOption)));
		AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(7));

		By incomeTextbox = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("incomeTextbox"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(incomeTextbox)));
		AndroidActions.sendKeys(mobileDriver.findElement(incomeTextbox), income);

		By lastEducationDropdown = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("lastEducationDropdown"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(lastEducationDropdown)));
		AndroidActions.click(mobileDriver.findElement(lastEducationDropdown));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(yaOption)));
		AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(0));

		By graduationYearDropdown = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("graduationYearDropdown"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(graduationYearDropdown)));
		AndroidActions.click(mobileDriver.findElement(graduationYearDropdown));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(yaOption)));
		AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(0));

		By workEducationSaveButton = MobileBy
				.AndroidUIAutomator(ElementLocators.INSTANCE.get("workEducationSaveButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(workEducationSaveButton)));
		AndroidActions.click(mobileDriver.findElement(workEducationSaveButton));
	}

	public static void fillFormFinancial(String installment, String expenses, String liabilities, String branch,
			String account) {

		By yaOption = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("yaOption"));

		By incomeNoButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("incomeNoButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(incomeNoButton)));
		AndroidActions.click(mobileDriver.findElement(incomeNoButton));

		By installmentTextbox = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("installmentTextbox"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(installmentTextbox)));
		AndroidActions.sendKeys(mobileDriver.findElement(installmentTextbox), installment);

		By monthlyExpensesTextbox = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("monthlyExpensesTextbox"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(monthlyExpensesTextbox)));
		AndroidActions.sendKeys(mobileDriver.findElement(monthlyExpensesTextbox), expenses);

		By liabilitiesTextbox = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("liabilitiesTextbox"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(liabilitiesTextbox)));
		AndroidActions.sendKeys(mobileDriver.findElement(liabilitiesTextbox), liabilities);

		By vehicle1Dropdown = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("vehicle1Dropdown"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(vehicle1Dropdown)));
		AndroidActions.click(mobileDriver.findElement(vehicle1Dropdown));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(yaOption)));
		AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(0));

		By vehicle2Dropdown = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("vehicle2Dropdown"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(vehicle2Dropdown)));
		AndroidActions.click(mobileDriver.findElement(vehicle2Dropdown));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(yaOption)));
		AndroidActions.click((WebElement) mobileDriver.findElements(yaOption).get(0));

		mobileDriver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"SIMPAN\"));"));

		By bankDropdown = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("bankDropdown"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(bankDropdown)));
		AndroidActions.click(mobileDriver.findElement(bankDropdown));
		By listItem1 = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("listItem1"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(listItem1)));
		AndroidActions.click(mobileDriver.findElement(listItem1));

		By bankBranchTextbox = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("bankBranchTextbox"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(bankBranchTextbox)));
		AndroidActions.sendKeys(mobileDriver.findElement(bankBranchTextbox), branch);

		By accountNumberTextbox = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("accountNumberTextbox"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(accountNumberTextbox)));
		AndroidActions.sendKeys(mobileDriver.findElement(accountNumberTextbox), account);

		By financialSaveButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("financialSaveButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(financialSaveButton)));
		AndroidActions.click(mobileDriver.findElement(financialSaveButton));
	}

	public static void uploadForm() {

		mobileDriver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"KIRIM FORMULIR\"));"));

		By termsAndCondEditButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("termsAndCondEditButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(termsAndCondEditButton)));
		AndroidActions.click(mobileDriver.findElement(termsAndCondEditButton));

		By inspectAndValidateEditButton = MobileBy
				.AndroidUIAutomator(ElementLocators.INSTANCE.get("inspectAndValidateEditButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(inspectAndValidateEditButton)));
		AndroidActions.click(mobileDriver.findElement(inspectAndValidateEditButton));

		By reviewUploadFormEditButton = MobileBy
				.AndroidUIAutomator(ElementLocators.INSTANCE.get("reviewUploadFormEditButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(reviewUploadFormEditButton)));
		AndroidActions.click(mobileDriver.findElement(reviewUploadFormEditButton));

		By okButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("okButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(okButton)));
		AndroidActions.click(mobileDriver.findElement(okButton));
	}

	public static void clickSaveIdentityOption() {
		By idAndKKOption = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("idAndKKOption"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(idAndKKOption)));
		AndroidActions.click(mobileDriver.findElement(idAndKKOption));
	}

	public static void clickResidenceDetailsOption() {
		By residenceOption = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("residenceOption"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(residenceOption)));
		AndroidActions.click(mobileDriver.findElement(residenceOption));
	}

	public static void clickFinancialOption() {
		By financialOption = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("financialOption"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(financialOption)));
		AndroidActions.click(mobileDriver.findElement(financialOption));
	}

	public static void clickSmileTakeSelfieOption() {
		By smileTakeSelfieOption = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("smileTakeSelfieOption"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(smileTakeSelfieOption)));
		AndroidActions.click(mobileDriver.findElement(smileTakeSelfieOption));
	}

	public static void saveIdentity() {
		// By okButton =
		// MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("okButton"));
		// wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(okButton)));
		// AndroidActions.click(mobileDriver.findElement(okButton));

		By photoImageButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("photoImageButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(photoImageButton)));
		AndroidActions.click((WebElement) mobileDriver.findElements(photoImageButton).get(0));
		By takePictureButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("takePictureButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(takePictureButton)));
		AndroidActions.click(mobileDriver.findElement(takePictureButton));
		By savePictureButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("savePictureButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(savePictureButton)));
		AndroidActions.click(mobileDriver.findElement(savePictureButton));

		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(photoImageButton)));
		AndroidActions.click((WebElement) mobileDriver.findElements(photoImageButton).get(1));
		By cameraUploadOption = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("cameraUploadOption"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(cameraUploadOption)));
		AndroidActions.click(mobileDriver.findElement(cameraUploadOption));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(takePictureButton)));
		AndroidActions.click(mobileDriver.findElement(takePictureButton));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(savePictureButton)));
		AndroidActions.click(mobileDriver.findElement(savePictureButton));

		mobileDriver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"SIMPAN\"));"));

		By saveIdentityButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("saveIdentityButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(saveIdentityButton)));
		AndroidActions.click(mobileDriver.findElement(saveIdentityButton));
	}

	public static void saveResidencial(boolean emulator) {
		if (AppConfig.INSTANCE.get("localDeviceName").equalsIgnoreCase("true")) {
			By latTextbox = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("latTextbox"));
			wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(latTextbox)));
			AndroidActions.sendKeys(mobileDriver.findElement(latTextbox), "-6.175110");

			By longTextbox = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("longTextbox"));
			wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(longTextbox)));
			AndroidActions.sendKeys(mobileDriver.findElement(longTextbox), "106.865039");
		} else {
			By fetchLocationButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("fetchLocationButton"));
			wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(fetchLocationButton)));
			AndroidActions.click(mobileDriver.findElement(fetchLocationButton));
		}

		mobileDriver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"SIMPAN\"));"));

		By saveOptionButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("saveOptionButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(saveOptionButton)));
		AndroidActions.click(mobileDriver.findElement(saveOptionButton));
	}

	public static void saveFinancial() {

		By photoImageButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("photoImageButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(photoImageButton)));
		AndroidActions.click((WebElement) mobileDriver.findElements(photoImageButton).get(0));
		By takePictureButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("takePictureButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(takePictureButton)));
		AndroidActions.click(mobileDriver.findElement(takePictureButton));
		By savePictureButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("savePictureButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(savePictureButton)));
		AndroidActions.click(mobileDriver.findElement(savePictureButton));

		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(photoImageButton)));
		AndroidActions.click((WebElement) mobileDriver.findElements(photoImageButton).get(1));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(takePictureButton)));
		AndroidActions.click(mobileDriver.findElement(takePictureButton));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(savePictureButton)));
		AndroidActions.click(mobileDriver.findElement(savePictureButton));

		mobileDriver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"SIMPAN\"));"));

		By saveOptionButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("saveOptionButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(saveOptionButton)));
		AndroidActions.click(mobileDriver.findElement(saveOptionButton));
	}

	public static void saveSelfie() {

		By photoImageButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("photoImageButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(photoImageButton)));
		AndroidActions.click((WebElement) mobileDriver.findElements(photoImageButton).get(0));
		By cameraUploadOption = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("cameraUploadOption"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(cameraUploadOption)));
		AndroidActions.click(mobileDriver.findElement(cameraUploadOption));
		By takePictureButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("takePictureButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(takePictureButton)));
		AndroidActions.click(mobileDriver.findElement(takePictureButton));
		By savePictureButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("savePictureButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(savePictureButton)));
		AndroidActions.click(mobileDriver.findElement(savePictureButton));

		mobileDriver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"SIMPAN\"));"));

		By saveOptionButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("saveOptionButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(saveOptionButton)));
		AndroidActions.click(mobileDriver.findElement(saveOptionButton));
	}

	public static void clickUploadDocumentsButton() {
		By uploadDocumentsButton = MobileBy.AndroidUIAutomator(ElementLocators.INSTANCE.get("uploadDocumentsButton"));
		wait.until(ExpectedConditions.visibilityOf(mobileDriver.findElement(uploadDocumentsButton)));
		AndroidActions.click(mobileDriver.findElement(uploadDocumentsButton));
	}
}
