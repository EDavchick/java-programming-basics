package org.javaguru.elena_davydova.lesson_04.homework.level_2;

import java.util.Scanner;

public class EqualsOrDifferent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put number 1:");
        int numberOne = scanner.nextInt();
        System.out.println("Put number 2:");
        int numberTwo = scanner.nextInt();
        equalsOrDifferentNumber(numberOne, numberTwo);
    }

    static void equalsOrDifferentNumber(int num1, int num2){
        if (num1 == num2) System.out.println("Number one and number two are equals");
        else System.out.println("Number one and number two are different");
    }
}
