package org.javaguru.elena_davydova.lesson_06.tasks;

public class OddNumberTest {
    public static void main(String[] args) {
        OddNumberTest test = new OddNumberTest();
        test.shouldBeOdd();
        test.shouldNotBeOdd();
    }

    public void shouldBeOdd() {
        OddNumber test = new OddNumber();
        boolean isOdd = test.isOdd(9);
        if (isOdd)
            System.out.println("TEST IS OK!");
        else
            System.out.println("TEST IS NOT OK!");
    }

    public void shouldNotBeOdd() {
        OddNumber test = new OddNumber();
        boolean isOdd = test.isOdd(10);
        if (!isOdd)
            System.out.println("TEST IS OK!");
        else
            System.out.println("TEST IS NOT OK!");
    }
}
