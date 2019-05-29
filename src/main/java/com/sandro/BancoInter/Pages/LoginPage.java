package com.sandro.BancoInter.Pages;

import com.sandro.BancoInter.Core.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public String obterBotaoLogin() {
        return obterTexto(By.className("android.widget.Button"));
    }

    public void escreverCpf(String texto) {
        escrever(By.id("br.com.intermedium:id/2131296715"), texto);
        hideKeyboard();
    }

    public void escreverConta(String texto) {
        escrever(By.id("br.com.intermedium:id/2131296280"), texto);
        hideKeyboard();
    }

    public void clicarBotao(String texto) {
        clicarPorTexto(texto);
    }

    public void escreverSenha(String texto) {
        escrever(By.id("br.com.intermedium:id/2131297457"), texto);
        hideKeyboard();
    }

    public String obterBotaoIsafe() {
        return obterTexto(By.id("br.com.intermedium:id/2131296459"));
    }

    public void permitirAcesso() {
        clicar(By.id("com.android.packageinstaller:id/permission_allow_button"));
    }

    public void clicarIsafe() {
        clicar(By.id("br.com.intermedium:id/2131296459"));
    }

    public void escreverCodigo1(String texto) {
        escrever(By.id("br.com.intermedium:id/2131296724"), texto);
        hideKeyboard();
    }

    public void escreverCodigo2(String texto) {
        escrever(By.id("br.com.intermedium:id/2131296725"), texto);
        hideKeyboard();
    }

    public void escreverCodigo3(String texto) {
        escrever(By.id("br.com.intermedium:id/2131296726"), texto);
        hideKeyboard();
    }

    public void escreverValidade(String texto) {
        escrever(By.className("android.widget.EditText"), texto);
    }

    public String obterOtp() {

        String sms = obterTexto(By.id("android:id/text"));
        String codigo = sms.replaceAll("[^0-9]", "");
        System.out.println(codigo);
        return sms;
    }

    public void enviarCodigo(String c1,String c2,String c3,String c4,String c5,String c6){
        escrever(By.id("br.com.intermedium:id/2131296724"),c1);
        escrever(By.id("br.com.intermedium:id/2131296725"),c2);
        escrever(By.id("br.com.intermedium:id/2131296726"),c3);
        escrever(By.id("br.com.intermedium:id/2131296727"),c4);
        escrever(By.id("br.com.intermedium:id/2131296728"),c5);
        escrever(By.id("br.com.intermedium:id/2131296729"),c6);
    }

}
