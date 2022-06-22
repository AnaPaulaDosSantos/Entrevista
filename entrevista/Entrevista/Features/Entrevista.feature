
@tag
Feature: Fazer cadastro

  @tag1
  Scenario: Fazer cadastro
    Given dado acesse url "https://alexspalermo.github.io/AlexSPalermo.LoginCadastro.github.io/"
    And preencher os dados pedidos
    And selecionar campo cadastrar 
    @Tag2
    Scenario: Fazer Login
   Given dado acesse url "https://alexspalermo.github.io/AlexSPalermo.LoginCadastro.github.io/"
   And seleciona campo Ir para login
   And preencher os dados
  And selecionar campo Manter Logado
  Then selecionar campo Logar 
   

 
