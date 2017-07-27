package com.helloselenium.android.julo.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public enum ElementLocators {
	INSTANCE;

	final private Properties configData;

	ElementLocators() {
		configData = new Properties();
		try {
			File configFile = new File("resources", "locators.properties");
			FileInputStream config = new FileInputStream(configFile.getAbsolutePath());
			configData.load(config);
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		} catch (IOException ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	public String get(String key) {
		return configData.getProperty(key);
	}

	public Float getNumber(String key) {
		return Float.valueOf(get(key));
	}
}
