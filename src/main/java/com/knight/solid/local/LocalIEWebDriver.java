package com.knight.solid.local;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
/**
 * @author Shawn Knight (shawn.knight.work@gmail.com)
 */
public class LocalIEWebDriver implements LocalWebDriver
{
	@Override
	public boolean isWebDriverType(String type)
	{
		return StringUtils.equalsIgnoreCase("ie", type);
	}
	@Override
	public WebDriver getWebDriver()
	{
		System.setProperty("webdriver.ie.driver","src/test/resources/IEDriverServer");
		return new InternetExplorerDriver();
	}
}
