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

  #Scenario: Otwarcie strony BBC
    #Given Uzytkownik jest na stronie "https://www.bbc.com/"

  Scenario: Logowanie do aplikacji 3
    Given Uzytkownik jest na stronie "https://the-internet.herokuapp.com/login"
    When Uzytkownik wpisuje login "tomsmith"
    And Uzytkownik wpisuje haslo "SuperSecretPassword!"
    And Uzytkownik klika przycisk Login
    Then Uzytkownik zostal poprawnie zalogowany


  Scenario: Logowanie do aplikacji 4
    Given Uzytkownik jest na stronie "https://the-internet.herokuapp.com/login"
    When Uzytkownik wpisuje login "blednylogin"
    And Uzytkownik wpisuje haslo "SuperSecretPassword!"
    And Uzytkownik klika przycisk Login
    Then Uzytkownik nie zostal poprawnie zalogowany


  Scenario: Logowanie do aplikacji 5
    Given Uzytkownik jest na stronie "https://the-internet.herokuapp.com/login"
    When Uzytkownik wpisuje login "tomsmith"
    And Uzytkownik wpisuje haslo "blednehaslo"
    And Uzytkownik klika przycisk Login
    Then Uzytkownik nie zostal poprawnie zalogowany


  Scenario: Logowanie do aplikacji 6
    Given Uzytkownik jest na stronie "https://the-internet.herokuapp.com/login"
    When Uzytkownik wpisuje login "blednylogin"
    And Uzytkownik wpisuje haslo "blednehaslo"
    And Uzytkownik klika przycisk Login
    Then Uzytkownik nie zostal poprawnie zalogowany

  @new
  Scenario Outline: Logowanie do aplikacji
    Given Uzytkownik jest na stronie "https://the-internet.herokuapp.com/login"
    When Uzytkownik wpisuje login2 "<login2>"
    And Uzytkownik wpisuje haslo2 "<password2>"
    And Uzytkownik klika przycisk Login
    Then Uzytkownik nie zostal poprawnie zalogowany

    Examples:
      | login2      | password2   |
      | login       | blednehaslo |
      | blednylogin | haslo       |
      | blednylogin | blednehaslo |