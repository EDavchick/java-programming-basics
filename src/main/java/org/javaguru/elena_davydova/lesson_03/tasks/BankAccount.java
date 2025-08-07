package org.javaguru.elena_davydova.lesson_03.tasks;

public class BankAccount {
    private String owner;
    private int moneyAmount;

    public BankAccount() {
    }

    public BankAccount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }
    public BankAccount(String owner) {
        this.owner = owner;
        this.moneyAmount = 0;
    }

    public BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.moneyAmount = moneyAmount;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int money) {
        this.moneyAmount = money;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                " owner = " + owner +
                ", money = " + moneyAmount +
                '}';
    }
}
