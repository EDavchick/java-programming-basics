package org.javaguru.elena_davydova.lesson_03.tasks.family;

public class FamilyApplication {
    public static void main(String[] args) {
        Mother mother1 = new Mother("Masha", "Ivanova", 45);
        Father father1 = new Father("Petya", "Ivanov", 48);
        Child child1 = new Child("Kolya", "Ivanov", 15);

        Family family1 = new Family(mother1, father1, child1);

        Mother mother2 = new Mother("Polina", "Petrova", 43);
        Father father2 = new Father("Vasya", "Petrov", 49);
        Child child2 = new Child("Misha", "Petrov", 25);

        Family family2 = new Family(mother2, father2, child2);

        System.out.println(family1);
        System.out.println(family2);
    }
}
