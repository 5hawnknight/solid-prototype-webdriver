package com.knight.solid.local;

import org.openqa.selenium.WebDriver;
/**
 * @author Shawn Knight (shawn.knight.work@gmail.com)
 */
public class LocalWebDriverService 
{
	private RegisterLocalWebDrivers registerLocalWebDrivers = new RegisterLocalWebDriversService();

	public WebDriver getWebDriver(String type)
	{
		for (LocalWebDriver localWebDriver : registerLocalWebDrivers.get())
		{
			if (localWebDriver.isWebDriverType(type))
				return localWebDriver.getWebDriver();
		}
		return getLocalDefaultWebDriver();
	}
	private WebDriver getLocalDefaultWebDriver()
	{
		return registerLocalWebDrivers.getDefaultWebDriver();
	}
}
