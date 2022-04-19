package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {

    private WebDriver driver;
    // Indicamos la página en la que empezamos
    protected HomePage homePage;

    // Cómo iniciamos antes de iniciar los tests
    @BeforeClass
    public void setUp() {
        // Buscar dónde está el chromedriver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        // Instanciamos el driver
        driver = new ChromeDriver();

        // Instanciar HomePage => enviamos la dirección de la url
        homePage = new HomePage(driver);
        driver.get("https://the-internet.herokuapp.com/");


    }

    // Cómo terminamos después de ejecutar los tests
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
