package org.javaguru.elena_davydova.lesson_02.tasks;

import java.util.Scanner;

public class NameInConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is: " + name);
    }
}
