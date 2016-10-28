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

    }
}

