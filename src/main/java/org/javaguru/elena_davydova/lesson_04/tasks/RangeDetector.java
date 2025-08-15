package org.javaguru.elena_davydova.lesson_04.tasks;

import java.util.Scanner;

public class RangeDetector {
    public static void main(String[] args) {
        int number = getNumber();
        rangeDetector(number);
    }

    static void rangeDetector(int number){
        if ((number >= 1) && (number <= 10)) {
            System.out.println("Number is inside range (1-10)!");
        } else {
            System.out.println("Number is NOT inside range (1-10)!");
        }
    }
    static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put any number:");
        return scanner.nextInt();
    }
}
