package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Test;

import static com.thoughtworks.bootcamp.QuantityFactory.*;
import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {

    @Test
    void givenZeroFeetAndZeoFeet_WhenCompare_ThenShouldBeEqual() {
        Quantity zeroFeetOne = createFeet(0);
        Quantity zeroFeetTwo = createFeet(0);
        assertEquals(zeroFeetOne, zeroFeetTwo);
    }

    @Test
    void givenOneFeetAndOneFeet_WhenCompare_ThenShouldBeEqual() {
        Quantity oneFeetOne = createFeet(1);
        Quantity oneFeetTwo = createFeet(1);
        assertEquals(oneFeetOne, oneFeetTwo);
    }

    @Test
    void givenTwoFeetAndTwoFeet_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneFeetOne = createFeet(1);
        Quantity twoFeetTwo = createFeet(2);
        assertNotEquals(oneFeetOne, twoFeetTwo);
    }

    @Test
    void givenOneFeetAndString_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneFeetOne = createFeet(1);
        String dummyString = "TDD";
        assertNotEquals(oneFeetOne, dummyString);
    }

    @Test
    void givenOneFeetAndNull_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneFeetOne = createFeet(1);
        Quantity nullObject = null;
        assertNotEquals(oneFeetOne, nullObject);
    }

    @Test
    void givenSameObect_WhenCompare_ThenShouldBeEqual() {
        Quantity oneFeet = createFeet(1);
        assertEquals(oneFeet, oneFeet);
    }


    @Test
    void givenZeroInchAndZeoInch_WhenEquals_ThenShouldBeEqual() {
        Quantity zeroInchOne = createInch(0);
        Quantity zeroInchTwo = createInch(0);
        assertEquals(zeroInchOne, zeroInchTwo);
    }

    @Test
    void givenOneInchAndOneInch_WhenCompare_ThenShouldBeEqual() {
        Quantity oneInchOne = createInch(1);
        Quantity oneInchTwo = createInch(1);
        assertEquals(oneInchOne, oneInchTwo);
    }

    @Test
    void givenOneInchAndTwoInch_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneInch = createInch(1);
        Quantity twoInch = createInch(2);
        assertNotEquals(oneInch, twoInch);
    }

    @Test
    void givenOneInchAndString_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneInch = createInch(1);
        String dummyString = "TDD";
        assertNotEquals(oneInch, dummyString);
    }

    @Test
    void givenOneInchAndNull_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneInch = createInch(1);
        Quantity nullObject = null;
        assertNotEquals(oneInch, nullObject);
    }

    @Test
    void givenSameInchObejct_WhenCompare_ThenShouldBeEqual() {
        Quantity oneInch = createInch(1);
        assertEquals(oneInch, oneInch);
    }

    @Test
    void givenOneInchAndOneFeet_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneInch = createInch(1);
        Quantity oneFeet = createFeet(1);
        assertNotEquals(oneInch, oneFeet);
    }

    @Test
    void givenZeroInchAndZeroFeet_WhenCompare_ThenShouldBeEqual() {
        Quantity zeroInch = createInch(0);
        Quantity zeroFeet = createFeet(0);
        assertEquals(zeroInch, zeroFeet);
    }

    @Test
    void givenZeroInchAndOneFeet_WhenCompare_ThenNOtShouldBeEqual() {
        Quantity zeroInch = createInch(0);
        Quantity oneFeet = createFeet(1);
        assertNotEquals(zeroInch, oneFeet);
    }

    @Test
    void givenOneFeetAndTwelveInch_WhenCompare_ThenShouldBeEqual() {
        Quantity oneFeet = createFeet(1.0);
        Quantity twelveInch = createInch(12.0);
        assertEquals(oneFeet, twelveInch);
    }

    @Test
    void giventwelveInchAndOneFeet_WhenCompare_ThenShouldBeEqual() {
        Quantity twelveInch = createInch(12);
        Quantity oneFeet = createFeet(1);

        assertEquals(twelveInch, oneFeet);
    }

    @Test
    void givenOneYardAndOneYard_WhenCompare_ThenShouldBeEqual() {
        Quantity oneYardOne = createYard(1);
        Quantity oneYardTwo = createYard(1);
        assertEquals(oneYardOne, oneYardTwo);
    }

    @Test
    void givenOneYardAndTwoYard_WhenCompare_ThenShouldNotBeEqual() {
        Quantity twoYard = createYard(2);
        Quantity oneYard = createYard(1);
        assertNotEquals(twoYard, oneYard);
    }

    @Test
    void givenOneYardAndThreeFeet_WhenCompare_ThenShouldBeEqual() {
        Quantity oneYard = createYard(1);
        Quantity threeFeet =createFeet(3);
        assertEquals(oneYard, threeFeet);
    }

    @Test
    void givenOneYardAndThirtySixInch_WhenCompare_ThenShouldBeEqual() {
        Quantity oneYard = createYard(1);
        Quantity thirtySixFeet = createInch(36);

        assertEquals(oneYard, thirtySixFeet);
    }

    @Test
    void givenOneYardAndSixInch_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneYard = createYard(1);
        Quantity sixInch = createInch(6);
        assertNotEquals(oneYard, sixInch);
    }

    @Test
    void givenOneYardAndSixFeet_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneYard = createYard(1);
        Quantity sixFeet = createFeet(6);
        assertNotEquals(oneYard, sixFeet);
    }

    @Test
    void givenTwoZeroInch_WhenAdd_ThenShouldAdd() {
        Quantity zeroInch = createInch(0);
        Quantity anotherZero = createInch(0);
        assertEquals(createInch(0.0), zeroInch.add(anotherZero));
    }

