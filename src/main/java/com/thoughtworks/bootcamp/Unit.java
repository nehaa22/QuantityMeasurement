//package com.thoughtworks.bootcamp;
//
//public enum Unit {
//
//    feet(12),
//    inch(1),
//    yard(3*12),
//    gallon(3.78),
//    litre(1);
//
//    private final double conversionFactor;
//
//    Unit(double conversionFactor) {
//        this.conversionFactor = conversionFactor;
//    }
//
//    public double convertToBase(double value) {
//        return value * conversionFactor;
//    }
//
//    public Unit getBaseUnit() {
//        if(this == inch || this == feet || this == yard)
//            return inch;
//        else
//            return litre;
//    }
//}
