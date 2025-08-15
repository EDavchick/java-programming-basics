package org.javaguru.elena_davydova.lesson_04.tasks;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        int number1 = getNumber();
        int number2 = getNumber();

        maxNumber(number1, number2);
    }

    static void maxNumber(int number1, int number2) {
        if (number1 == number2) {
            System.out.println("Numbers are equals!");
        }
        else if (number1 > number2) {
            System.out.println("Biggest number is " + number1);
        } else {
            System.out.println("Biggest number is " + number2);
        }
    }

    static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put any number:");
        return scanner.nextInt();
    }
}
