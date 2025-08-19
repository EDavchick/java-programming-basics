package org.javaguru.elena_davydova.lesson_04.homework.level_4;

public class StockApplication {
    public static void main(String[] args) {
        Stock google = new Stock("GOOG", 10);

        google.printStockInfo();

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        google.printStockInfo();
    }
}
