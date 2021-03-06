package com.knight.solid.local;

import org.openqa.selenium.WebDriver;
/**
 * @author Shawn Knight (shawn.knight.work@gmail.com)
 */
public interface LocalWebDriver {

	public WebDriver getWebDriver();

	public boolean isWebDriverType(String type);
}
