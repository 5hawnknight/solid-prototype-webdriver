package com.knight.solid.local;

import org.openqa.selenium.WebDriver;

public interface LocalWebDriver {

	public WebDriver getWebDriver();

	public boolean isWebDriverType(String type);
}
