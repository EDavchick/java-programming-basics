package org.javaguru.elena_davydova.lesson_05.tasks;

public class MaxNumberApp {
    public static void main(String[] args) {

        MaxNumber maxNumber = new MaxNumber();

        System.out.println(maxNumber.findMax(35, 78));
        System.out.println(maxNumber.findMax(9685, 506));

        System.out.println(maxNumber.findMax(123, 124, 125));
        System.out.println(maxNumber.findMax(12, 867, 54));
    }
}
