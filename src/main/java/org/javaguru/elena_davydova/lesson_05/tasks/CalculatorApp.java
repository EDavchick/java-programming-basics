package org.javaguru.elena_davydova.lesson_05.tasks;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Is even?");
        System.out.println(calculator.isEven(10));
        System.out.println(calculator.isEven(11));
        System.out.println(calculator.isEven(101));
        System.out.println(calculator.isEven(246));

        System.out.println("Is odd?");
        System.out.println(calculator.isOdd(29));
        System.out.println(calculator.isOdd(46));
        System.out.println(calculator.isOdd(445));
        System.out.println(calculator.isOdd(440));

        System.out.println("Average:");
        System.out.println(calculator.findAverage(34, 65));
        System.out.println(calculator.findAverage(3, 6));
        System.out.println(calculator.findAverage(123, 166));
    }
}
