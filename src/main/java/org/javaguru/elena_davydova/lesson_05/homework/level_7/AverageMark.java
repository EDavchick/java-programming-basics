package org.javaguru.elena_davydova.lesson_05.homework.level_7;

import java.util.Arrays;
import java.util.Scanner;

public class AverageMark {
    Scanner scanner = new Scanner(System.in);

    public int numberOfStudents() {
        System.out.print("Enter the number of students: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String[] listOfStudents(int studentCount) {
        String[] students = new String[numberOfStudents()];
        for (int i = 0; i < studentCount; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            students[i] = studentName;
        }
        System.out.println("List of students: " + Arrays.toString(students));
        return students;
    }

    public double[] gradeOfStudents(String[] students) {
        double[] grades = new double[students.length];

        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter the grade of student " + students[i] + ": ");
            double grade = Double.parseDouble(scanner.nextLine());
            grades[i] = grade;
        }

        System.out.println("All grades of students: " + Arrays.toString(grades));
        return grades;
    }

    public double sumGrade(double[] grades) {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        System.out.println("Sum of grades: " + sum);
        return sum;
    }

    public double averageScore(double sum, String[] students) {
        double average = sum / students.length;
        System.out.println("Average score: " + average);
        return average;
    }

    public void gradeAboveAverage(String[] students, double[] grades) {
        double sum = sumGrade(grades);
        double average = averageScore(sum, students);

        System.out.println("Students with above average score:");
        for (int i = 0; i < students.length; i++) {
            if (grades[i] > average) {
                System.out.println(students[i] + ": " + grades[i]);
            }
        }
    }

}
