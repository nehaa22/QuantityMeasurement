package com.thoughtworks.bootcamp;

public class Quantity {

    private final double value;
    private final Unit unit;

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

        if (this.unit.getBaseUnit(this.unit) != other.unit.getBaseUnit(other.unit))
            return false;

        return Math.abs(unit.convertToBase(value) - other.unit.convertToBase(other.value)) <= 0.01;

    }

    @Override
    public String toString() {
        return "Length{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }

    public Quantity add(Quantity another) {

        if(this.unit == Unit.litre &&  another.unit == Unit.feet || this.unit == Unit.feet &&  another.unit == Unit.litre) {
            throw new IllegalArgumentException("Unit should be od same type");
        }

        if (this.unit == Unit.inch || this.unit == Unit.feet) {
            return new Quantity(unit.convertToBase(this.value) + another.unit.convertToBase(another.value), Unit.inch);
        }
        return new Quantity(unit.convertToBase(this.value) + another.unit.convertToBase(another.value), Unit.litre);

    }
}