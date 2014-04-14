package com.knight.solid.local;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LocalSafariWebDriver implements LocalWebDriver
{
	@Override
	public boolean isWebDriverType(String type)
	{
		return StringUtils.equalsIgnoreCase("firefox", type);
	}
	@Override
	public WebDriver getWebDriver()
	{
		return new SafariDriver();
	}
}
