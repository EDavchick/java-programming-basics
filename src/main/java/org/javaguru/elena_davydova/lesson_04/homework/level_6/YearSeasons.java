package org.javaguru.elena_davydova.lesson_04.homework.level_6;

import java.util.Scanner;

public class YearSeasons {
    public static void main(String[] args) {
        int month1 = getMonth();
        whatMonth(month1);

        int month2 = getMonth();
        whatMonth(month2);

        int month3 = getMonth();
        whatMonth(month3);

    }

    static int getMonth(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month from 1 to 12:");
        return scanner.nextInt();
    }

    static void whatMonth(int month) {
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("This is winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("This is spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("This is summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("This is autumn");
                break;
            default:
                System.out.println("Wrong number. Enter the month from 1 to 12");
        }
    }
}
