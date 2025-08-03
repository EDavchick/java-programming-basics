package org.javaguru.elena_davydova.lesson_02.level_3;

import java.util.Scanner;

public class AverageSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number one:");
        int numberOne = scanner.nextInt();
        System.out.println("Input a number two:");
        int numberTwo = scanner.nextInt();
        System.out.println("Input a number three:");
        int numberThree = scanner.nextInt();

        double average = (numberOne + numberTwo + numberThree) / (double) 3;
        System.out.println("Average sum is = " + average);
    }

}
