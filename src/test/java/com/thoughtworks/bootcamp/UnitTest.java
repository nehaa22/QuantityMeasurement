package com.thoughtworks.bootcamp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class UnitTest {

    @Test
    void givenOneFeet_WhenConvertToTwelveInches_ThenShouldGetConvert(){
        Assertions.assertEquals(12,Unit.feet.convertToBase(1));
    }

    @Test
    void givenOneInch_WhenConvertToInches_ThenShouldGetConvert(){
        Assertions.assertEquals(1,Unit.inch.convertToBase(1));
    }

    @Test
    void givenTwoInch_WhenConvertToInches_ThenShouldGetConvert(){
        Assertions.assertEquals(2,Unit.inch.convertToBase(2));
    }

    @Test
    void givenOneYard_WhenConvertToFeet_ThenShouldGetConvert(){
        Assertions.assertEquals(36,Unit.yard.convertToBase(1));
    }



//    @Test
//    void givenTwoFiftyFourCM_WhenConvertToInches_ThenShouldGetConvert(){
//        Assertions.assertEquals(1,Unit.cm.convertToBase(2.54),0.01);
//    }

}
