package com.treinamento.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class Web {
	static ChromeOptions options = new ChromeOptions();
	//
    public static final String BINARY_CHROME_DRIVER = "/home/erich/Downloads/chromedriver";

    public static WebDriver getChromeDriver() {
    	//options.setBinary("/src/main/resources/drivers/chromedriver");
    	options.addArguments("--headless");
    	options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        System.setProperty("webdriver.chrome.driver", BINARY_CHROME_DRIVER);
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return navegador;
    }

}
