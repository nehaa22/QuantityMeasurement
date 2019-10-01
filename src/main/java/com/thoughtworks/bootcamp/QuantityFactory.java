package com.thoughtworks.bootcamp;

import com.thoughtworks.bootcamp.Units.Length.Feet;
import com.thoughtworks.bootcamp.Units.Length.Inch;

public class QuantityFactory {

    public static Quantity createInch(double value){ return new Quantity(value, new Inch()); }

    public static Quantity createFeet(double value) { return new Quantity(value, new Feet()); }
}
