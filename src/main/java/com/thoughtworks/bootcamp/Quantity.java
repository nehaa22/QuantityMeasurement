package com.thoughtworks.bootcamp;

public class Quantity {

    private final double value;
    private final Unit unit;
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

        if (!hasBaseValue(other))
            return false;

        return Math.abs(unit.convertToBase(value) - other.unit.convertToBase(other.value)) <= 0.01;

    }

    private boolean hasBaseValue(Quantity other) {
        return (this.unit.getBaseUnit(this.unit)).equals(other.unit.getBaseUnit(other.unit));
    }


    public Quantity add(Quantity another) {

        if (!checkBaseUnit(another)){
            throw new IllegalArgumentException("Unit should be od same type");
        }

        if (this.unit == Unit.inch || this.unit == Unit.feet) {
            return new Quantity(unit.convertToBase(this.value) + another.unit.convertToBase(another.value), Unit.inch);
        }
        return new Quantity(unit.convertToBase(this.value) + another.unit.convertToBase(another.value), Unit.litre);

    }

      private boolean checkBaseUnit(Quantity another) {
        return (this.unit.getBaseUnit(this.unit).equals(another.unit.getBaseUnit(another.unit)));
    }
}