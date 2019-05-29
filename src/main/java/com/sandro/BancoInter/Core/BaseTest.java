package com.sandro.BancoInter.Core;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import static com.sandro.BancoInter.Core.DriverFactory.getDriver;

public class BaseTest {

   public static WebDriverWait wait = new WebDriverWait(getDriver(),120);

    @AfterClass
    public static void finalizarClasse() {
        DriverFactory.killDriver();
    }

    @AfterMethod
    public void tearDown(ITestResult testResult) {
        getDriver().resetApp();

    }

    public void esperar(long tempo) {
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