//    @Test
//    void givenZeroInchAndOneInch_WhenAdd_ThenShouldAdd() {
//        Quantity zeroInch = new Quantity(0, Unit.inch);
//        Quantity oneInch = new Quantity(1, Unit.inch);
//
//        assertEquals(new Quantity(1.0, Unit.inch), zeroInch.add(oneInch));
//    }
//
//    @Test
//    void givenOneInchAndOneInch_WhenAdd_ThenShouldAdd() {
//        Quantity zeroInch = new Quantity(1, Unit.inch);
//        Quantity oneInch = new Quantity(1, Unit.inch);
//        assertEquals(new Quantity(2.0, Unit.inch), zeroInch.add(oneInch));
//    }

//    @Test
//    void givenOneFeetAndOneInch_WhenAdd_ThenShouldAdd() {
//        Quantity oneInch = new Quantity(1, Unit.inch);
//        Quantity oneFeet = new Quantity(1, Unit.feet);
//        assertEquals(new Quantity(13.0, Unit.inch), oneFeet.add(oneInch));
//    }
//
//    @Test
//    void givenOneInchAndOneFeet_WhenAdd_ThenShouldAdd() {
//        Quantity oneInch = new Quantity(1, Unit.inch);
//        Quantity oneFeet = new Quantity(1, Unit.feet);
//        assertEquals(new Quantity(13.0, Unit.inch), oneInch.add(oneFeet));
//    }
//
//    @Test
//    void givenOneFeetAndOneFeet_WhenAdd_ThenShouldAdd() {
//        Quantity onefeet = new Quantity(1, Unit.feet);
//        Quantity oneFeet = new Quantity(1, Unit.feet);
//        assertEquals(new Quantity(2.0, Unit.feet), onefeet.add(oneFeet));
//    }
//
//    @Test
//    void givenOneGallonAndOneGallon_WhenCompare_ThenShouldBeEqual() {
//        Quantity oneGallon = new Quantity(1, Unit.gallon);
//        Quantity anotherOneGallon = new Quantity(1, Unit.gallon);
//
//        assertEquals(oneGallon, anotherOneGallon);
//    }

//    @Test
//    void givenOneLitreAndOneLitre_WhenCompare_ThenShouldBeEqual() {
//
//        Quantity oneLitre = new Quantity(1, Unit.litre);
//        Quantity anotherOneLitre = new Quantity(1, Unit.litre);
//
//        assertEquals(oneLitre, anotherOneLitre);
//    }
//
//    @Test
//    void givenOneGallonAndThreeDotSevenEightLitre_WhenCompare_ThenShouldBeEqual() {
//        Quantity oneGallon = new Quantity(1, Unit.gallon);
//        Quantity ThreeDotSevenEightLitre = new Quantity(3.78, Unit.litre);
//
//        assertEquals(oneGallon, ThreeDotSevenEightLitre);
//    }
//
//    @Test
//    void givenOneGallonAndOneGallon_WhenAdd_ThenShouldAdd() {
//        Quantity oneGallon = new Quantity(1, Unit.gallon);
//        Quantity anotherGallon = new Quantity(1, Unit.gallon);
//        assertEquals(new Quantity(2, Unit.gallon), oneGallon.add(anotherGallon));
//    }
//
//    @Test
//    void givenOneLitreAndOneLitre_WhenAdd_ThenShouldAdd() {
//        Quantity oneLitre = new Quantity(1, Unit.litre);
//        Quantity anotherLitre = new Quantity(1, Unit.litre);
//        assertEquals(new Quantity(2, Unit.litre), oneLitre.add(anotherLitre));
//    }
//
//    @Test
//    void givenOneLitreAndOneGallon_WhenAdd_ThenShouldAdd() {
//        Quantity oneLitre = new Quantity(1, Unit.litre);
//        Quantity oneGallon = new Quantity(1, Unit.gallon);
//        assertEquals(new Quantity(4.78, Unit.litre), oneLitre.add(oneGallon));
//    }

