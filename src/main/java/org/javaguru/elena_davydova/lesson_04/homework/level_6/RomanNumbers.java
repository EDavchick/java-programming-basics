package org.javaguru.elena_davydova.lesson_04.homework.level_6;

import java.util.Scanner;

public class RomanNumbers {
    public static void main(String[] args) {
        int number1 = getNumber();
        romanNumber(number1);
        int number2 = getNumber();
        romanNumber(number2);
        int number3 = getNumber();
        romanNumber(number3);
    }

    static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 10:");
        return scanner.nextInt();
    }

    // I (1), II (2), III (3), IV (4), V (5), VI (6), VII (7), VIII (8), IX (9), X (10)
    static void romanNumber(int number) {
        switch (number){
            case 1: System.out.println("I");
            break;
            case 2: System.out.println("II");
            break;
            case 3: System.out.println("III");
            break;
            case 4: System.out.println("IV");
            break;
            case 5: System.out.println("V");
            break;
            case 6: System.out.println("VI");
            break;
            case 7: System.out.println("VII");
            break;
            case 8: System.out.println("VIII");
            break;
            case 9: System.out.println("IX");
            break;
            case 10: System.out.println("X");
            break;
            default: System.out.println("Wrong number. Enter the number from 1 to 10.");
        }
    }
}
