package com.thoughtworks.bootcamp.Units.temperature;

import com.thoughtworks.bootcamp.Quantity;
import com.thoughtworks.bootcamp.QuantityFactory;

public class Celcius implements Temperature {

    public Quantity convertToBase(double value) {
        return QuantityFactory.createCelcius(value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Temperature;
    }
}