//    @Test
//    void givenOneFeetAndOneGallon_WhenCompare_ThenShouldNotBeEqual() {
//        Quantity oneGallon = new Quantity(1, Unit.gallon);
//        Quantity oneFeet = new Quantity(1, Unit.feet);
//        assertNotEquals(oneGallon, oneFeet);
//
//    }
//
//    @Test
//    void givenOneLitreAndOneInch_WhenCompare_ThenShouldNotBeEqual() {
//        Quantity oneLitre = new Quantity(1, Unit.litre);
//        Quantity oneInch = new Quantity(1, Unit.inch);
//        assertNotEquals(oneLitre, oneInch);
//    }
//
//    @Test
//    void givenOneLitreAndOneFeet_WhenCompare_ThenShouldNotBeEqual() {
//        Quantity oneLitre = new Quantity(1, Unit.litre);
//        Quantity oneFeet = new Quantity(1, Unit.feet);
//        assertNotEquals(oneLitre, oneFeet);
//    }
//    @Test
//    void givenOneLitreAndOneYard_WhenCompare_ThenShouldNotBeEqual() {
//        Quantity oneLitre = new Quantity(1, Unit.litre);
//        Quantity oneYard = new Quantity(1, Unit.yard);
//        assertNotEquals(oneLitre, oneYard);
//    }
//
//    @Test
//    void givenOneGallonAndOneInch_WhenCompare_ThenShouldNotBeEqual() {
//        Quantity oneGallon = new Quantity(1, Unit.gallon);
//        Quantity oneInch = new Quantity(1, Unit.inch);
//        assertNotEquals(oneGallon, oneInch);
//    }
//
//    @Test
//    void givenOneGallonAndOneFeet_WhenCompare_ThenShouldNotBeEqual() {
//        Quantity oneGallon = new Quantity(1, Unit.gallon);
//        Quantity oneFeet = new Quantity(1, Unit.feet);
//        assertNotEquals(oneGallon, oneFeet);
//    }
//
//    @Test
//    void givenOneGallonAndOneYard_WhenCompare_ThenShouldNotBeEqual() {
//        Quantity oneGallon = new Quantity(1, Unit.gallon);
//        Quantity oneYard = new Quantity(1, Unit.yard);
//        assertNotEquals(oneGallon, oneYard);
//    }
//
//    @Test
//    void givenOneLitreAndOneFeet_WhenAdd_ThenShouldThrowException() {
//        Quantity oneLitre = new Quantity(1, Unit.litre);
//        Quantity oneFeet = new Quantity(1, Unit.feet);
//        assertThrows(IllegalArgumentException.class, () -> {
//            oneLitre.add(oneFeet);
//        });
//    }
//    @Test
//    void givenOneLitreAndOneInch_WhenAdd_ThenShouldThrowException() {
//        Quantity oneLitre = new Quantity(1, Unit.litre);
//        Quantity oneInch = new Quantity(1, Unit.inch);
//        assertThrows(IllegalArgumentException.class, () -> {
//            oneLitre.add(oneInch);
//        });
//    }
//    @Test
//    void givenOneLitreAndOneYard_WhenAdd_ThenShouldThrowException() {
//
//        Quantity oneLitre = new Quantity(1, Unit.litre);
//        Quantity oneYard = new Quantity(1, Unit.yard);
//        assertThrows(IllegalArgumentException.class, () -> {
//            oneLitre.add(oneYard);
//        });
//    }
//    @Test
//    void givenOneGallonAndOneInch_WhenAdd_ThenShouldThrowException() {
//
//        Quantity oneGallon = new Quantity(1, Unit.litre);
//        Quantity oneInch = new Quantity(1, Unit.inch);
//        assertThrows(IllegalArgumentException.class, () -> {
//            oneGallon.add(oneInch);
//        });
//    }
//    @Test
//    void givenOneGallonAndOneFeet_WhenAdd_ThenShouldThrowException() {
//
//        Quantity oneGallon = new Quantity(1, Unit.litre);
//        Quantity oneFeet = new Quantity(1, Unit.feet);
//        assertThrows(IllegalArgumentException.class, () -> {
//            oneGallon.add(oneFeet);
//        });
//    }
//
//    @Test
//    void givenOneGallonAndOneYard_WhenAdd_ThenShouldThrowException() {
//
//        Quantity oneGallon = new Quantity(1, Unit.litre);
//        Quantity oneYard = new Quantity(1, Unit.yard);
//        assertThrows(IllegalArgumentException.class, () -> {
//            oneGallon.add(oneYard);
//        });
//    }
//
//    @Test
//    void givenTwoZeroYard_WhenAdd_ThenShouldAdd() {
//        Quantity zeroYard = new Quantity(0, Unit.yard);
//        Quantity anotherZeroYard = new Quantity(0, Unit.yard);
//        assertEquals(new Quantity(0.0, Unit.inch), zeroYard.add(anotherZeroYard));
//    }
//
//    @Test
//    void givenTwoOneYard_WhenAdd_ThenShouldAdd() {
//        Quantity oneYard = new Quantity(1, Unit.yard);
//        Quantity anotherOneYard = new Quantity(1, Unit.yard);
//        assertEquals(new Quantity(72.0, Unit.inch), oneYard.add(anotherOneYard));
//    }


}

