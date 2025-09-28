package org.javaguru.elena_davydova.lesson_06.tasks;

public class EvenNumberTest {

    public static void main(String[] args) {
        EvenNumberTest test = new EvenNumberTest();
        test.shouldBeEven();
        test.shouldNotBeEven();
    }

    public void shouldBeEven() {
        EvenNumber evenNumber = new EvenNumber();
        boolean isEven = evenNumber.isEven(10);
        if (isEven) {
            System.out.println("TEST IS OK!");
        } else {
            System.out.println("TEST IS FAIL!");
        }
    }

    public void shouldNotBeEven() {
        EvenNumber evenNumber = new EvenNumber();
        boolean notEven = evenNumber.isEven(11);
        if (notEven) {
            System.out.println("TEST IS OK!");
        } else {
            System.out.println("TEST IS FAIL!");
        }
    }
}
