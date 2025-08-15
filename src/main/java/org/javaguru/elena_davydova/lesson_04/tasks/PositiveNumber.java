package org.javaguru.elena_davydova.lesson_04.tasks;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        int anyNumber1 = getNumber();
        int anyNumber2 = getNumber();
        int anyNumber3 = getNumber();

        System.out.println("Number is positive = " + isPositive(anyNumber1));
        System.out.println("Number is positive = " + isPositive(anyNumber2));
        System.out.println("Number is positive = " + isPositive(anyNumber3));
    }

    static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put any number:");
        return scanner.nextInt();
    }

    static boolean isPositive(int number) {
        return number > 0;
    }


}
