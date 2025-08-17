package org.javaguru.elena_davydova.lesson_04.homework.level_3;

import java.util.Scanner;

public class CompareThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put number 1:");
        int numberOne = scanner.nextInt();
        System.out.println("Put number 2:");
        int numberTwo = scanner.nextInt();
        System.out.println("Put number 3:");
        int numberThree = scanner.nextInt();

        maxNumber(numberOne, numberTwo, numberThree);
    }

    static int maxFirstAndSecondNumbers(int num1, int num2){
        if (num1 > num2) return num1;
        else return num2;
    }

    static void maxNumber(int num1, int num2, int num3){
        int max = maxFirstAndSecondNumbers(num1, num2);
        System.out.println("Max number is " + maxFirstAndSecondNumbers(max, num3));
    }

}
