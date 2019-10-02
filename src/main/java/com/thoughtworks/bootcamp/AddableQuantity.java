package com.thoughtworks.bootcamp;

import com.thoughtworks.bootcamp.Units.Unit;

public class AddableQuantity  extends Quantity{

    public AddableQuantity(double value, Unit unit) {
        super(value, unit);
    }


    public Quantity add(Quantity another) {

        Quantity baseOne = unit.convertToBase(value);
        Quantity baseTwo = another.unit.convertToBase(another.value);
        if (!(baseOne.unit.equals(baseTwo.unit)))
            throw new IllegalArgumentException("Unit should be  same type");

     return new Quantity(baseOne.value + baseTwo.value,baseOne.unit);

    }
}
