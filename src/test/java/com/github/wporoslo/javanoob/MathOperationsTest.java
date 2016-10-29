package com.github.wporoslo.javanoob;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by Wojciech on 28.10.2016.
 */
public class MathOperationsTest {
    @Test
    public void testAdd() throws Exception {
        MathOperations operations = new MathOperations();
        int sum = operations.sum(2, 3);
        Assert.assertThat(sum, is(5));
    }

    @Test
    public void testSubtract() throws Exception {
        MathOperations operations = new MathOperations();
        int difference = operations.difference(5, 3);
        Assert.assertThat(difference, is(2));
    }

    @Test
    public void testMultiply() throws Exception {
        MathOperations operations = new MathOperations();
        int product = operations.product(2, 3);
        Assert.assertThat(product, is(6));
    }

    @Test
    public void testDivide() throws Exception {
        MathOperations operations = new MathOperations();
        int quotient = operations.quotient(8, 2);
        Assert.assertThat(quotient, is(4));
    }

    @Test
    public void testExponentiate() throws Exception {
        MathOperations operations = new MathOperations();
        int power = operations.power(3, 3);
        Assert.assertThat(power, is(27));
    }
}

