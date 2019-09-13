package selenium.paginas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PaginaPrincipal {
    private WebDriver driver;
    private By titleText;
    public PaginaPrincipal(WebDriver driver) {
        this.driver = driver;
        titleText = By.xpath("");
    }

    public void assertLogonPage() {
        Assert.assertTrue(driver.findElement(titleText).getText().contains("Welcome back to"));
    }
}

