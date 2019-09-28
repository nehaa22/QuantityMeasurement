package com.thoughtworks.bootcamp;


public enum Unit {

    feet(12) ,
    inch(1),
    cm(1/2.54);

    private final double conversionFactor;

    Unit(double conversionFactor){
        this.conversionFactor=conversionFactor;
    }

    public  double convertToBase(double value){
       return value*conversionFactor;
    };
}
