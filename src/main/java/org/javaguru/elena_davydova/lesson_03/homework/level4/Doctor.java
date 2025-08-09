package org.javaguru.elena_davydova.lesson_03.homework.level4;

public class Doctor {
    private Person person;
    private String speciality;

    public Doctor(Person person, String speciality) {
        this.person = person;
        this.speciality = speciality;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
