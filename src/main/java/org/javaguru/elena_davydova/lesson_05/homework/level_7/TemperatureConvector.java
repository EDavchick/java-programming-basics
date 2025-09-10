package org.javaguru.elena_davydova.lesson_05.homework.level_7;

public class TemperatureConvector {

    double toCelsiusConvertor(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    double toFahrenheitConvertor(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
