package org.javaguru.elena_davydova.lesson_03.tasks;

import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount bankAccount0 = new BankAccount();
        bankAccount0.setOwner("Sami sozdali");
        bankAccount0.setMoneyAmount(30000);
        System.out.println("BA 0: " + bankAccount0);

        BankAccount bankAccount1 = new BankAccount("Ivan Petrov");
        BankAccount bankAccount2 = new BankAccount("Masha Ivanova");
        BankAccount bankAccount3 = new BankAccount("Katya Petrova");

        BankAccount bankAccount6 = new BankAccount(3500);
        BankAccount bankAccount7 = new BankAccount(5000);

        BankAccount bankAccount4 = new BankAccount("Lena Godunova", 5400);
        BankAccount bankAccount5 = new BankAccount("Borya Andreev", 3500);

        System.out.println("BA 1 Owner: " + bankAccount1.getOwner());
        System.out.println("BA 6 Money: " + bankAccount6.getMoneyAmount());
        System.out.println("BA 3 Owner: " + bankAccount3.getOwner());
        System.out.println("BA 3 Money: " + bankAccount3.getMoneyAmount());
        System.out.println("BA 4: " + bankAccount4);


        // =============================================
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter owner: ");
        String owner = scanner.nextLine();

        System.out.println("Enter money: ");
        int money = Integer.parseInt(scanner.nextLine());

        BankAccount bankAccount8 = new BankAccount(owner, money);
        System.out.println("BA 8: " + bankAccount8);
    }
}
