package org.javaguru.elena_davydova.lesson_05.homework.level_6;

public class AverageStudentGradeCalculator {
    public double averageGrade(StudentTable studentTable){
        return (studentTable.getMathGrade() + studentTable.getLiteratureGrade()
                + studentTable.getLanguageGrade() + studentTable.getSportGrade()) / 4;
    }
}
