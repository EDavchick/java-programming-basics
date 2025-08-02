package org.javaguru.elena_davydova.lesson_02.tasks;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight:");
        double weight = scanner.nextDouble();
        System.out.println("Enter your height:");
        double height = scanner.nextDouble();

        double bmi = weight / Math.pow(height, height);
        System.out.println("Your Body Mass Index is: " + bmi);
    }
}
