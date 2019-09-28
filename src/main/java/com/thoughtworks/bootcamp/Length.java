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
    public boolean equals(Object object) {

        if (this == object) {
            return true;
        }

        if (!(object instanceof Length)) {
            return false;
        }

        //return valuee==other.unit.convert(this)
        Length other = (Length) object;

        //return value ==other.unit.convert()



        if(this.unit!=other.unit){
            if(other.value== FEETTOINCH *value){
                return true;
            }
            return value==FEETTOINCH*other.value;
        }

        return other.value== value;
    }
}
