package org.javaguru.elena_davydova.lesson_05.homework.level_6;

public class StudentTable {
    private final Student student;
    private final double mathGrade;
    private final double literatureGrade;
    private final double sportGrade;
    private final double languageGrade;

    public StudentTable(Student student, double mathGrade, double literatureGrade, double sportGrade, double languageGrade) {
        this.student = student;
        this.mathGrade = mathGrade;
        this.literatureGrade = literatureGrade;
        this.sportGrade = sportGrade;
        this.languageGrade = languageGrade;
    }

    public Student getStudent() {
        return student;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public double getLiteratureGrade() {
        return literatureGrade;
    }

    public double getSportGrade() {
        return sportGrade;
    }

    public double getLanguageGrade() {
        return languageGrade;
    }

}
