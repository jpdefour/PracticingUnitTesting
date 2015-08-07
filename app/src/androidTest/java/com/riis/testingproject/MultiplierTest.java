package com.riis.testingproject;

import android.test.suitebuilder.annotation.SmallTest;

import junit.framework.TestCase;

/**
 * Created by jdefour on 8/3/2015.
 */
public class MultiplierTest extends TestCase {

    @SmallTest
    public void testMultiplierTwo() {
        double testResult = Multiplier.multiplyTwo(3, 4);
        assertEquals(12, testResult, .000001);
    }

    @SmallTest
    public void testMultiplierThree() {
        double testResult = Multiplier.multiplyThree(2, 3, 4);
        assertEquals(24, testResult, .000001);
    }
}
