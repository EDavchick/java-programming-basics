package org.javaguru.elena_davydova.lesson_05.tasks;

public class SquareEquation {
    /*
    - метод нахождения дискриминанта;
    D = (b * b) - (4 * a * c)
    b * b - 4 * a * c;
    */
    private double discriminant(int a, int b, int c) {
        return (double) b * b - 4 * a * c;
    }

    /*
    - метод нахождения только одного корня.
    Если D = 0, то есть один действительный корень, который находится по формуле x = -b / 2a.
     */
    private double findOnlyOneEquation(int a, int b, int c) {
        return (double) (-1 * b) / (2 * a);
    }
    /*
    - метод нахождения первого корня;
    Если D > 0, то уравнение имеет два действительных корня, которые вычисляются по формуле: x₁,₂ = (-b ± √D) / 2a.
    */
    private double findFirstEquation(int a, int b, int c) {
        return (-1 * b) + Math.sqrt(discriminant(a, b, c)) / (2 * a);
    }

    /*
    - метод нахождения второго корня.
    Если D > 0, то уравнение имеет два действительных корня, которые вычисляются по формуле: x₁,₂ = (-b ± √D) / 2a.
     */
    private double findSecondEquation(int a, int b, int c) {
        return (-1 * b) - Math.sqrt(discriminant(a, b, c)) / (2 * a);
    }
    
    /*
    - метод отвечающий на вопрос есть ли корни у квадратного уравнения или нет;
    Если D < 0, то уравнение не имеет действительных корней.
    Если D = 0, то есть один действительный корень, вызываем метод findOnlyOneEquation
    Если D > 0, то уравнение имеет два действительных корня, вызываем методы findFirstEquation и findSecondEquation
     */
    void findSquareEquation(int a, int b, int c){
        if (discriminant(a, b, c) < 0) System.out.println("There is no square equation");
        else if (discriminant(a, b, c) == 0) System.out.println(findOnlyOneEquation(a, b, c));
        else {
            System.out.println(findFirstEquation(a, b, c));
            System.out.println(findSecondEquation(a, b, c));
        }
    }
}
