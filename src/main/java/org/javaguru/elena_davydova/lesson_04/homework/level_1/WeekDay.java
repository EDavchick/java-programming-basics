package org.javaguru.elena_davydova.lesson_04.homework.level_1;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        System.out.println("Put a day number from 1 to 7:");
        Scanner scanner = new Scanner(System.in);
        int numDay = scanner.nextInt();

        switch (numDay){
            case 1: System.out.println("It's a Monday");
            break;
            case 2: System.out.println("It's a Tuesday");
            break;
            case 3: System.out.println("It's a Wednesday");
            break;
            case 4: System.out.println("It's a Thursday");
            break;
            case 5: System.out.println("It's a Friday");
            break;
            case 6: System.out.println("It's a Saturday");
            break;
            case 7: System.out.println("It's a Sunday");
            break;
            default: System.out.println("Unknown day!!! Please enter number from 1 to 7!");
        }
//        if (numDay == 1) System.out.println("It's a Monday");
//        else if (numDay == 2) System.out.println("It's a Tuesday");
//        else if (numDay == 3) System.out.println("It's a Wednesday");
//        else if (numDay == 4) System.out.println("It's a Thursday");
//        else if (numDay == 5) System.out.println("It's a Friday");
//        else if (numDay == 6) System.out.println("It's a Saturday");
//        else if (numDay == 7) System.out.println("It's a Sunday");
//        else System.out.println("Unknown day!!! Please enter number from 1 to 7!");
    }
}
