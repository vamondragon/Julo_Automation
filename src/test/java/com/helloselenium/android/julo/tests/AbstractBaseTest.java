package com.helloselenium.android.julo.tests;

import org.testng.annotations.AfterClass;

import com.helloselenium.android.julo.commons.DriverClass;

import io.appium.java_client.AppiumDriver;

public abstract class AbstractBaseTest {
	private final DriverClass driverClass;
	public static AppiumDriver getAndroidDriver;

	public AbstractBaseTest() {
		driverClass = new DriverClass();
	}

	protected void initAndroidDriver(String deviceName) {
		this.getAndroidDriver = (AppiumDriver) driverClass.getAndroidDriver(deviceName);
	}

	public void quitAndroidDriver() {
		driverClass.quitAndroidDriver();
	}

	public AppiumDriver getAndroidDriver() {
		return getAndroidDriver;
	}
}
