package com.treinamento.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class Web {
	
    public static final String BINARY_CHROME_DRIVER = "/home/erich/Downloads/Drivers/chromedriver";
    
    public static WebDriver getChromeDriver() {
    	
    	ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", BINARY_CHROME_DRIVER);
    	//options.addArguments("--headless");
        WebDriver navegador = new ChromeDriver(options);
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return navegador;
        
    }

}
