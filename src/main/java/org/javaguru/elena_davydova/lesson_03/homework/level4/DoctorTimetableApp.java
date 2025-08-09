package org.javaguru.elena_davydova.lesson_03.homework.level4;

import java.util.Date;

public class DoctorTimetableApp {
    public static void main(String[] args) {
        Person person1 = new Person("Ilya", "Legostaev");
        Person person2 = new Person("Ivan", "Sidorov");
        Person person3 = new Person("Masha", "Legostaeva");
        Person person4 = new Person("Kolya", "Petrov");
        Person person5 = new Person("Olya", "Ivanova");
        Person person6 = new Person("Ivan", "Terkin");

        Doctor doctor1 = new Doctor(person1, "ears doctor");
        Doctor doctor2 = new Doctor(person2, "eyes doctor");

        Patient patient1 = new Patient(person3, "ears problem");
        Patient patient2 = new Patient(person4, "eyes problem");
        Patient patient3 = new Patient(person5, "throat problem");
        Patient patient4 = new Patient(person6, "eyes problem");

        Appointment appointment1 = new Appointment(patient1, 350);
        Appointment appointment2 = new Appointment(patient2, 450);
        Appointment appointment3 = new Appointment(patient3, 300);
        Appointment appointment4 = new Appointment(patient4, 550);

        Timetable timetable1 = new Timetable(
                doctor1,
                "12-03-2025",
                appointment1, appointment3);

        Timetable timetable2 = new Timetable(
                doctor2,
                "12-03-2025",
                appointment2, appointment4);



        System.out.println("Patient first name = " + appointment1.getPerson().getPerson().getName());
        System.out.println("Patient last name = " + appointment1.getPerson().getPerson().getSurname());
        System.out.println("Diagnosis = " + appointment1.getPerson().getDisease());
        System.out.println("Visit price = " + appointment1.getPrice());
        System.out.println("=======================");
        System.out.println("Doctor 2 first name = " + timetable2.getDoctor().getPerson().getName());
        System.out.println("Doctor 2 last name = " + timetable2.getDoctor().getPerson().getSurname());
        System.out.println("Doctor 2 speciality = " + timetable2.getDoctor().getSpeciality());
        System.out.println("Appointment date = " + timetable2.getTime1());
        System.out.println("=======================");
        System.out.println("Appointment 2 diagnose = " + timetable2.getTime2().getPerson().getDisease());
    }
}
