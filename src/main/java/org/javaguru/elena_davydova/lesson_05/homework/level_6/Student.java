package org.javaguru.elena_davydova.lesson_05.homework.level_6;

public record Student(String name, String surname) {

    @Override
    public String toString() {
        return "Student: " + "name: " + name + ", surname: " + surname + '\'';
    }
}
