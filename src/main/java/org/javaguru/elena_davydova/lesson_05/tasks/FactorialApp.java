package org.javaguru.elena_davydova.lesson_05.tasks;

public class FactorialApp {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(4));
        System.out.println(factorial.factorial(5));
        System.out.println(factorial.factorial(6));
        System.out.println(factorial.factorial(0));
    }
}
