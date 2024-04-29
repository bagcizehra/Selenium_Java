package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//button[@data-testid='login-logout-button']")
    public WebElement anaGirisButton;
    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameBox;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;
    @FindBy(id = "login-button")
    public WebElement girisButton;

    @FindBy(xpath = "//span[.='Giriş Başarısız']")
    public WebElement errorMessage;

}
