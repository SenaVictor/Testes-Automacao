# language: pt

@cadastro
Funcionalidade: Cadastro de usuário

  @cadastro-sucesso
  Cenário: Registrar novo usuário com sucesso
    Dado que estou na tela de login
    E acesso o cadastro do usuário
    Quando preencho o formulário de cadastro
    E clico em registrar
    Então vejo o cadastro realizado com sucesso