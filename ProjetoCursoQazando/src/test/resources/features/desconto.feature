# language: pt

  Funcionalidade: Receber desconto de qazando
    Eu como usuário da qazando
  quero receber um cupom de dessconto
  para comprar um curso com valor reduzido

    Cenário: Visualizar código de desconto
      Dado que estou no site da qazando
      Quando eu preencho meu e-mail
      E clico em ganhar cupom
      Então eu vejo o código de desconto