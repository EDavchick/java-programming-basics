package org.javaguru.elena_davydova.lesson_04.tasks;

import java.util.Scanner;

public class NegativeOrPositiveNumber {
    public static void main(String[] args) {

        int anyNumber1 = getNumber();
        int anyNumber2 = getNumber();
        int anyNumber3 = getNumber();

        isNegativeOrZeroOrPositive(anyNumber1);
        isNegativeOrZeroOrPositive(anyNumber2);
        isNegativeOrZeroOrPositive(anyNumber3);
    }

    static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put any number:");
        return scanner.nextInt();
    }

    static void isNegativeOrZeroOrPositive(int number){
        if (isNegative(number)){
            System.out.println("Number is negative = " + true);
        } else if (isZero(number)) {
            System.out.println("Number is zero = " + true);
        } else if (isPositive(number)){
            System.out.println("Number is positive = " + true);
        }
    }

    static boolean isNegative(int number) {
        return number < 0;
    }

    static boolean isZero(int number) {
        return number == 0;
    }

    static boolean isPositive(int number) {
        return number > 0;
    }
}
