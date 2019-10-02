package com.thoughtworks.bootcamp;

import com.thoughtworks.bootcamp.Units.Unit;

public class Quantity {

    protected final double value;
    public final Unit unit;
    private String string;

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object object) {

        if (this == object) {
            return true;
        }

        if (!(object instanceof Quantity)) {
            return false;
        }

        Quantity other = (Quantity) object;
        Quantity baseOne = unit.convertToBase(value);
        Quantity baseTwo = other.unit.convertToBase(other.value);
        return Math.abs(baseOne.value - baseTwo.value) <= 0.01 &&  baseOne.unit.equals(baseTwo.unit);
    }

}