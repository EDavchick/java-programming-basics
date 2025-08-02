package org.javaguru.elena_davydova.lesson_02;

import java.util.Scanner;

public class TriangleSquare {
    public static void main(String[] args) {

        // запрашиваем данные у пользователя

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length first side: ");
        double sideOne =scanner.nextDouble();
        System.out.println("Enter the length second side: ");
        double sideTwo =scanner.nextDouble();
        System.out.println("Enter the length third side: ");
        double sideThree =scanner.nextDouble();

        // вычисляем полупериметр треугольника p = (a + b + c) / 2
        double p = (sideOne + sideTwo + sideThree) / 2;

        // вычисляем площадь по формуле S = √(p * (p - a) * (p - b) * (p - c))
        // Math.sqrt - корень квадратный в Java
        double triangleSquare = Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));
        System.out.println("Triangle Square is: " + triangleSquare);
    }
}
