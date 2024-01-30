Feature: Logowanie do aplikacji

Jako uzytkownik chcę mieć dostep do panelu logowania

  Scenario: Poprawne logowanie do aplikacji
    Given Uzytkownik musi byc na stronie logowania
    When Uzytkownik wpisuje poprawny login
    And Uzytkownik wpisuje poprawne haslo
    And Uzytkownik klika przycisk Login
    Then Uzytkownik zostal poprawnie zalogowany

