package org.javaguru.elena_davydova.lesson_04.tasks;

import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {

        double income1 = getNumber();
        double income2 = getNumber();
        double income3 = getNumber();

        System.out.println(getTax(income1));
        System.out.println(getTax(income2));
        System.out.println(getTax(income3));
    }
    /*
        Доход до 10 000 - налог 10%
        Доход от 10 000 до 20 000 - налог 15%
        Доход от 20 000 и выше - налог 20%
         */
    static double getTax(double income) {
//        double
        if (income < 10000) {
            return income * 0.1;
        } else if(income >= 10000 && income < 20000) {
            return income * 0.15;
        }
        return income * 0.2;
    }

    static double getNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put any number:");
        return scanner.nextDouble();
    }
}
