package org.javaguru.elena_davydova.lesson_02.tasks;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("Number " + number + " is even");
        }
        else System.out.println("Number " + number + " is not even");
    }
}
