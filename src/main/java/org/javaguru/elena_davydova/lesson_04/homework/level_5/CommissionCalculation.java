package org.javaguru.elena_davydova.lesson_04.homework.level_5;

import java.util.Scanner;

public class CommissionCalculation {
    public static void main(String[] args) {
        double sum = getSum();
        setCommission(sum);
    }

    static void setCommission(double sum) {
        if (sum < 1000) System.out.println("Your commission 3% and it fee is " + sum * 0.03);
        else if (sum >= 1000 && sum < 5000) System.out.println("Your commission 4% and it fee is " + sum * 0.04);
        else System.out.println("Your commission 5% and it fee is " + sum * 0.05);
    }

    static double getSum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sum:");
        return scanner.nextDouble();
    }
}
