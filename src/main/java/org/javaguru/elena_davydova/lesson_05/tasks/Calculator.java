package org.javaguru.elena_davydova.lesson_05.tasks;

public class Calculator {

    boolean isEven(int number) {
        return number % 2 == 0;
    }

    boolean isOdd(int number) {
        return number % 2 != 0;
    }

    int findAverage(int number1, int number2) {
        return (number1 + number2) / 2;
    }

}
