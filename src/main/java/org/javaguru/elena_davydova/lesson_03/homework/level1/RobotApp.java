package org.javaguru.elena_davydova.lesson_03.homework.level1;

public class RobotApp {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Sam");
        Robot robot2 = new Robot("Petya");

        System.out.println("Name robot1 is " + robot1.getRobotName());
        System.out.println("Name robot2 is " + robot2.getRobotName());

        robot1.setRobotName("Root");
        robot2.setRobotName("Kolya");
        System.out.println("Now name robot1 is " + robot1.getRobotName());
        System.out.println("Now name robot2 is " + robot2.getRobotName());
    }
}
