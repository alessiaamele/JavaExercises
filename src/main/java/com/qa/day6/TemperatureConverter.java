package com.qa.day6;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println(convertFahrenheitToCelsius(100));
        System.out.println(convertCelsiusToFahrenheit(100));
    }

        public double convertFahrenheitToCelsius(double fahrenheit) {
            return (5.0 / 9.0) * (fahrenheit - 32.0);
        }

        public float convertCelsiusToFahrenheit(int celsius) {
            return (9 / 5) * (celsius) + 32;
        }

        public float convertKelvinToCelsius(int kelvin) {
            return (kelvin - 273);
        }

        public float convertCelsiusToKelvin(int celsius) {
            return (celsius + 273);
        }

        public float convertKelvinToFahrenheit(int kelvin) {
            return (9 / 5) * (kelvin - 273) + 32;
        }

        public float convertFahrenheitToKelvin(int fahrenheit) {
            return (5 / 9) * (fahrenheit - 32) + 273;
        }

    }

