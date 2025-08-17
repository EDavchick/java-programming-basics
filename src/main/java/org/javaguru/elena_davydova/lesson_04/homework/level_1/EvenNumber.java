package org.javaguru.elena_davydova.lesson_04.homework.level_1;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        System.out.println("Put number:");
        Scanner scanner = new Scanner(System.in);
        int numDay = scanner.nextInt();

        printTrue(numDay);

    }
    static boolean isEven(int number){
        return number % 2 == 0;
    }

    static void printTrue(int number){
        if (isEven(number)){
            System.out.println(number + " is an even number");
        } else System.out.println(number + " is an odd number");
    }
}
