package com.thoughtworks.bootcamp.Units.Length;

import com.thoughtworks.bootcamp.Quantity;
import com.thoughtworks.bootcamp.QuantityFactory;
import com.thoughtworks.bootcamp.Units.Unit;

public class Yard implements Length {

    public Quantity convertToBase(double value){
        double conversionFactor = 36;
        return QuantityFactory.createInch(conversionFactor *value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Yard;
    }
}
