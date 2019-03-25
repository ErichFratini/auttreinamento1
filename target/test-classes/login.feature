#language: pt
Funcionalidade: Alura

  @Autenticacao
  Cenario:Criar e autenticar usuario no TaskIt
    Dado que eu acessei o sistema
    Quando eu realizar o cadastro com nome "oerich1" login "oerich1" e senha "oerich1"
    Entao sera validado o acesso
