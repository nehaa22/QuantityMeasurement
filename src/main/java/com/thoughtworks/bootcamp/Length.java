package com.thoughtworks.bootcamp;

public class Length {

    private final double value;
    private final Unit unit;
    private final int FEETTOINCH = 12;


    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {

        if (this == other) {
            return true;
        }

        if (!(other instanceof Length)) {
            return false;
        }


        if(this.unit!=((Length) other).unit){
            if(((Length) other).value== FEETTOINCH *value){
                return true;
            }
            if(value==FEETTOINCH*((Length) other).value){
                return true;
            }
            return false;
        }


        Length length = (Length) other;
        return length.value== value;
    }
}
