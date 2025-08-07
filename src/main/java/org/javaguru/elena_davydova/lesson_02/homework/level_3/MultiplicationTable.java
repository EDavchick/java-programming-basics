package org.javaguru.elena_davydova.lesson_02.homework.level_3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number:");
        int number = scanner.nextInt();
        int i = 1;

        while (i < 11) {
            System.out.println(number + " * " + i + " = " + (number * i));
            i++;
        }
    }
}
