package steps.definitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.testng.Assert.assertTrue;
public class MyStepdefs {

    private WebDriver driver;
    protected HomePage homePage;
    @Given("I navigate to main page")
    public void iNavigateToMainPage() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.get("https://the-internet.herokuapp.com/");
    }

    @And("I click on FormAuthentication link")
    public void iClickOnFormAuthenticationLink() {
        homePage.clickFormAuthentication();
    }

    @When("I enter username {string}")
    public void iEnterUsername(String username) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameField(username);
    }

    @And("I enter password")
    public void iEnterPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setPasswordField("SuperSecretPassword!");
    }

    @And("I click Login button")
    public void iClickLoginButton() {
        LoginPage loginPage = new LoginPage(driver);
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
    }

    @Then("welcome message is displayed in SecureArea page")
    public void welcomeMessageIsDisplayedInSecureAreaPage() {
        SecureAreaPage secureAreaPage = new SecureAreaPage(driver);
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"));
    }

    @After()
    public void quitBrowser(){
        driver.quit();
    }
}