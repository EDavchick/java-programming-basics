package org.javaguru.elena_davydova.lesson_06.tasks;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.shouldBeFizz();
        test.shouldBeBuzz();
        test.shouldBeFizzBuzz();
        test.shouldBeNumber();
        test.shouldBeZero();
        test.shouldBeMinusFizz();
        test.shouldBeMinusBuzz();
    }
    // test case 1:  3 -> "Fizz"
    // test case 2:  5 -> "Buzz"
    // test case 3:  15 -> "FizzBuzz"
    // test case 4:  17 -> "17"

    void check(String testName, String expected, String actual){
        if (expected.equals(actual))
            System.out.println(testName + " IS OK!");
        else
            System.out.println(testName + " IS NOT OK! Expected " +
                expected + " but actual " + actual);
    }
    public void shouldBeFizz(){
        check("shouldBeFizz", "Fizz", fizzBuzz.detect(3));
    }
    public void shouldBeBuzz(){
        check("shouldBeBuzz", "Buzz", fizzBuzz.detect(5));
    }
    public void shouldBeFizzBuzz(){
        check("shouldBeFizzBuzz", "FizzBuzz", fizzBuzz.detect(15));
    }
    public void shouldBeNumber(){
        check("shouldBeNumber", "17", fizzBuzz.detect(17));
    }
    public void shouldBeZero(){
        check("shouldBeZero", "FizzBuzz", fizzBuzz.detect(0));
    }
    public void shouldBeMinusFizz(){
        check("shouldBeMinusFizz", "Fizz", fizzBuzz.detect(-3));
    }
    public void shouldBeMinusBuzz(){
        check("shouldBeMinusBuzz", "Buzz", fizzBuzz.detect(-5));
    }
}
