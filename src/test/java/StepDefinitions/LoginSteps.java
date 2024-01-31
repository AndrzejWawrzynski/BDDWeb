package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver;
    @Given("Uzytkownik musi byc na stronie logowania")
    public void UzytkownikJestNaStronieLogowania(){
        //System.setProperty("webdriver.chrome.driver", "//users//andy//chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        //System.out.println("Uzytkownik jest na stronie logowania");
    }
    @When("Uzytkownik wpisuje poprawny login")
    public void UzytkownikWpisujePoprawnyLogin() {
        WebElement inputUsername = driver.findElement(By.id("username"));
        inputUsername.sendKeys("tomsmith");
        //System.out.println("Uzytkownik wpisuje poprawny login");
    }
    @When("Uzytkownik wpisuje poprawne haslo")
    public void UzytkownikWpisujePoprawneHaslo() {
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        //System.out.println("Uzytkownik wpisuje poprawne haslo");
    }
    @When("Uzytkownik klika przycisk Login")
    public void UzytkownikKlikaPrzyciskLogin() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button")).click();
        //System.out.println("Uzytkownik klika przycisk Login");
    }
    @Then("Uzytkownik zostal poprawnie zalogowany")
    public void UzytkownikZostalPoprawnieZalogowany() {
        Assert.assertEquals("https://the-internet.herokuapp.com/secure", driver.getCurrentUrl());
        driver.quit();
        //System.out.println("Uzytkownik zostal poprawnie zalogowany");
    }

}

