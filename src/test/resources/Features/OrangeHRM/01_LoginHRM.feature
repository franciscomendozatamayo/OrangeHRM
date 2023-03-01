Feature: OrangeHRM - Login

  Scenario Outline: (TTP) - Login
    Given Cargar Pagina OrangeHRM "<url>"
    When Captura Username "<Username>"
    And Captura Password "<Password>"
    And Dar Click Boton Login
    Then Muestra Nombre de Usuario "<Name>" - Home OrangeHRM

    Examples: 
      | url                                                                | Username | Password | Name          |
      | https://opensource-demo.orangehrmlive.com/web/index.php/auth/login | Admin    | admin123 | Paul Collings |
