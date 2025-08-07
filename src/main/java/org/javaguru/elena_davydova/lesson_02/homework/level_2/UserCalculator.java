package org.javaguru.elena_davydova.lesson_02.homework.level_2;

import java.util.Scanner;

public class UserCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double numOne =scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double numTwo =scanner.nextDouble();

        double sum = numOne * numTwo;
        System.out.println("Sum: " + sum);
    }
}
