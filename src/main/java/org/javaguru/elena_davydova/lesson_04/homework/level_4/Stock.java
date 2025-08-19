package org.javaguru.elena_davydova.lesson_04.homework.level_4;

public class Stock {
    private String companyName;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    /**
     * Имя компании и начальную стоимость необходимо задавать в момент создания акции.
     * Надо правильно задать начальные значения для minPrice и maxPrice.
     * Они должны совпадать с текущим прайсом и инициализироваться соответсвенно.
     * @param companyName наименование компании
     * @param currentPrice текущий прайс
     */
    public Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    /**
     * В updatePrice сначала сравниваю новый прайс с текущими минимумом и максимумом,
     * а потом обновляю currentPrice.
     * @param newPrice передается новая цена прайса
     */
    void updatePrice(int newPrice) {
        if (this.minPrice > newPrice) setMinPrice(newPrice);
        if (this.maxPrice < newPrice) setMaxPrice(newPrice);
        this.currentPrice = newPrice;
    }

    /**
     * Печать информации по компании и прайсу
     */
    void  printStockInfo(){
        System.out.println("Company = " + companyName +
                "\nCurrent Price = " + currentPrice +
                "\nMin Price = " + minPrice +
                "\nMax Price = " + maxPrice);
    }
}
