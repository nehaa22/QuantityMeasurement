package com.thoughtworks.bootcamp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UnitTest {

    @Test
    public  void givenOneFeet_WhenConvertToThelveInches_ThenShouldGetConvert(){
        Assertions.assertEquals(12,Unit.feet.convertToBase(1));
    }

    @Test
    public  void givenOneInch_WhenConvertToInches_ThenShouldGetConvert(){
        Assertions.assertEquals(1,Unit.inch.convertToBase(1));
    }

    @Test
    public  void givenTwoInch_WhenConvertToInches_ThenShouldGetConvert(){
        Assertions.assertEquals(2,Unit.inch.convertToBase(2));
    }

}
