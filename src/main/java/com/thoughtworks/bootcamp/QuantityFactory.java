package com.thoughtworks.bootcamp;

import com.thoughtworks.bootcamp.Units.Length.Feet;
import com.thoughtworks.bootcamp.Units.Length.Inch;
import com.thoughtworks.bootcamp.Units.Length.Yard;
import com.thoughtworks.bootcamp.Units.Volume.Gallon;
import com.thoughtworks.bootcamp.Units.Volume.Litre;

public class QuantityFactory {

    public static Quantity createInch(double value){ return new Quantity(value, new Inch()); }

    public static Quantity createFeet(double value) { return new Quantity(value, new Feet()); }

    public static Quantity createYard(double value) { return new Quantity(value, new Yard()); }

    public static Quantity createLitre(double value) {return new Quantity(value, new Litre()); }

    public static Quantity createGallon(double value) {return new Quantity(value, new Gallon()); }
}
