package step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v114.browser.model.BrowserCommandId;
import org.openqa.selenium.devtools.v114.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DashBoardPage;
import utilities.BrowserUtils;
import utilities.Driver;

import java.time.Duration;
import java.util.Set;

import static org.junit.Assert.*;

public class DashBoard_StepDefs {
    DashBoardPage dashBoardPage = new DashBoardPage();

    @Given("language button needs to be {string}")
    public void language_button_needs_to_be_by_default(String expectedLanguage) {
        String actualLanguage = dashBoardPage.languageButton.getText();
        assertEquals(expectedLanguage, actualLanguage);
    }

    @When("User clicks language button")
    public void user_clicks_language_button() {
        dashBoardPage.languageButton.click();
    }

    @Given("Theme button needs to be {string}")
    public void theme_button_needs_to_be(String expectedTheme) {
        String actualTheme = dashBoardPage.themeButton.getText().toLowerCase();
        System.out.println(actualTheme);
        assertEquals(expectedTheme, actualTheme);
    }

    @When("User clicks theme button")
    public void user_clicks_theme_button() {
        dashBoardPage.themeButton.click();
    }


    @When("User clicks profile button")
    public void user_clicks_profile_button() {
        dashBoardPage.profilButton.click();
    }

    @When("User clicks Cikis button")
    public void user_clicks_cikis_button() {
        dashBoardPage.cikisButton.click();
    }

    @Then("Title needs to contain {string}")
    public void title_needs_to_contain(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        assertTrue(actualTitle.contains(expectedTitle));
    }

    @When("User scrolls down the page")
    public void user_scrolls_down_the_page() {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).perform();
    }

    String initialHandle="";
    String afterSwitchHandle="";
    @When("User clicks on {string} icon")
    public void user_clicks_on_icon(String mediaType) {
        initialHandle=Driver.getDriver().getWindowHandle();
        dashBoardPage.socialMediaLinks(mediaType);
    }
    @Then("User can see socialMedia account in new tab")
    public void user_can_see_social_media_account_in_new_tab() {
        Set<String> allWindows=Driver.getDriver().getWindowHandles();
        for (String each : allWindows) {
            Driver.getDriver().switchTo().window(each);
            if (Driver.getDriver().getCurrentUrl().contains("Kamp")){
                break;
            }else if (Driver.getDriver().getCurrentUrl().contains("Youtube")){
                break;
            }
        }
    afterSwitchHandle=Driver.getDriver().getWindowHandle();

     assertFalse(initialHandle.equals(afterSwitchHandle));

    }


}
