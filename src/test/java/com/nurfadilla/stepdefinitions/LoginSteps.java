package com.nurfadilla.stepdefinitions;

import com.nurfadilla.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        loginPage = new LoginPage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("User membuka halaman login")
    public void user_membuka_halaman_login() {
        loginPage.openLoginPage();
    }

    @When("User memasukkan username {string}")
    public void user_memasukkan_username(String username) {
        loginPage.enterUsername(username);
    }

    @And("User memasukkan password {string}")
    public void user_memasukkan_password(String password) {
        loginPage.enterPassword(password);
    }

    @And("User menekan tombol login")
    public void user_menekan_tombol_login() {
        loginPage.clickLoginButton();
    }

    @Then("User berhasil masuk ke dashboard")
    public void user_berhasil_masuk_ke_dashboard() {
        Assertions.assertTrue(
                loginPage.getCurrentUrl().contains("inventory")
        );
    }

    @Then("Muncul pesan error")
    public void muncul_pesan_error() {
        Assertions.assertFalse(
                loginPage.getErrorMessage().isEmpty()
        );
    }
}