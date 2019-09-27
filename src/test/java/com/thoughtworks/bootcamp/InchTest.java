package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InchTest {
    @Test
    void givenZeroInchAndZeoInch_WhenEquals_ThenShouldBeEqual(){
        Inch zeroInchOne = new Inch(0.0);
        Inch zeroInchTwo=new Inch(0.0);
        assertTrue(zeroInchOne.equals(zeroInchTwo));
    }

    @Test
    void givenOneInchAndOneInch_WhenCompare_ThenShouldBeEqual(){
        Inch oneInchOne = new Inch(1.0);
        Inch oneInchTwo=new Inch(1.0);
        assertTrue(oneInchOne.compare(oneInchTwo));
    }

    @Test
    void givenOneInchAndTwoInch_WhenCompare_ThenShouldNotBeEqual(){
        Inch oneInch = new Inch(1.0);
        Inch twoInch=new Inch(2.0);
        assertFalse(oneInch.compare(twoInch));
    }
}
