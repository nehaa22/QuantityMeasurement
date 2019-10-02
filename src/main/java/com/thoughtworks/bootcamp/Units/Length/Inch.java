package com.thoughtworks.bootcamp.Units.Length;

import com.thoughtworks.bootcamp.Quantity;
import com.thoughtworks.bootcamp.QuantityFactory;

public class Inch implements Length {

    public Quantity convertToBase(double value){
        double conversionFactor = 1;
        return QuantityFactory.createInch(conversionFactor *value);

    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Inch;
    }
}
