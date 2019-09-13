package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

public class Parametros {

    @Test

    @Parameters({ "valor1", "valor2" })

    public void test(int valor1, int valor2) {
        Assert.assertEquals(valor1,valor2);
    }

}