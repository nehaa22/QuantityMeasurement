package com.thoughtworks.bootcamp.Units.temperature;
import com.thoughtworks.bootcamp.Quantity;
import com.thoughtworks.bootcamp.QuantityFactory;


public class Farenheit implements Temperature {

    @Override
    public boolean equals(Object that) {
        return that instanceof Temperature;
    }

    @Override
    public Quantity convertToBase(double value) {
        return QuantityFactory.createCelcius((value-32)*5/9);
    }
}