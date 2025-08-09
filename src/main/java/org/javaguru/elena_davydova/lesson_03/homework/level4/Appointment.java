package org.javaguru.elena_davydova.lesson_03.homework.level4;

public class Appointment {
    private Patient patient;
    private double price;

    public Appointment(Patient patient, double price) {
        this.patient = patient;
        this.price = price;
    }

    public Patient getPerson() {
        return patient;
    }

    public void setPerson(Patient patient) {
        this.patient = patient;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
