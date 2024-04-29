package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DashBoardPage {
    public DashBoardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//button[@data-testid='change-language-button']")
    public WebElement languageButton;
    @FindBy (xpath = "//button[@data-testid='change-theme-button']")
    public WebElement themeButton;
    @FindBy (xpath = "//button[@data-testid='go-to-user-panel-button']")
    public WebElement profilButton;
    @FindBy (xpath = "//button[@data-testid='login-logout-button']")
    public WebElement cikisButton;
    @FindBy(id = "mainmenu-home-button")
    public WebElement anaSayfaButton;
    @FindBy(id = "mainmenu-events-button")
    public WebElement etkinliklerButton;
    @FindBy(id = "mainmenu-new-event-button")
    public WebElement etkinlikFormuButton;
    @FindBy(xpath = "//button[@data-testid='mainmenu-reservation-button']")
    public WebElement rezervasyonButton;
    @FindBy(xpath = "//div[@class='kampara-logo']")
    public WebElement kamparaLogo;
    @FindBy(xpath = "//a[@href='https://www.instagram.com/kamparanet/']")
    public WebElement instagramLink;
    @FindBy(xpath = "//a[@href='https://www.youtube.com/channel/UCfFh0IkxmAJEoNZprmofG2w']")
    public WebElement youtubeLink;
    @FindBy(xpath = "//a[@href='https://www.linkedin.com/company/kamparanet']")
    public WebElement linkedInLink;

    public void socialMediaLinks(String socialMediaType){
        Actions action=new Actions(Driver.getDriver());
        if(socialMediaType.equals("instagram")){
            action.moveToElement(instagramLink).perform();
            instagramLink.click();
        }else if(socialMediaType.equals("youtube")){
            action.moveToElement(youtubeLink).perform();
            youtubeLink.click();
        }else if(socialMediaType.equals("linkedIn")){
            action.moveToElement(linkedInLink).perform();
            linkedInLink.click();
        }else {
            throw new NoSuchElementException("");
        }

    }

}
