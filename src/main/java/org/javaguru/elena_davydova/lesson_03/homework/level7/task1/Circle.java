package org.javaguru.elena_davydova.lesson_03.homework.level7.task1;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea(){
        return Math.PI * (radius * radius);
    }

}
