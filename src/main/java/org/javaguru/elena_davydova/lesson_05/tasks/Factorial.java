package org.javaguru.elena_davydova.lesson_05.tasks;

public class Factorial {
    int factorial(int num) {
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return 0;
        }
        if (num <= 1) return 1;
        else return num * (factorial(num - 1));
    }
}
