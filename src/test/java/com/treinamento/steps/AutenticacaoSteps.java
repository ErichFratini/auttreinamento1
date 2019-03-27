package com.treinamento.steps;

import com.treinamento.Hooks;
import com.treinamento.pageobjects.LoginPage;
import com.treinamento.support.Reports;
import com.treinamento.support.Utils;
import com.treinamento.support.Web;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Entao;

public class AutenticacaoSteps {

    private LoginPage loginPage = new LoginPage(Hooks.getNavegador());

    @Dado("^que eu acessei o sistema$")
    public void que_eu_acessei_o_sistema() throws Exception {
        this.loginPage.navigateTo ("http://www.juliodelima.com.br/taskit/");
    }

    @Quando("^eu realizar o cadastro com nome \"([^\"]*)\" login \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void eu_realizar_o_cadastro_com_nome_login_e_senha(String arg1, String arg2, String arg3) throws Exception {
        this.loginPage.clicarNoCadastro().preencherNome(arg1).preencherLogin(arg2).preencherSenha(arg3).logar();
    }

    @Entao("^sera validado o acesso$")
    public void sera_validado_o_acesso() throws Exception {
        this.loginPage.estouLogado();
    }
}
