Feature: Logowanie do aplikacji

Jako uzytkownik chcę mieć dostep do panelu logowania

  Scenario: Poprawne logowanie do aplikacji
    Given Uzytkownik musi byc na stronie logowania
    When Uzytkownik wpisuje poprawny login
    And Uzytkownik wpisuje poprawne haslo
    And Uzytkownik klika przycisk Login
    Then Uzytkownik zostal poprawnie zalogowany

  Scenario: Niepoprawne logowanie do aplikacji
    Given Uzytkownik musi byc na stronie logowania
    When Uzytkownik wpisuje poprawny login
    And Uzytkownik wpisuje niepoprawne haslo
    And Uzytkownik klika przycisk Login
    Then Uzytkownik nie zostal poprawnie zalogowany

  Scenario: Poprawne logowanie do aplikacji 2
    Given Uzytkownik jest na stronie "https://the-internet.herokuapp.com/login"
    When Uzytkownik wpisuje login "tomsmith"
    And Uzytkownik wpisuje haslo "SuperSecretPassword!"
    And Uzytkownik klika przycisk Login
    Then Uzytkownik zostal poprawnie zalogowany