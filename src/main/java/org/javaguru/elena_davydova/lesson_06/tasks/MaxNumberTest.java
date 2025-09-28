package org.javaguru.elena_davydova.lesson_06.tasks;

public class MaxNumberTest {
    public static void main(String[] args) {
        MaxNumberTest test = new MaxNumberTest();
        test.shouldBeMaxNumberOne();
        test.shouldBeMaxNumberTwo();
        test.shouldBeEqualNumbers();
    }
    // n1 = 10, n2 = 5 -> max = n1
    // n1 = 7, n2 = 15 -> max = n2

    void check(String testName, int expected, int actual) {
        if (expected == actual)
            System.out.println(testName + " IS OK!");
        else
            System.out.println(testName + " IS NOT OK! Expected " +
                    expected + " but actual " + actual);
    }

    public void shouldBeMaxNumberOne(){
        int n1 = 10;
        int n2 = 5;
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(n1, n2);
        check("shouldBeMaxNumberOne", n1, result);
    }
    public void shouldBeMaxNumberTwo(){
        int n1 = 7;
        int n2 = 15;
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(n1, n2);
        check("shouldBeMaxNumberTwo", n2, result);
    }
    public void shouldBeEqualNumbers(){
        int n1 = 27;
        int n2 = 27;
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(n1, n2);
        check("shouldBeEqualNumbers", n1, result);
    }
}
