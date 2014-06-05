package com.knight.solid.local;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

/**
 * @author Shawn Knight (shawn.knight.work@gmail.com)
 */
public class RegisterLocalWebDriversService implements RegisterLocalWebDrivers
{
    private List<LocalWebDriver> localWebDrivers;

    public RegisterLocalWebDriversService()
    {
        localWebDrivers = Arrays.asList(
                        new LocalFirefoxWebDriver(),
                        new LocalChromeWebDriver(),
                        new LocalIEWebDriver(),
                        new LocalSafariWebDriver(),
                        new LocalPhantomJSWebDriver());
    }
    @Override
    public List<LocalWebDriver> get()
    {
        return localWebDrivers;
    }
    @Override
    public WebDriver getDefaultWebDriver()
    {
        return new LocalFirefoxWebDriver().getWebDriver();
    }
}
