package model;


import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static model.GCDHelper.GCD;

public class GCDTest {

    @Test
    public void GCDtest() {
        double a = 0;
        double b = 0;

        Assert.assertEquals(GCD(a, b), 0.0);

        a = 10;
        b = 5;
        Assert.assertEquals(GCD(a, b), 5.0);


        a = 7;
        b = 3;
        Assert.assertEquals(GCD(a, b), 1.0);
    }

    @Test
    public void GCDForArrayTest() {
        List<Double> doubleList = new ArrayList<>(Arrays.asList(2.0, 3.0, 5.0));

        Assert.assertEquals(GCD(doubleList), 1.0);

        doubleList = new ArrayList<>(Arrays.asList(-72.000, 54.000, -36.000, 0.000, -90.000));
        Assert.assertEquals(GCD(doubleList), -18.0);

        doubleList = new ArrayList<>(Arrays.asList(-63.000, -54.000, -189.000, -90.000, 0.000));
        Assert.assertEquals(GCD(doubleList), -9.0);
    }
}
