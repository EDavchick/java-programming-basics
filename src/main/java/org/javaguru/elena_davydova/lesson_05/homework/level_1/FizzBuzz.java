package org.javaguru.elena_davydova.lesson_05.homework.level_1;

public class FizzBuzz {
    public static void main(String[] args) {
        division(3);
        division(5);
        division(0);
        division(100);
        division(19);
        division(99);
    }

    static boolean divisionIntoThree(int num) {
        return num % 3 == 0;
    }
    static boolean divisionIntoFive(int num) {
        return num % 5 == 0;
    }
    static void division(int num){
        if (divisionIntoThree(num) && divisionIntoFive(num)) System.out.println("FizzBuzz");
        else if (divisionIntoThree(num)) System.out.println("Fizz");
        else if (divisionIntoFive(num)) System.out.println("Buzz");
        else System.out.println("" +  num);
    }
}
