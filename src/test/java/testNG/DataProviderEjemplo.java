package testNG;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEjemplo {

    @DataProvider(name = "Valores")
    public static Object[][] datos() {
        return new Object[][] { { 2, 2 }, { 4, 5 }};
    }

    @Test(dataProvider = "Valores")
    public void test(int valor1, int valor2) {
        Assert.assertEquals(valor1,valor2);
    }

}


