/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author jaspreetsingh
 */
public class EvenOddTest {

    EvenOdd myTest = new EvenOdd();

    @Test
    public void Test1() {
        Assert.assertFalse(myTest.isEvenNumber(3));
    }

    @Test
    public void Test2() {
        Assert.assertTrue(myTest.isEvenNumber(2));

    }

    @Test
    public void Test3() {
        Assert.assertTrue(myTest.isEvenNumber(1));

    }

}
