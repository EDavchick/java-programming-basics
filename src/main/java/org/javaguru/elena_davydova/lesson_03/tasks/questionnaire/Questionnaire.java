package org.javaguru.elena_davydova.lesson_03.tasks.questionnaire;

public class Questionnaire {
    private String name;
    private AnswerToTheQuestionnaireQuestion answerToTheQuestionnaireQuestion1;
    private AnswerToTheQuestionnaireQuestion answerToTheQuestionnaireQuestion2;


    public Questionnaire(String name,
                         AnswerToTheQuestionnaireQuestion answerToTheQuestionnaireQuestion1,
                         AnswerToTheQuestionnaireQuestion answerToTheQuestionnaireQuestion2) {
        this.name = name;
        this.answerToTheQuestionnaireQuestion1 = answerToTheQuestionnaireQuestion1;
        this.answerToTheQuestionnaireQuestion2 = answerToTheQuestionnaireQuestion2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Questionnaire: " +
                "name: " + name +
                answerToTheQuestionnaireQuestion1 +
                "; " + answerToTheQuestionnaireQuestion2;
    }
}
