$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("desconto.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Receber desconto de qazando",
  "description": "Eu como usuário da qazando\r\nquero receber um cupom de dessconto\r\npara comprar um curso com valor reduzido",
  "id": "receber-desconto-de-qazando",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 8,
  "name": "Visualizar código de desconto",
  "description": "",
  "id": "receber-desconto-de-qazando;visualizar-código-de-desconto",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 9,
  "name": "que estou no site da qazando",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "eu preencho meu e-mail",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "clico em ganhar cupom",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu vejo o código de desconto",
  "keyword": "Então "
});
formatter.match({
  "location": "DescontoStep.acessar_site_qazando()"
});
formatter.result({
  "duration": 64391808100,
  "status": "passed"
});
formatter.match({
  "location": "DescontoStep.eu_preencho_meu_e_mail()"
});
formatter.result({
  "duration": 233656300,
  "status": "passed"
});
formatter.match({
  "location": "DescontoStep.clico_em_ganhar_cupom()"
});
formatter.result({
  "duration": 113945001600,
  "status": "passed"
});
formatter.match({
  "location": "DescontoStep.eu_vejo_o_código_de_desconto()"
});
formatter.result({
  "duration": 30012324600,
  "status": "passed"
});
});