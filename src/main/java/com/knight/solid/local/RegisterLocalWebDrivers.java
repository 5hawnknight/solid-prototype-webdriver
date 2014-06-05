package com.knight.solid.local;

import org.openqa.selenium.WebDriver;
import java.util.List;

/**
 * @author Shawn Knight (shawn.knight.work@gmail.com)
 */
public interface RegisterLocalWebDrivers
{
    List<LocalWebDriver> get();

    WebDriver getDefaultWebDriver();
}
