package org.javaguru.elena_davydova.lesson_03.tasks.family;

public class Family {
    private Mother mother;
    private Father father;
    private Child child;

    public Family(Mother mother, Father father, Child child) {
        this.mother = mother;
        this.father = father;
        this.child = child;
    }

    @Override
    public String toString() {
        return "Family: " + "\n" +
                "Mother: " + mother +
                ". Father: " + father +
                ". Child: " + child;
    }
}
