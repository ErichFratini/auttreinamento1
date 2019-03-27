package com.treinamento.pageobjects.youtubePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class youtubePage {

    private WebDriver navegador = null;

    public youtubePage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public youtubePage pesquisarCanal(String arg1){
        this.navegador.findElement (By.cssSelector ("#search")).sendKeys(arg1);
        this.navegador.findElement (By.id ("search-icon-legacy")).click ();
        return this;
    }

    public boolean validarCanal() {
        return this.navegador.findElement (By.xpath ("//*[@id='contents']/ytd-channel-renderer/a")).isDisplayed ();
    }

    public youtubePage entrarNoVideo() {
        this.navegador.findElement (By.linkText ("Coisa de Nerd")).click ();
        this.navegador.findElement (By.className ("style-scope yt-img-shadow")).click();
        return this;
    }
}
