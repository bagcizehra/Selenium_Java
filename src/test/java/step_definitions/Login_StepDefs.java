package step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.time.Duration;

public class Login_StepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        loginPage.anaGirisButton.click();
    }

    @When("User types {string} to username box and {string} to password box")
    public void user_types_to_username_box_and_to_password_box(String username, String password) {
        loginPage.usernameBox.sendKeys(username);
        loginPage.passwordBox.sendKeys(password);
    }

    @And("User clicks Giris button")
    public void user_clicks_giris_button() {
        loginPage.girisButton.click();
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.titleContains("Kullanıcı Paneli"));
    }

    @Then("User is launched to the dashboard page")
    public void user_is_launched_to_the_dashboard_page() {

        String expectedTitle="Kullanıcı Paneli - kampara.net";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Then("User see error message on login page")
    public void user_see_error_message_on_login_page() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(loginPage.errorMessage));
        String expectedErrorMessage="Giriş Başarısız";
        String actualErrorMessage= loginPage.errorMessage.getText();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);

    }
}
