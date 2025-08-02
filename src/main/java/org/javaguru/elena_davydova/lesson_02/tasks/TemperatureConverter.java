package org.javaguru.elena_davydova.lesson_02.tasks;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in celsius:");
        double celsius = scanner.nextInt();

        double fahrenheit = celsius * 1.8 + 32;
        double kelvin = celsius + 273.15;
        System.out.println("Temperature in Fahrenheit is: " + fahrenheit +
                " and in Kelvin is: " + kelvin);
    }
}
