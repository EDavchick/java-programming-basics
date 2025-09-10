package org.javaguru.elena_davydova.lesson_05.homework.level_6;

public class StudentTableApp {
    public static void main(String[] args) {
        AverageStudentGradeCalculator calculator = new AverageStudentGradeCalculator();

        StudentTable st1 = new StudentTable(
                new Student("Ivan", "Petrov"),
                5.9, 7.5, 9, 7.8);
        StudentTable st2 = new StudentTable(
                new Student("Olga", "Ivanova"),
                9.9, 8.5, 7.8, 9.8);
        StudentTable st3 = new StudentTable(
                new Student("Masha", "Sidorova"),
                7.9, 6.5, 5.4, 8.1);

        System.out.println("Average grade for Ivan Petrov is " + calculator.averageGrade(st1));
        System.out.println("Average grade for Olga Ivanova is " + calculator.averageGrade(st2));
        System.out.println("Average grade for Masha Sidorova is " + calculator.averageGrade(st3));
    }
}
