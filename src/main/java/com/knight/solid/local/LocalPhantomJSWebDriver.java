package com.knight.solid.local;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
/**
 * @author Shawn Knight (shawn.knight.work@gmail.com)
 */
public class LocalPhantomJSWebDriver implements LocalWebDriver
{
	@Override
	public boolean isWebDriverType(String type)
	{
		return StringUtils.equalsIgnoreCase("phantomjs", type);
	}
	@Override
	public WebDriver getWebDriver()
	{
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setJavascriptEnabled(true);
        caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "src/test/resources/phantomjs");
        caps.setCapability("takesScreenshot", true);
        return new PhantomJSDriver(caps);
	}
}
