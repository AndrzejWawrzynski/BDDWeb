package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("Uzytkownik musi byc na stronie logowania")
    public void UzytkownikJestNaStronieLogowania(){
        System.out.println("Uzytkownik jest na stronie logowania");
    }
    @When("Uzytkownik wpisuje poprawny login")
    public void UzytkownikWpisujePoprawnyLogin() {
        System.out.println("Uzytkownik wpisuje poprawny login");
    }
    @When("Uzytkownik wpisuje poprawne haslo")
    public void UzytkownikWpisujePoprawneHaslo() {
        System.out.println("Uzytkownik wpisuje poprawne haslo");
    }
    @When("Uzytkownik klika przycisk Login")
    public void UzytkownikKlikaPrzyciskLogin() {
        System.out.println("Uzytkownik klika przycisk Login");
    }
    @Then("Uzytkownik zostal poprawnie zalogowany")
    public void UzytkownikZostalPoprawnieZalogowany() {
        System.out.println("Uzytkownik zostal poprawnie zalogowany");
    }

}

