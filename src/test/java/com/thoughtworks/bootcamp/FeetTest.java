package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FeetTest {
    @Test
    void givenZeroFeetAndZeoFeet_WhenEquals_ThenShouldBeEqual(){
        Feet zeroFeetOne = new Feet(0.0);
        Feet zeroFeetTwo=new Feet(0.0);
        assertTrue(zeroFeetOne.equals(zeroFeetTwo));
    }

    @Test
    void givenOneFeetAndOneFeet_WhenCompare_ThenShouldBeEqual(){
        Feet oneFeetOne = new Feet(1.0);
        Feet oneFeetTwo=new Feet(1.0);
        assertTrue(oneFeetOne.compare(oneFeetTwo));
    }


}
