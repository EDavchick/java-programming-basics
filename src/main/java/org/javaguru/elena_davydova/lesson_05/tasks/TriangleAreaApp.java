package org.javaguru.elena_davydova.lesson_05.tasks;

import java.util.Scanner;

public class TriangleAreaApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length first side: ");
        double sideOne = scanner.nextDouble();
        System.out.println("Enter the length second side: ");
        double sideTwo = scanner.nextDouble();
        System.out.println("Enter the length third side: ");
        double sideThree = scanner.nextDouble();

        TriangleArea triangleArea = new TriangleArea();
        System.out.println(triangleArea.triangleSquare(sideOne, sideTwo, sideThree));

    }
}
