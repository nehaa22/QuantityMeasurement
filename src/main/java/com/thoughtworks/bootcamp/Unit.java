package com.thoughtworks.bootcamp;


public enum Unit {
    feet {
        @Override
        public double convertToBase(double value) {
            return value*12;
        }
    },
    inch {
        @Override
        public double convertToBase(double value) {
            return 1;
        }
    };

    public abstract double convertToBase(double value);
}
