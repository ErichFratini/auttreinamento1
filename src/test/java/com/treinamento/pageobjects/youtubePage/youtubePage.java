package com.treinamento.pageobjects.youtubePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
    public void abrirPlaylist() {
        Actions actions = new Actions (navegador);
        actions.moveToElement(navegador.findElement(By.tagName("body")), 0, 0);
        int xCoordinate=375;
        int yCoordinate=202;
        actions.moveByOffset(xCoordinate, yCoordinate).click().build().perform();
    }
}
