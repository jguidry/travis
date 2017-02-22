package edu.ucsd.cs110.temperature;

/**
 * Created by jguidry on 2/15/17.
 */
    public abstract class Temperature {
        float value = 0;

        public Temperature(float v) {
            value = v;
        }

        public final float getValue() {
            return value;
        }

        public abstract Temperature toCelsius();

        public abstract Temperature toFahrenheit();

    public static class Celsius extends Temperature
    {
        public Celsius(float t)
        {
            super(t);
        }

        @Override
        public Temperature toCelsius() {
            return this;
        }

        @Override
        public Temperature toFahrenheit() {
            float value = ((this.getValue()*9)/5) + 32;
            return new Fahrenheit(value);
        }

        public String toString()
        {
            // TODO: Complete this method
            return this.getValue() + " C";
        }
    }

    public static class Fahrenheit extends Temperature
    {
        public Fahrenheit(float t)
        {
            super(t);
        }

        @Override
        public Temperature toCelsius() {
            float value = ((this.getValue()-32)*5)/9;
            return new Celsius(value);
        }

        @Override
        public Temperature toFahrenheit() {
            return this;
        }

        public String toString()
        {
            // TODO: Complete this method
            return this.getValue() + " F";
        }
    }
    }


