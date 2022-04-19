package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    // Definimos el driver => definir el manejador del navegador
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Definimos los elementos con los que voy a interactuar
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("#login button");

    // Definimos las funciones a ejecutar => solo escribir, no devuelve nada "void"
    public void setUsernameField(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPasswordField(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    // Devolvemos una página de SecureArea
    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        // devuelve la página de SecureArea
        return new SecureAreaPage(driver);
    }
}

