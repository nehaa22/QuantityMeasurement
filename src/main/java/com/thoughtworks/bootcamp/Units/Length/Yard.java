package com.thoughtworks.bootcamp.Units.Length;

import com.thoughtworks.bootcamp.Quantity;
import com.thoughtworks.bootcamp.QuantityFactory;

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
