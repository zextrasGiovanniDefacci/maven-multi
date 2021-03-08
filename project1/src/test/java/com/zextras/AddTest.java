package com.zextras;

import org.junit.Assert;
import org.junit.Test;

public class AddTest {

    @Test
    public void addTest() {
        Add calculator = new Add();
        Assert.assertEquals(3, calculator.add(1, 2));
    }

}