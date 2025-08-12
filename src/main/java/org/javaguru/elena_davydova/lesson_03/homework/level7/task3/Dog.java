package org.javaguru.elena_davydova.lesson_03.homework.level7.task3;

public class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void voice(){
        System.out.println("My nickname is " + this.name);
    }

    void birthday(){
        this.age = this.age + 1;
    }

    int getAge(){
        return this.age;
    }
}
