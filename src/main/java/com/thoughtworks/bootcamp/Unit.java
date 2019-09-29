package com.thoughtworks.bootcamp;


public enum Unit {

    feet(12),
    inch(1),
//    cm(1 / 2.54);
    yard(3*12),
    gallon(3.78),
    litre(1);


    private final double conversionFactor;

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double convertToBase(double value) {
        return value * conversionFactor;
    }

    ;
}
