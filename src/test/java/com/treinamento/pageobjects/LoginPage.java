package com.treinamento.pageobjects;

import com.treinamento.support.Reports;
import com.treinamento.support.Utils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver navegador = null;

    public LoginPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public void navigateTo(String url) {
        this.navegador.get(url);
        //Reports.tirarFoto(this.navegador, Utils.getTimestamp());
    }

    public LoginPage clicarNoCadastro() {
        this.navegador.findElement(By.xpath("//*[@id='signup']")).click();
        return this;
    }

    public LoginPage preencherNome(String nome) {
        this.navegador.findElement(By.xpath("//*[@id='signupbox']/div[1]/form/div[2]/div/input")).sendKeys(nome);
        //Reports.tirarFoto(this.navegador, Utils.getTimestamp());
        return this;
    }

    public LoginPage preencherLogin(String login) {
        this.navegador.findElement(By.xpath("//*[@id='signupbox']/div[1]/form/div[3]/div[1]/input")).sendKeys(login);
        //Reports.tirarFoto(this.navegador, Utils.getTimestamp());
        return this;
    }

    public LoginPage logar() {
        this.navegador.findElement(By.xpath("//*[@id='signupbox']/div[2]/a")).click();
        return this;
    }

    public boolean estouLogado() throws InterruptedException {
        Thread.sleep(5000);
        return this.navegador.findElement(By.className("me")).isDisplayed();
    }

    public LoginPage preencherSenha(String arg3) {
        this.navegador.findElement(By.xpath("//*[@id='signupbox']/div[1]/form/div[3]/div[2]/input")).sendKeys(arg3);
        //Reports.tirarFoto(this.navegador, Utils.getTimestamp());
        return this;
    }
}
