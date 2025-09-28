package org.javaguru.elena_davydova.lesson_06.tasks;

public class FizzBuzz {
    String detect(int num){
        String result;
        if (divisionIntoThree(num) && divisionIntoFive(num)) result = "FizzBuzz";
        else if (divisionIntoThree(num)) result = "Fizz";
        else if (divisionIntoFive(num)) result = "Buzz";
        else result = "" + num;
        return result;
    }

    boolean divisionIntoThree(int num) {
        return num % 3 == 0;
    }

    boolean divisionIntoFive(int num) {
        return num % 5 == 0;
    }
}
