package com.sandro.BancoInter.Core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    private static AndroidDriver<MobileElement> driver;

    public static AndroidDriver<MobileElement> getDriver() {
        if (driver == null) {
            createDriver();

        }

        return driver;
    }

    private static void createDriver() {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "android");
        dc.setCapability("deviceName", "87cd3d06");
        dc.setCapability("nativeWebScreenshot", "true");
        dc.setCapability("androidScreenshotPath", "target/screenshot");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "br.com.intermedium");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".SplashActivity");
        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), dc);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

    }

    public static void killDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
