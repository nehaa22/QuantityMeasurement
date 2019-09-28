package com.thoughtworks.bootcamp;

public class Length {

    private final double value;
    private final Unit unit;


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

        if(this.value == 0.0&& ((Length) other).value==0.0) {
            return true;
        }

        if(this.unit!=((Length) other).unit){
            if(((Length) other).value==12*value){
                return true;
            }
            return false;
        }


        Length length = (Length) other;
        return length.value== value;
    }
}
