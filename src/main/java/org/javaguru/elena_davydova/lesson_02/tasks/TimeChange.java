package org.javaguru.elena_davydova.lesson_02.tasks;

import java.util.Scanner;

public class TimeChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int seconds = scanner.nextInt();

        int hours = seconds / 3600;
        int remainingAfterHours = seconds % 3600;
        int min = remainingAfterHours / 60;
        int sec = remainingAfterHours % 60;

        System.out.println(hours + ":" + min + ":" + sec);
    }
}
