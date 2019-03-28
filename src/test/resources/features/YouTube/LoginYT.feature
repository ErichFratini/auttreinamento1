#language: pt

  Funcionalidade: Realizar login e realizar uma busca

    @BuscaCoisadeNerd
    Cenario: Realizar busca na plataforma
      Dado que estou no YouTube
      Quando efetuar uma pesquisa coms os seguintes parametros "Coisa de Nerd"
      Então sera retornado o resultado

    @Entrarnovideo
    Cenario: Realizar login na plataforma
      Dado que estou no YouTube
      Quando efetuar uma pesquisa coms os seguintes parametros "Coisa de Nerd"
      Então sera retornado o resultado
      E o video sera aberto

    @Abrirplaylist
    Cenario: Abrir playlist
      Dado que estou no YouTube
      Quando efetuar uma pesquisa coms os seguintes parametros "twenty one pilots"
      Quando clicar no video



