package com.thoughtworks.bootcamp;

import com.thoughtworks.bootcamp.Units.Length.Feet;
import com.thoughtworks.bootcamp.Units.Length.Inch;
import com.thoughtworks.bootcamp.Units.Length.Yard;

public class QuantityFactory {

    public static Quantity createInch(double value){ return new Quantity(value, new Inch()); }

    public static Quantity createFeet(double value) { return new Quantity(value, new Feet()); }

    public static Quantity createYard(double value) { return new Quantity(value, new Yard()); }
}
