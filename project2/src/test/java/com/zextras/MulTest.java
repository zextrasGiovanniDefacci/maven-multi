package com.zextras;

import org.junit.Assert;
import org.junit.Test;

public class MulTest {

    @Test
    public void addTest() {
        Mul calculator = new Mul();
        Assert.assertEquals(2, calculator.mul(1, 2));
    }

}