package com.knight.solid.local;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * @author Shawn Knight (shawn.knight.work@gmail.com)
 */
public class LocalChromeWebDriver implements LocalWebDriver
{
	@Override
	public boolean isWebDriverType(String type)
	{
		return StringUtils.equalsIgnoreCase("chrome", type);
	}
	@Override
	public WebDriver getWebDriver()
	{
		return new ChromeDriver();
	}
}
