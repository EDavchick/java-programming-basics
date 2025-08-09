package org.javaguru.elena_davydova.lesson_03.tasks.questionnaire;

public class AnswerToTheQuestionnaireQuestion {
    // Questionnaire
    private String question;
    private boolean answer;

    public AnswerToTheQuestionnaireQuestion(String question, boolean answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return ", question: " + question +
                ", answer: " + answer;
    }
}
