package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {

    @Test
    void givenZeroFeetAndZeoFeet_WhenCompare_ThenShouldBeEqual() {
        Length zeroFeetOne = new Length(0.0, Unit.feet);
        Length zeroFeetTwo = new Length(0.0, Unit.feet);

        assertEquals(zeroFeetOne, zeroFeetTwo);
    }

    @Test
    void givenOneFeetAndOneFeet_WhenCompare_ThenShouldBeEqual() {
        Length oneFeetOne = new Length(1.0, Unit.feet);
        Length oneFeetTwo = new Length(1.0, Unit.feet);

        assertEquals(oneFeetOne, oneFeetTwo);
    }

    @Test
    void givenTwoFeetAndTwoFeet_WhenCompare_ThenShouldNotBeEqual() {
        Length oneFeetOne = new Length(1.0, Unit.feet);
        Length twoFeetTwo = new Length(2.0, Unit.feet);

        assertNotEquals(oneFeetOne, twoFeetTwo);
    }

    @Test
    void givenOneFeetAndString_WhenCompare_ThenShouldNotBeEqual() {
        Length oneFeetOne = new Length(1.0, Unit.feet);
        String dummyString = "TDD";

        assertNotEquals(oneFeetOne, dummyString);
    }

    @Test
    void givenOneFeetAndNull_WhenCompare_ThenShouldNotBeEqual() {
        Length oneFeetOne = new Length(1.0, Unit.feet);
        Length nullObject = null;

        assertNotEquals(oneFeetOne, nullObject);
    }

    @Test
    void givenSameObect_WhenCompare_ThenShouldBeEqual() {
        Length oneFeet = new Length(1.0, Unit.feet);

        assertEquals(oneFeet, oneFeet);
    }


    @Test
    void givenZeroInchAndZeoInch_WhenEquals_ThenShouldBeEqual() {
        Length zeroInchOne = new Length(0.0, Unit.inch);
        Length zeroInchTwo = new Length(0.0, Unit.inch);
        assertEquals(zeroInchOne, zeroInchTwo);
    }

    @Test
    void givenOneInchAndOneInch_WhenCompare_ThenShouldBeEqual() {
        Length oneInchOne = new Length(1.0, Unit.inch);
        Length oneInchTwo = new Length(1.0, Unit.inch);
        assertEquals(oneInchOne, oneInchTwo);
    }

    @Test
    void givenOneInchAndTwoInch_WhenCompare_ThenShouldNotBeEqual() {
        Length oneInch = new Length(1.0, Unit.inch);
        Length twoInch = new Length(2.0, Unit.inch);
        assertNotEquals(oneInch, twoInch);
    }

    @Test
    void givenOneInchAndString_WhenCompare_ThenShouldNotBeEqual() {
        Length oneInch = new Length(1.0, Unit.inch);
        String dummyString = "TDD";
        assertNotEquals(oneInch, dummyString);
    }

    @Test
    void givenOneInchAndNull_WhenCompare_ThenShouldNotBeEqual() {
        Length oneInch = new Length(1.0, Unit.inch);
        Length nullObject = null;
        assertNotEquals(oneInch, nullObject);
    }

    @Test
    void givenSameInchObejct_WhenCompare_ThenShouldBeEqual() {
        Length oneInch = new Length(1.0, Unit.inch);

        assertEquals(oneInch, oneInch);
    }

    @Test
    void givenOneInchAndOneFeet_WhenCompare_ThenShouldNotBeEqual() {
        Length oneInch = new Length(1.0, Unit.inch);
        Length oneFeet = new Length(1.0, Unit.feet);

        assertNotEquals(oneInch, oneFeet);
    }

    @Test
    void givenZeroInchAndZeroFeet_WhenCompare_ThenShouldBeEqual() {
        Length zeroInch = new Length(0.0, Unit.inch);
        Length zeroFeet = new Length(0.0, Unit.feet);

        assertEquals(zeroInch, zeroFeet);
    }

    @Test
    void givenZeroInchAndOneFeet_WhenCompare_ThenNOtShouldBeEqual() {
        Length zeroInch = new Length(0.0, Unit.inch);
        Length oneFeet = new Length(1.0, Unit.feet);

        assertNotEquals(zeroInch, oneFeet);
    }

    @Test
    void givenOneFeetAndTwelveInch_WhenCompare_ThenShouldBeEqual() {
        Length oneFeet = new Length(1.0, Unit.feet);
        Length twelveInch = new Length(12.0, Unit.inch);

        assertEquals(oneFeet, twelveInch);
    }

    @Test
    void giventwelveInchAndOneFeet_WhenCompare_ThenShouldBeEqual() {
        Length twelveInch = new Length(12.0, Unit.inch);
        Length oneFeet = new Length(1.0, Unit.feet);

        assertEquals(twelveInch, oneFeet);
    }

    @Test
    void givenOneYardAndOneYard_WhenCompare_ThenShouldBeEqual() {
        Length twelveInch = new Length(1.0, Unit.yard);
        Length oneFeet = new Length(1.0, Unit.yard);

        assertEquals(twelveInch, oneFeet);
    }

    @Test
    void givenOneYardAndTwoYard_WhenCompare_ThenShouldNotBeEqual() {
        Length twoYard = new Length(2.0, Unit.yard);
        Length oneYard = new Length(1.0, Unit.yard);

        assertNotEquals(twoYard, oneYard);
    }

    @Test
    void givenOneYardAndThreeFeet_WhenCompare_ThenShouldBeEqual() {
        Length oneYard = new Length(1.0, Unit.yard);
        Length threeFeet = new Length(3.0, Unit.feet);

        assertEquals(oneYard, threeFeet);
    }

    @Test
    void givenOneYardAndThirtySixInch_WhenCompare_ThenShouldBeEqual() {
        Length oneYard = new Length(1.0, Unit.yard);
        Length thirtySixFeet = new Length(36.0, Unit.inch);

        assertEquals(oneYard, thirtySixFeet);
    }

    @Test
    void givenOneYardAndSixInch_WhenCompare_ThenShouldNotBeEqual() {
        Length oneYard = new Length(1.0, Unit.yard);
        Length sixInch = new Length(6.0, Unit.inch);

        assertNotEquals(oneYard, sixInch);
    }

    @Test
    void givenOneYardAndSixFeet_WhenCompare_ThenShouldNotBeEqual() {
        Length oneYard = new Length(1.0, Unit.yard);
        Length sixFeet = new Length(6.0, Unit.feet);

        assertNotEquals(oneYard, sixFeet);
    }

    @Test
    void givenTwoZeroInch_WhenAdd_ThenShouldAdd() {
        Length zeroInch = new Length(0, Unit.inch);
        Length anotherZero = new Length(0, Unit.inch);

        assertEquals(new Length(0.0, Unit.inch), zeroInch.add(anotherZero));
    }

    @Test
    void givenZeroInchAndOneInch_WhenAdd_ThenShouldAdd() {
        Length zeroInch = new Length(0, Unit.inch);
        Length oneInch = new Length(1, Unit.inch);

        assertEquals(new Length(1.0, Unit.inch), zeroInch.add(oneInch));
    }

    @Test
    void givenOneInchAndOneInch_WhenAdd_ThenShouldAdd() {
        Length zeroInch = new Length(1, Unit.inch);
        Length oneInch = new Length(1, Unit.inch);

        assertEquals(new Length(2.0, Unit.inch), zeroInch.add(oneInch));
    }

    @Test
    void givenOneFeetAndOneInch_WhenAdd_ThenShouldAdd() {
        Length oneInch = new Length(1, Unit.inch);
        Length oneFeet = new Length(1, Unit.feet);

        assertEquals(new Length(13.0, Unit.inch), oneFeet.add(oneInch));
    }

    @Test
    void givenOneInchAndOneFeet_WhenAdd_ThenShouldAdd() {
        Length oneInch = new Length(1, Unit.inch);
        Length oneFeet = new Length(1, Unit.feet);

        assertEquals(new Length(13.0, Unit.inch), oneInch.add(oneFeet));
    }


}
