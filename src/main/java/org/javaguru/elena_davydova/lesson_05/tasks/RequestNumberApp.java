package org.javaguru.elena_davydova.lesson_05.tasks;

public class RequestNumberApp {
    public static void main(String[] args) {
        RequestNumber requestNumber = new RequestNumber();

//        System.out.println(requestNumber.getNumberWithPrompt());
//        System.out.println(requestNumber.getNumberWithPrompt());
//
//        System.out.println(requestNumber.getNumberWithPromptFromParameter("Впишите свою цифру здесь: "));
//        System.out.println(requestNumber.getNumberWithPromptFromParameter("Впишите другую цифру вот здесь: "));
//        System.out.println(requestNumber.getNumberWithPromptFromParameter("А теперь впишите цифру 10: "));

        System.out.println(requestNumber.countDigits(3443));
    }
}
