package com.treinamento.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class Web {
	static ChromeOptions options = new ChromeOptions();
	//options.setBinary("/src/main/resources/drivers/chromedriver");
    public static final String BINARY_CHROME_DRIVER = Paths.get("").toAbsolutePath().toString() + "/src/main/resources/drivers/chromedriver";

    public static WebDriver getChromeDriver() {
    	options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        System.setProperty("webdriver.chrome.driver", BINARY_CHROME_DRIVER);
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return navegador;
    }

}
