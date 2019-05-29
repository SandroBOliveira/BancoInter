package com.sandro.BancoInter.Core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;


import java.time.Duration;

import static com.sandro.BancoInter.Core.DriverFactory.getDriver;

public class BasePage {

    public void hideKeyboard(){
        getDriver().hideKeyboard();
    }

    public void clicar(By by) {
        getDriver().findElement(by).click();

    }

    public void apagar(By by) {
        getDriver().findElement(by).clear();

    }


    public void clicarPorTexto(String texto) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        getDriver().findElement(By.xpath("//*[@text='" + texto + "']")).click();

    }

    public void escrever(By by, String texto) {
        getDriver().findElement(by).sendKeys(texto);
    }

    public String obterTexto(By by) {
        return getDriver().findElement(by).getText();

    }

    public String obterAtributo(By by) {
        return getDriver().findElement(by).getAttribute("name");

    }

    public void swipe(double inicio, double fim) {
        Dimension size = getDriver().manage().window().getSize();

        int y = size.height / 2;

        int start_x = (int) (size.width * inicio);

        int end_x = (int) (size.width * fim);

        new TouchAction(getDriver()).press(start_x, y).waitAction(Duration.ofMillis(500)).moveTo(end_x, y).release()
                .perform();
    }

    public void scrollUp() {
        scroll(0.1, 0.9);
    }

    public void scrollDown() {
        scroll(0.95, 0.1);
    }

    public void swipeLeft() {
        swipe(0.1, 0.9);
    }

    public void swipeRight() {
        swipe(0.9, 0.1);
    }

    public void swipeElement(MobileElement element, double inicio, double fim) {

        int y = element.getLocation().y + (element.getSize().height / 2);

        int start_x = (int) (element.getSize().width * inicio);

        int end_x = (int) (element.getSize().width * fim);

        new TouchAction(getDriver()).press(start_x, y).waitAction(Duration.ofMillis(500)).moveTo(end_x, y).release()
                .perform();
    }

    public void scroll(double inicio, double fim) {
        Dimension size = getDriver().manage().window().getSize();

        int x = size.width / 2;

        int start_y = (int) (size.height * inicio);

        int end_y = (int) (size.height * fim);

        new TouchAction(getDriver()).press(x, start_y).waitAction(Duration.ofMillis(500)).moveTo(x, end_y).release()
                .perform();
    }

    public void scrollElement(MobileElement element, double inicio, double fim) {
        Dimension size = getDriver().manage().window().getSize();

        int x = element.getLocation().x + element.getSize().width / 2;

        int start_y = (int) (size.height - (element.getSize().height * inicio));

        int end_y = (int) (size.height - (element.getSize().height * fim));

        new TouchAction(getDriver()).press(x, start_y).waitAction(Duration.ofMillis(500)).moveTo(x, end_y).release()
                .perform();

    }

    public void scrollElementUp(By by) {
        MobileElement elemento = getDriver().findElement(by);
        scrollElement(elemento, 0.2, 0.8);

    }

    public void scrollElementDown(By by) {
        MobileElement elemento = getDriver().findElement(by);
        scrollElement(elemento, 0.8, 0.2);

    }

    public void clicarVoltar() {
        getDriver().pressKeyCode(AndroidKeyCode.BACK);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
