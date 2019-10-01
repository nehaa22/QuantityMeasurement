package com.thoughtworks.bootcamp.Units;

import com.thoughtworks.bootcamp.Quantity;

public interface Unit {
    Quantity convertToBase(double value);
}
