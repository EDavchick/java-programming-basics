package org.javaguru.elena_davydova.lesson_03.tasks.questionnaire;

public class QuestionnaireApplication {
    public static void main(String[] args) {
        AnswerToTheQuestionnaireQuestion answerToTheQuestionnaireQuestion1 =
                new AnswerToTheQuestionnaireQuestion("question 1?", true);
        AnswerToTheQuestionnaireQuestion answerToTheQuestionnaireQuestion2 =
                new AnswerToTheQuestionnaireQuestion("question 2?", false);

        Questionnaire questionnaire1 =
                new Questionnaire("Vasya", answerToTheQuestionnaireQuestion1,
                        answerToTheQuestionnaireQuestion2);
        Questionnaire questionnaire2 =
                new Questionnaire("Masha",answerToTheQuestionnaireQuestion1,
                        answerToTheQuestionnaireQuestion2);

        System.out.println(questionnaire1);
        System.out.println(questionnaire2);

    }
}
