package org.javaguru.elena_davydova.lesson_05.homework.level_7;

import java.util.Arrays;
import java.util.Scanner;

public class AverageMarkApp {
    public static void main(String[] args) {
        AverageMark am = new AverageMark();
        int studentCount = am.numberOfStudents();
        String[] students = am.listOfStudents(studentCount);
        double[] grades = am.gradeOfStudents(students);
        am.gradeAboveAverage(students, grades);

        System.out.println("The program is over.");


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number of students: ");
//        int studentCount = Integer.parseInt(scanner.nextLine());
//        String[] students = new String[studentCount];
//        for (int i = 0; i < studentCount; i++) {
//            System.out.print("Enter the name of student " + (i + 1) + ": ");
//            String studentName = scanner.nextLine();
//            students[i] = studentName;
//        }
//
//        double[] grades = new double[studentCount];
//
//        for (int i = 0; i < studentCount; i++) {
//            System.out.print("Enter the grade of student " + students[i] + ": ");
//            double grade = Double.parseDouble(scanner.nextLine());
//            grades[i] = grade;
//        }
//        double sum = 0.0;
//        for (double grade : grades) {
//            sum += grade;
//        }
//        double average = sum / studentCount;
//        System.out.println("Average score: " + average);
//        System.out.println("Students with above average score:");
//        for (int i = 0; i < studentCount; i++) {
//            if (grades[i] > average) {
//                System.out.println(students[i] + ": " + grades[i]);
//            }
//        }
//        System.out.println("The program is over.");
    }
}
