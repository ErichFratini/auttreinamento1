package com.treinamento;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/Destination"},
        format={"json:target/Destination/cucumber.json"},
        tags = {"@Abrirplaylist"},
        features = "/src/test/resources/")
public class RunTest {
}
