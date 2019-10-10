package edu.gcccd.csis;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class PiTest {

    @Test
    public void calculatePi() {
        //System.out.println("Acutal PI: " + Math.PI);
        double estimatedPi = Pi.calculatePi();
        //System.out.println("Esitmated PI: " + estimatedPi);
        //double error = Math.abs(Math.PI - estimatedPi);
        //System.out.println("Error is: " + error);
        Assert.assertEquals(Math.PI, estimatedPi, 0.00000001);
    }
}