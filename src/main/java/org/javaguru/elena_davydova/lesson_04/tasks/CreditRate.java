package org.javaguru.elena_davydova.lesson_04.tasks;

import java.util.Scanner;

public class CreditRate {
    public static void main(String[] args) {
        int rate1 = getRate();
        creditRate(rate1);

        int rate2 = getRate();
        creditRate(rate2);

        int rate3 = getRate();
        creditRate(rate3);

        int rate4 = getRate();
        creditRate(rate4);
    }

    static void creditRate(int rate){
        if (rate >= 700) {
            System.out.println("Your rate is 5%");
        } else if(rate >= 650) {
            System.out.println("Your rate is 7%");
        } else {
            System.out.println("Your rate is 10%");
        }

    }

    static int getRate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put a rate:");
        return scanner.nextInt();
    }
}
