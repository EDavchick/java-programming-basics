package org.javaguru.elena_davydova.lesson_03.homework.level2;

public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "white", 30000);
        Car car2 = new Car("AUDI", "pink", 25000);
        Car car3 = new Car("TESLA", "grey", 40000);

        System.out.println("Car 1 is a " + car1.getBrand() + ", has a " + car1.getColor() + " color and cost " + car1.getPrice());
        System.out.println("Car 2 is a " + car2.getBrand() + ", has a " + car2.getColor() + " color and cost " + car2.getPrice());
        System.out.println("Car 3 is a " + car3.getBrand() + ", has a " + car3.getColor() + " color and cost " + car3.getPrice());

        car1.setBrand("Mercedes Benz");
        car2.setBrand("Land Rover");
        car3.setBrand("Ferrari");

        car1.setColor("green");
        car2.setColor("black");
        car3.setColor("yellow");

        car1.setPrice(55000);
        car2.setPrice(35000);
        car3.setPrice(75000);

        System.out.println("===============================");

        System.out.println("Now car 1 is a " + car1.getBrand() + ", has a " + car1.getColor() + " color and cost " + car1.getPrice());
        System.out.println("Now car 2 is a " + car2.getBrand() + ", has a " + car2.getColor() + " color and cost " + car2.getPrice());
        System.out.println("Now car 3 is a " + car3.getBrand() + ", has a " + car3.getColor() + " color and cost " + car3.getPrice());

    }
}
