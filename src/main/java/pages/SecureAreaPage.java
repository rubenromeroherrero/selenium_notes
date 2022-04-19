package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    // Definimos el driver => definir el manejador del navegador
    private WebDriver driver;
    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    // Definimos los elementos con los que voy a interactuar
    private By statusAlert = By.id("flash");

    // Definimos las funciones a ejecutar
    public String getAlertText() {
        // Extraemos el texto del elemento que nos sale de alerta
        return driver.findElement(statusAlert).getText();
    }

}
