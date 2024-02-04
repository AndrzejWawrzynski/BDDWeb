package StepDefinitions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/andy/Downloads/chromedriver/chromedriver");
        driver = new ChromeDriver();
    }

    @Given("Uzytkownik musi byc na stronie logowania")
    public void UzytkownikJestNaStronieLogowania() {
        // System.setProperty("webdriver.chrome.driver", "/Users/andy/Downloads/chromedriver/chromedriver");
        // driver = new ChromeDriver();
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
        //driver.close();
        //System.out.println("Uzytkownik zostal poprawnie zalogowany");
    }

    //Scenario 2
    @When("Uzytkownik wpisuje niepoprawne haslo")
    public void UzytkownikWpisujeNiepoprawneHaslo() {
        driver.findElement(By.id("password")).sendKeys("test");
    }

    @Then("Uzytkownik nie zostal poprawnie zalogowany")
    public void UzytkownikNieZostalPoprawnieZalogowany() {
        Assert.assertEquals("https://the-internet.herokuapp.com/login", driver.getCurrentUrl());
        //driver.close();
    }

    //Given Uzytkownik jest na stronie "https://the-internet.herokuopp.com/loqin*
    @Given("Uzytkownik jest na stronie {string}")
    public void UzytkomnikJestNaStronie(String url) {
        // System.setProperty("webdriver.chrome.driver", "/Users/andy/Downloads/chromedriver/chromedriver");
        //  driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.navigate().to(url);
    }

    //When Uzytkownik wpisuje Login "tomsmith"
    @When("Uzytkownik wpisuje login {string}")
    public void UzytkownikWpisujeLogin(String nazwaUzytkownika) {
        driver.findElement(By.id("username")).sendKeys(nazwaUzytkownika);
    }

    // And Uzytkownik wpisuje haslo "SupersecretPassword!"
    @When("Uzytkownik wpisuje haslo {string}")
    public void UzytkownikWpisujeHaslo(String haslo) {
        driver.findElement(By.name("password")).sendKeys(haslo);
    }

    /*
        @When("^Uzytkownik wpisuje login (.+)$")
        public void UzytkownikWpisujeLogin2(String login2) {
            driver.findElement(By.id("username")).sendKeys(login2);
        }

        @And("^Uzytkownik wpisuje haslo (.+)$")
        public void UzytkownikWpisujeHaslo2(String password2) {
            driver.findElement(By.name("password")).sendKeys(password2);
        }

     */
    @When("Uzytkownik wpisuje login2 {string}")
    public void UzytkownikWpisujeLogin2(String login2) {
        driver.findElement(By.id("username")).sendKeys(login2);
    }

    @And("Uzytkownik wpisuje haslo2 {string}")
    public void UzytkownikWpisujeHaslo2(String password2) {
        driver.findElement(By.name("password")).sendKeys(password2);
    }

    @AfterAll
    public static void tearDown() {
        driver.close();
    }
}





