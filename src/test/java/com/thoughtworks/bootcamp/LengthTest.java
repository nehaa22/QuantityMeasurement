package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {

    @Test
    void givenZeroFeetAndZeoFeet_WhenCompare_ThenShouldBeEqual() {
        Length zeroFeetOne = new Length(0.0, Length.Unit.feet);
        Length zeroFeetTwo = new Length(0.0, Length.Unit.feet);

        assertEquals(zeroFeetOne, zeroFeetTwo);
    }

    @Test
    void givenOneFeetAndOneFeet_WhenCompare_ThenShouldBeEqual() {
        Length oneFeetOne = new Length(1.0, Length.Unit.feet);
        Length oneFeetTwo = new Length(1.0, Length.Unit.feet);

        assertEquals(oneFeetOne, oneFeetTwo);
    }

    @Test
    void givenTwoFeetAndTwoFeet_WhenCompare_ThenShouldNotBeEqual() {
        Length oneFeetOne = new Length(1.0, Length.Unit.feet);
        Length twoFeetTwo = new Length(2.0, Length.Unit.feet);

        assertNotEquals(oneFeetOne, twoFeetTwo);
    }

    @Test
    void givenOneFeetAndString_WhenCompare_ThenShouldNotBeEqual() {
        Length oneFeetOne = new Length(1.0, Length.Unit.feet);
        String dummyString = "TDD";

        assertNotEquals(oneFeetOne, dummyString);
    }

    @Test
    void givenOneFeetAndNull_WhenCompare_ThenShouldNotBeEqual() {
        Length oneFeetOne = new Length(1.0, Length.Unit.feet);
        Length nullObject =null;

        assertNotEquals(oneFeetOne, nullObject);
    }

    @Test
    void givenSameObect_WhenCompare_ThenShouldBeEqual() {
        Length oneFeet = new Length(1.0, Length.Unit.feet);

        assertEquals(oneFeet, oneFeet);
    }


    @Test
    void givenZeroInchAndZeoInch_WhenEquals_ThenShouldBeEqual(){
        Length zeroInchOne = new Length(0.0, Length.Unit.inch);
        Length zeroInchTwo=new Length(0.0, Length.Unit.inch);
        assertEquals(zeroInchOne, zeroInchTwo);
    }

    @Test
    void givenOneInchAndOneInch_WhenCompare_ThenShouldBeEqual(){
        Length oneInchOne = new Length(1.0, Length.Unit.inch);
        Length oneInchTwo=new Length(1.0, Length.Unit.inch);
        assertEquals(oneInchOne, oneInchTwo);
    }

    @Test
    void givenOneInchAndTwoInch_WhenCompare_ThenShouldNotBeEqual(){
        Length oneInch = new Length(1.0, Length.Unit.inch);
        Length twoInch=new Length(2.0, Length.Unit.inch);
        assertNotEquals(oneInch, twoInch);
    }

    @Test
    void givenOneInchAndString_WhenCompare_ThenShouldNotBeEqual() {
        Length oneInch = new Length(1.0, Length.Unit.inch);
        String dummyString = "TDD";
        assertNotEquals(oneInch, dummyString);
    }

    @Test
    void givenOneInchAndNull_WhenCompare_ThenShouldNotBeEqual() {
        Length oneInch = new Length(1.0, Length.Unit.inch);
        Length nullObject =null;
        assertNotEquals(oneInch, nullObject);
    }

    @Test
    void givenSameInchObejct_WhenCompare_ThenShouldBeEqual() {
        Length oneInch = new Length(1.0, Length.Unit.inch);

        assertEquals(oneInch, oneInch);
    }

}
