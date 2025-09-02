package org.javaguru.elena_davydova.lesson_05.tasks;

import java.util.Scanner;

public class RequestNumber {

    // - с дефолтной текстовой подсказкой "Please, enter the number: ";
    int getNumberWithPrompt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the number: ");
        return scanner.nextInt();
    }

    // - с текстовой подсказкой, которую можно менять (передавая ее через параметр метода).
    int getNumberWithPromptFromParameter(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public int countDigits(int number) {
        if (number < 0) {
            number = -number;  // Учитываем отрицательные числа
        }
        if (number < 10) {
            return 1;
        }
        return 1 + countDigits(number / 10);
    }
}
