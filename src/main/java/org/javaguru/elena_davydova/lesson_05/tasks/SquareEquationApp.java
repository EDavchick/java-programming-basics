package org.javaguru.elena_davydova.lesson_05.tasks;

public class SquareEquationApp {
    public static void main(String[] args) {

        SquareEquation squareEquation = new SquareEquation();

        System.out.println("square equation for 3, 6, 9: ");
        squareEquation.findSquareEquation(3, 6, 9);

        System.out.println("square equation for -3, 0, 3: ");
        squareEquation.findSquareEquation(-3, 0, 3);

        System.out.println("square equation for 1, 12, 4: ");
        squareEquation.findSquareEquation(1, 12, 4);

    }
}
