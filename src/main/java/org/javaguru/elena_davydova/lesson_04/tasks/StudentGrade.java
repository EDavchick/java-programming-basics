package org.javaguru.elena_davydova.lesson_04.tasks;

public class StudentGrade {
    public static void main(String[] args) {
        int mark = 45;
        showGrade(mark);
    }

    static void showGrade(int mark){
        if ((mark >= 90) && (mark <= 100)) {
            System.out.println("A");
        } else if ((mark >= 80) && (mark <= 89)) {
            System.out.println("B");
        } else if ((mark >= 70) && (mark <= 79)) {
            System.out.println("C");
        } else if ((mark >= 60) && (mark <= 69)) {
            System.out.println("D");
        } else if ((mark >= 0) && (mark <= 59)) {
            System.out.println("F");
        }
    }
}
