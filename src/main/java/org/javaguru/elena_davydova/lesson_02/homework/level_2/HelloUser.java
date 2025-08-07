package org.javaguru.elena_davydova.lesson_02.homework.level_2;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
