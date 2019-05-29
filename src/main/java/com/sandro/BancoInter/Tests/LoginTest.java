package com.sandro.BancoInter.Tests;

import com.sandro.BancoInter.Core.BaseTest;
import com.sandro.BancoInter.Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    private LoginPage page = new LoginPage();


    @Test
    public void deveRealizarLogin() {
        page.clicarBotao("JÁ SOU CLIENTE");
        assertEquals("ACESSAR", page.obterBotaoLogin());
        page.escreverCpf("01653579676");
        page.clicarBotao("ACESSAR");
        page.escreverConta("23256990");
        page.clicarBotao("ACESSAR");
        page.escreverSenha("sboEA21*");
        page.clicarBotao("ACESSAR");
        page.permitirAcesso();
        assertEquals("CADASTRAR I-SAFE", page.obterBotaoIsafe());
        page.clicarIsafe();
        page.escreverCodigo1("8");
        page.escreverCodigo2("5");
        page.escreverCodigo3("0");
        page.clicarBotao("CONTINUAR");
        esperar(1000);
        page.escreverValidade("0224");
        esperar(2000);
        page.clicarBotao("CONTINUAR");
        esperar(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/text")));
        String codigo = page.obterOtp();
        String c1, c2, c3, c4, c5, c6;
        c1 = codigo.substring(0, 1);
        c2 = codigo.substring(1, 2);
        c3 = codigo.substring(2, 3);
        c4 = codigo.substring(3, 4);
        c5 = codigo.substring(4, 5);
        c6 = codigo.substring(5, 6);
        page.enviarCodigo(c1, c2, c3, c4, c5, c6);
        page.clicarBotao("CONTINUAR");


    }


}
