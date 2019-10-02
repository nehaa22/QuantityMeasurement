package com.thoughtworks.bootcamp.Units.Length;

import com.thoughtworks.bootcamp.Quantity;
import com.thoughtworks.bootcamp.QuantityFactory;

public class Feet implements Length {

    public Quantity convertToBase(double value) {
        double conversionFactor = 12;
        return QuantityFactory.createInch(conversionFactor * value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Feet;
    }

}
