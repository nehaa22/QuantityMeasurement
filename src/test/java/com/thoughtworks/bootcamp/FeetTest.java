package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class FeetTest {

    @Test
    void givenZeroFeetAndZeoFeet_WhenCompare_ThenShouldBeEqual() {

        Feet zeroFeetOne = new Feet(0.0);
        Feet zeroFeetTwo = new Feet(0.0);

        assertEquals(zeroFeetOne, zeroFeetTwo);
    }

    @Test
    void givenOneFeetAndOneFeet_WhenCompare_ThenShouldBeEqual() {
        Feet oneFeetOne = new Feet(1.0);
        Feet oneFeetTwo = new Feet(1.0);

        assertEquals(oneFeetOne, oneFeetTwo);
    }

    @Test
    void givenTwoFeetAndTwoFeet_WhenCompare_ThenShouldNotBeEqual() {
        Feet oneFeetOne = new Feet(1.0);
        Feet twoFeetTwo = new Feet(2.0);
        assertNotEquals(oneFeetOne, twoFeetTwo);
    }


}
