package com.helloselenium.android.julo.tests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.helloselenium.android.julo.screens.LoginScreen;
import com.helloselenium.android.julo.screens.ProfileScreen;
import com.helloselenium.android.julo.screens.SignUpScreen;
import com.helloselenium.android.julo.screens.SplashScreen;
import com.helloselenium.android.julo.utils.ElementLocators;
import com.helloselenium.android.julo.utils.EmailConfirmation;
import com.helloselenium.android.julo.utils.TestData;

public class JuloAndroidAppTest extends AbstractBaseTest {

	static WebDriverWait wait;

	@Test(priority = 1, enabled = true)
	public void signUp() {
		initAndroidDriver();
		SplashScreen.skip();
		SignUpScreen.openSignUpOption1();
		SignUpScreen.clickFillOutTheFormButton();
		SignUpScreen.fillOutTheForm(TestData.INSTANCE.get("domicile"), TestData.INSTANCE.get("age"),
				TestData.INSTANCE.get("employeeType"), TestData.INSTANCE.get("salary"),
				TestData.INSTANCE.get("ownPhone"));
		SignUpScreen.fillOutLoginDetails(TestData.INSTANCE.get("email"), TestData.INSTANCE.get("password"));
		quitAndroidDriver();
	}

	@Test(priority = 2, enabled = true)
	public void confirmAccount() {
		EmailConfirmation.confirmEmail(TestData.INSTANCE.get("email"));
	}

	@Test(priority = 3, enabled = true)
	public void uploadDocuments() {
		initAndroidDriver();
		SplashScreen.skip();
		LoginScreen.openLoginScreen();
		LoginScreen.login(TestData.INSTANCE.get("email"), TestData.INSTANCE.get("password"));
		ProfileScreen.openProfileScreen();
		ProfileScreen.clickLoanDetailsOption();
		ProfileScreen.fillLoanDetails(TestData.INSTANCE.get("loanInterest"), TestData.INSTANCE.get("loanDesc"),
				TestData.INSTANCE.get("aboutJulo"), TestData.INSTANCE.get("referralCode"),
				TestData.INSTANCE.get("personalPhone"));
		ProfileScreen.clickPersonalDataOption();
		ProfileScreen.fillPersonalData(TestData.INSTANCE.get("name"), ElementLocators.INSTANCE.get("dobDate"),
				TestData.INSTANCE.get("gender"), TestData.INSTANCE.get("ktp"), TestData.INSTANCE.get("address"),
				ElementLocators.INSTANCE.get("durationDate"), TestData.INSTANCE.get("domicile2"),
				TestData.INSTANCE.get("phone1"), TestData.INSTANCE.get("civilStatus"),
				Integer.parseInt(TestData.INSTANCE.get("dependents")));
		ProfileScreen.clickFamilyInfoOption();
		ProfileScreen.fillFamilyInfo(TestData.INSTANCE.get("name2"), TestData.INSTANCE.get("phone"),
				TestData.INSTANCE.get("relation"));
		ProfileScreen.clickWorkAndEduOption();
		ProfileScreen.fillWorkAndEdu(TestData.INSTANCE.get("income"));
		ProfileScreen.clickFormFinancialOption();
		ProfileScreen.fillFormFinancial(TestData.INSTANCE.get("installment"), TestData.INSTANCE.get("expenses"),
				TestData.INSTANCE.get("liabilities"), TestData.INSTANCE.get("branch"),
				TestData.INSTANCE.get("account"));
		ProfileScreen.clickUploadFormButton();
		ProfileScreen.uploadForm();
		ProfileScreen.saveIdentity();
		ProfileScreen.clickResidenceDetailsOption();
		ProfileScreen.saveResidencial(true);
		quitAndroidDriver();
	}
}
