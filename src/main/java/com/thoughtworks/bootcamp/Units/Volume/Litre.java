package com.thoughtworks.bootcamp.Units.Volume;

import com.thoughtworks.bootcamp.Quantity;
import com.thoughtworks.bootcamp.QuantityFactory;
import com.thoughtworks.bootcamp.Units.Unit;

public class Litre  implements Volume {


    public Quantity convertToBase(double value) {
        double conversionFactor = 1;
        return QuantityFactory.createLitre(conversionFactor * value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Litre;
    }
}
