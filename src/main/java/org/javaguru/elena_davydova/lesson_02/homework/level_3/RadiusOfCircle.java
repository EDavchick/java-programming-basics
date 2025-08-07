package org.javaguru.elena_davydova.lesson_02.homework.level_3;

import java.util.Scanner;

public class RadiusOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a radius of the circle:");
        double radius = scanner.nextDouble();

        double PI = 3.14159;
        double perimeter = 2 * PI * radius;
        double area = PI * (radius * radius);

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

        /*
        double circleArea = Math.PI + radius * radius;
        System.out.println("Circle area = " + circleArea);

        double circlePerimeter = 2 * Math.PI * radius;
        System.out.println("Circle perimeter = " + circlePerimeter);
         */
    }
}
