package org.javaguru.elena_davydova.lesson_03.homework.level4;

public class Timetable {
    private Doctor doctor;
    String data;
    Appointment time1;
    Appointment time2;

    public Timetable(Doctor doctor, String data, Appointment time1, Appointment time2) {
        this.doctor = doctor;
        this.data = data;
        this.time1 = time1;
        this.time2 = time2;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Appointment getTime1() {
        return time1;
    }

    public void setTime1(Appointment time1) {
        this.time1 = time1;
    }

    public Appointment getTime2() {
        return time2;
    }

    public void setTime2(Appointment time2) {
        this.time2 = time2;
    }
}
