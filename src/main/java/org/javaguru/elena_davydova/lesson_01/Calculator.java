package org.javaguru.elena_davydova.lesson_01;

public class Calculator {
    public static void main(String[] args) {
        double firstNumber = 30;
        double secondNumber = 3;

        double sumResult = firstNumber + secondNumber;
        double subtractResult = firstNumber - secondNumber;
        double multiplicationResult = firstNumber * secondNumber;
        double divisionResult = firstNumber / secondNumber;

        System.out.println("sum: " + sumResult);
        System.out.println("subtract: " + subtractResult);
        System.out.println("multiplication: " + multiplicationResult);
        System.out.println("division: " + divisionResult);
    }

}
