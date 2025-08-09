package org.javaguru.elena_davydova.lesson_03.homework.level4;

public class Patient {
    private Person person;
    private String disease;

    public Patient(Person person, String disease) {
        this.person = person;
        this.disease = disease;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}
