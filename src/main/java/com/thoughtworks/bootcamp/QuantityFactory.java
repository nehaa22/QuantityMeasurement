package com.thoughtworks.bootcamp;

import com.thoughtworks.bootcamp.Units.Length.Feet;
import com.thoughtworks.bootcamp.Units.Length.Inch;
import com.thoughtworks.bootcamp.Units.Length.Yard;
import com.thoughtworks.bootcamp.Units.Volume.Gallon;
import com.thoughtworks.bootcamp.Units.Volume.Litre;
import com.thoughtworks.bootcamp.Units.temperature.Celcius;
import com.thoughtworks.bootcamp.Units.temperature.Farenheit;

public class QuantityFactory {

    public static AddableQuantity createInch(double value){ return new AddableQuantity(value, new Inch()); }

    public static AddableQuantity createFeet(double value) { return new AddableQuantity(value, new Feet()); }

    public static AddableQuantity createYard(double value) { return new AddableQuantity(value, new Yard()); }

    public static AddableQuantity createLitre(double value) {return new AddableQuantity(value, new Litre()); }

    public static AddableQuantity createGallon(double value) {return new AddableQuantity(value, new Gallon()); }

    public static Quantity createCelcius(double value) { return new Quantity(value, new Celcius());}

    public static Quantity createFarenheit( double value){ return new Quantity(value, new Farenheit());
        }

    }