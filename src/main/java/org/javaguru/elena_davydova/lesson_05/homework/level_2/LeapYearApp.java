package org.javaguru.elena_davydova.lesson_05.homework.level_2;

public class LeapYearApp {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        System.out.println("1900: " + leapYear.defineLeapYear(1900));
        System.out.println("2000: " + leapYear.defineLeapYear(2000));
        System.out.println("1745: " + leapYear.defineLeapYear(1745));
        System.out.println("1977: " + leapYear.defineLeapYear(1977));
        System.out.println("2024: " + leapYear.defineLeapYear(2024));

        System.out.println();

        System.out.println("1900: " + leapYear.isLeapYear(1900));
        System.out.println("2000: " + leapYear.isLeapYear(2000));
        System.out.println("1745: " + leapYear.isLeapYear(1745));
        System.out.println("1977: " + leapYear.isLeapYear(1977));
        System.out.println("2024: " + leapYear.isLeapYear(2024));
    }
}
