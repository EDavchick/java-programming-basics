package org.javaguru.elena_davydova.lesson_03.tasks;

public class Apple {
    private String variety, color;
    private double weight;

    public Apple(String variety, String color, double weight) {
        this.variety = variety;
        this.color = color;
        this.weight = weight;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
