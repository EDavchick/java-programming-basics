package org.javaguru.elena_davydova.lesson_05.homework.level_7;

public class TemperatureConvectorApp {
    public static void main(String[] args) {
        TemperatureConvector tc = new TemperatureConvector();
        System.out.println(tc.toCelsiusConvertor(56));
        System.out.println(tc.toCelsiusConvertor(73));
        System.out.println(tc.toCelsiusConvertor(123));

        System.out.println(tc.toFahrenheitConvertor(16));
        System.out.println(tc.toFahrenheitConvertor(30));
        System.out.println(tc.toFahrenheitConvertor(25));
    }
}
