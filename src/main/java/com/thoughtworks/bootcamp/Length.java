package com.thoughtworks.bootcamp;

public class Length {

    private final double value;
    private final Unit unit;

    enum Unit {
        feet,
        inch
    }

    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (!(o instanceof Length)) {
            return false;
        }

        if (((Length) o).unit != this.unit) {
            return false;
        }

        Length length = (Length) o;
        return Double.compare(length.value, value) == 0;
    }
}
