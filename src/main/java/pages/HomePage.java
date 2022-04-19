package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    // Definimos el driver => definir el manejador del navegador
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Buscar un elemento con el by.linkText => buscamos por texto
    private By formAuthenticationLink = By.linkText("Form Authentication");

    // ACCIONES
    // Definir función para clickar en la función
    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
}


