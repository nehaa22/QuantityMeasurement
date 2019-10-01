package com.thoughtworks.bootcamp.Units.Length;

import com.thoughtworks.bootcamp.Quantity;
import com.thoughtworks.bootcamp.QuantityFactory;
import com.thoughtworks.bootcamp.Units.UnitInterface;

import java.util.Objects;

public class Feet implements Length, UnitInterface {

    public Quantity convertToBase(double value) {
        double conversionFactor = 12;
        return QuantityFactory.createFeet(conversionFactor * value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Feet;
    }

}
