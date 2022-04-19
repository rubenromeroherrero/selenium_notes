package login;
import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.testng.Assert.*;

//Extend coge all of lo de BaseTests
public class LoginTests extends BaseTests {

    // Definimos todos los tests que vamos a hacer [it. => cypress]
    @Test (priority = 1)
    public void testSuccessfullLogin() {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsernameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        // Comprobamos con una aserción que se ha hecho correctamente el login
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"));
    }


}
