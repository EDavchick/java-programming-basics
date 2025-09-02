package org.javaguru.elena_davydova.lesson_05.tasks;

public class MaxNumber {
    int findMax(int number1, int number2) {
        return Math.max(number1, number2);
    }

    int findMax(int number1, int number2, int number3) {
        return Math.max(findMax(number1, number2),number3);
    }
}
