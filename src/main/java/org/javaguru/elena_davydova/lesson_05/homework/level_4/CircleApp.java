package org.javaguru.elena_davydova.lesson_05.homework.level_4;

public class CircleApp {
    public static void main(String[] args) {
        Circle circleService = new Circle();

        System.out.println("Area (r = 2.0) = " + circleService.calculateArea(2.0));
        System.out.println("Area (r = 3.0) = " + circleService.calculateArea(3.0));
        System.out.println("Area (r = 4.0) = " + circleService.calculateArea(4.0));

        System.out.println("Perimeter (r = 2.0) = " + circleService.calculatePerimeter(2.0));
        System.out.println("Perimeter (r = 3.0) = " + circleService.calculatePerimeter(3.0));
        System.out.println("Perimeter (r = 4.0) = " + circleService.calculatePerimeter(4.0));
    }
}
