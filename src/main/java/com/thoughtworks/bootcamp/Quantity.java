package com.thoughtworks.bootcamp;

import com.thoughtworks.bootcamp.Units.UnitInterface;

public class Quantity {

    private final double value;
    private final UnitInterface unit;
    private String string;

    public Quantity(double value, UnitInterface unit) {
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

    public Quantity add(Quantity another) {

        Quantity baseOne = unit.convertToBase(value);
        Quantity baseTwo = another.unit.convertToBase(another.value);
        if (baseOne.unit != baseTwo.unit)
            throw new IllegalArgumentException("Unit should be  same type");

     return new Quantity(baseOne.value + baseTwo.value,baseOne.unit);

    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                ", string='" + string + '\'' +
                '}';
    }
}