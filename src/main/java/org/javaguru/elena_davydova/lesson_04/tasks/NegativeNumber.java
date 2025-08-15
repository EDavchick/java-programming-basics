package org.javaguru.elena_davydova.lesson_04.tasks;

import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Put any number:");
        int anyNumber = scanner.nextInt();
        System.out.println("Number is negative = " + isNegative(anyNumber));

    }
    static boolean isNegative(int number){
        return number < 0;
    }
}
