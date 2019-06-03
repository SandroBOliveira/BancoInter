package com.sandro.BancoInter.Pages;

import com.sandro.BancoInter.Core.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {


    public String obterSaldo(){
        return obterTexto(By.id("br.com.intermedium:id/2131296384"));
    }

    public void digitarSenha(){
        escrever(By.id("br.com.intermedium:id/2131297457"),"sboEA21*");

    }

}
