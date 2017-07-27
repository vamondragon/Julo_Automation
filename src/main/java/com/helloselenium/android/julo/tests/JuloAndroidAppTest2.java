package com.helloselenium.android.julo.tests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.helloselenium.android.julo.screens.LoginScreen;
import com.helloselenium.android.julo.screens.ProfileScreen;
import com.helloselenium.android.julo.screens.SplashScreen;
import com.helloselenium.android.julo.utils.TestData;

public class JuloAndroidAppTest2 extends AbstractBaseTest {

	static WebDriverWait wait;

	@Test(priority = 1, enabled = true)
	public void test() {
		initAndroidDriver();
		SplashScreen.skip();
		LoginScreen.openLoginScreen();
		LoginScreen.login(TestData.INSTANCE.get("email"), TestData.INSTANCE.get("password"));
		ProfileScreen.openProfileScreen();
		ProfileScreen.clickSaveIdentityOption();
		ProfileScreen.saveIdentity();
		ProfileScreen.clickResidenceDetailsOption();
		ProfileScreen.saveResidencial(true);
	}

	@AfterTest
	protected void tearDown() {
		if (getAndroidDriver != null) {
			getAndroidDriver.quit();
		}
	}
}
