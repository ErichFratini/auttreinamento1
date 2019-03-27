package com.treinamento.steps.youtubeSteps;

import com.treinamento.Hooks;
import com.treinamento.pageobjects.LoginPage;
import com.treinamento.pageobjects.youtubePage.youtubePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

import static java.lang.Thread.*;

public class BuscaSteps {

    private LoginPage loginPage = new LoginPage (Hooks.getNavegador());
    private youtubePage YoutubePage = new youtubePage (Hooks.getNavegador());

    @Dado("^que estou no YouTube$")
    public void que_estou_no_YouTube() throws Exception {
        this.loginPage.navigateTo ("https://www.youtube.com/?gl=BR");
    }

    @Quando("^efetuar uma pesquisa coms os seguintes parametros \"([^\"]*)\"$")
    public void efetuar_uma_pesquisa_coms_os_seguintes_parametros(String arg1) throws Exception {
        this.YoutubePage.pesquisarCanal(arg1);
        Thread.sleep(5000);
    }

    @Então("^sera retornado o resultado$")
    public void sera_retornado_o_resultado() throws Exception {
        this.YoutubePage.validarCanal();
    }
    @Então("^o video sera aberto$")
    public void o_video_sera_aberto() throws Exception {
        this.YoutubePage.entrarNoVideo();
        Thread.sleep(50000);
    }
    @Quando("^clicar no video$")
    public void clicar_na_playlist() throws Exception {
        this.YoutubePage.abrirPlaylist();
        Thread.sleep(5000000);
    }
}
