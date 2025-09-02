package org.javaguru.elena_davydova.lesson_05.tasks;

public class TriangleArea {

    double semiperimeter(double sideOne, double sideTwo, double sideThree) {
        return (sideOne + sideTwo + sideThree) / 2;
    }

    double triangleSquare(double sideOne, double sideTwo, double sideThree) {
        double p = semiperimeter(sideOne, sideTwo, sideThree);
        return Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));
    }
}
