package com.knight.solid.local;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;

public class LocalWebDriverService 
{
	private List<LocalWebDriver> localWebDrivers = new ArrayList<LocalWebDriver>();
	
	public LocalWebDriverService()
	{
		localWebDrivers.add(new LocalFirefoxWebDriver());
		localWebDrivers.add(new LocalChromeWebDriver());
		localWebDrivers.add(new LocalIEWebDriver());
		localWebDrivers.add(new LocalSafariWebDriver());
	}
	public WebDriver getWebDriver(String type)
	{
		for (LocalWebDriver localWebDriver : localWebDrivers) 
		{
			if (localWebDriver.isWebDriverType(type))
				return localWebDriver.getWebDriver();
		}
		return getLocalDefaultWebDriver();
	}
	private WebDriver getLocalDefaultWebDriver()
	{
		return new LocalFirefoxWebDriver().getWebDriver();
	}
}
