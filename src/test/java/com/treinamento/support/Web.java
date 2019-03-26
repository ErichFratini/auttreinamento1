package com.treinamento.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class Web {

	//
    public static final String BINARY_CHROME_DRIVER = "/home/erich/Downloads/drivers/chromedriver";
    public static ChromeOptions options = new ChromeOptions();
    public static WebDriver getChromeDriver() {
    	//options.setBinary("/src/main/resources/drivers/chromedriver");
        System.setProperty("webdriver.chrome.driver", BINARY_CHROME_DRIVER);
    	//options.addArguments("--headless");
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-gpu"); // applicable to windows os only
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox"); // Bypass OS security model
        WebDriver navegador = new ChromeDriver(options);
        //navegador.manage().window().maximize();
        //navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return navegador;
    }

}
