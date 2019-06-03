package com.sandro.BancoInter.Tests;

import com.sandro.BancoInter.Core.BasePage;
import com.sandro.BancoInter.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerificarSaldoTest extends BasePage {


    private HomePage page = new HomePage();


    @Test
    public void deveVerificarSaldo() {
        clicarPorTexto("ACESSAR");
        page.digitarSenha();
        clicarPorTexto("ACESSAR");
        clicarPorTexto("NÃO");
        clicarPorTexto("Mostrar saldo");
        Assert.assertEquals("R$  131,95", page.obterSaldo());



    }
}
