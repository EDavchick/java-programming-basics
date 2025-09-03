package org.javaguru.elena_davydova.lesson_05.homework.level_2;

public class LeapYear {
    // високосный, если (делится на 400) OR (делится на 4 AND не делится на 100)
    String defineLeapYear(int year) {
        String result = "";
        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)){
            result = "It is a leap year";
        }
        else result = "It is not a leap year";
        return result;
    }

    // better!
    boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
    }
    /*
        boolean leap = false;
        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)){
            leap = true;
        }
        else leap = false;
        return leap;
     */

}
