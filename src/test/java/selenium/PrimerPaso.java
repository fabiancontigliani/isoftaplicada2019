package selenium;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.helpers.CapturadorPantalla;
import selenium.helpers.WebDriversManager;
import selenium.paginas.PaginaLogin;
//import pages.PaginaLogin;
//import pages.PageLogon;

public class PrimerPaso {
    private WebDriver driver;
    ArrayList<String> tabs;
    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        //driver.manage().window().setSize(new Dimension(200,200));
        //driver.manage().window().setPosition(new Point(500,500));
        driver.navigate().to("http://virtual.um.edu.ar/login/index.php");
        //JavascriptExecutor javaScriptExecutor = (JavascriptExecutor)driver;
        //String googleWindow =  "window.open('http://www.google.com')";
        //javaScriptExecutor.executeScript(googleWindow);
        tabs = new ArrayList<String> (driver.getWindowHandles());

    }

     /*@Test
    /*public void loginIncorrecto() {
        WebDriversManager.setWindowSize(driver, "maximized");
        driver.switchTo().window(tabs.get(1)).navigate().to("http://www.um.edu.ar");
        driver.switchTo().window(tabs.get(0));
        PaginaLogin pageLogin = new PaginaLogin(driver);
       // PageLogon pageLogon = new PageLogon(driver);
        pageLogin.login("user", "user");
      //  pageLogon.assertLogonPage();
    }*/

    @Test
    public void login() {
        WebDriversManager.setWindowSize(driver, "fullscreen");
        PaginaLogin pageLogin = new PaginaLogin(driver);
       // PageReservation pageReservation = new PageReservation(driver);
        pageLogin.login("fabian", "um");
      //  pageReservation.assertPage();
    }

     /*@Test
    public void pruebaTres() {
        WebDriversManager.setWindowSize(driver,400,400);
        PaginaLogin pageLogin = new PaginaLogin(driver);
        pageLogin.login("mercury", "mercury");


    }*/

    /*@Test
    public void pruebaCantidadDeCampos() {
        PaginaLogin pageLogin = new PaginaLogin(driver);
        pageLogin.verifyFields();
    }*/

    @AfterMethod
    public void tearDown(ITestResult result) {
       /* if(!result.isSuccess()){
            CapturadorPantalla.takeScreenshot("Error", driver);
        }
        driver.switchTo().window(tabs.get(1)).close();
        driver.switchTo().window(tabs.get(0)).close();*/
    }
}