package com.thoughtworks.bootcamp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UnitTest {

    @Test
    public  void givenOneFeet_WhenConvertToThelveInches_ThenShouldGetConvert(){
        Assertions.assertEquals(12,Unit.feet.convertToBase(1));
    }

}
