package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Grupos {

    @Test (groups = { "Car" },priority = 1,description = "Este es el test para el auto 1")
    public void Car1() {
        System.out.println("Batch Car - Test car 1");
        Reporter.log("Pasó el test car 1");

        Assert.assertTrue(true);

    }

    @Test (groups = { "Car" },priority = 0)
    public void Car2() {
        //Assert.fail();
        System.out.println("Batch Car - Test car 2");
    }

    @Test (groups = { "Scooter" })
    public void Scooter1() {
        System.out.println("Batch Scooter - Test scooter 1");
    }

    @Test (groups = { "Scooter" })
    public void Scooter2() {
        System.out.println("Batch Scooter - Test scooter 2");
    }

    @Test (groups = { "Car", "Sedan Car" })
    public void Sedan1() {
        System.out.println("Batch Sedan Car - Test sedan 1");
    }
}