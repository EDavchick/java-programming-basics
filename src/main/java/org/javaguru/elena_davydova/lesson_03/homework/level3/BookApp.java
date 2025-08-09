package org.javaguru.elena_davydova.lesson_03.homework.level3;

public class BookApp {
    public static void main(String[] args) {
        BookChapter bookChapter1 = new BookChapter("Chapter 1", "lorem ksanna ncjnsjn cjnsjn");
        BookChapter bookChapter2 = new BookChapter("Chapter 1", "lorem ksanna ncjnsjn cjnsjn");
        BookChapter bookChapter3 = new BookChapter("Chapter 1", "lorem ksanna ncjnsjn cjnsjn");
        BookChapter bookChapter4 = new BookChapter("Chapter 1", "lorem ksanna ncjnsjn cjnsjn");

        Book book1 = new Book("Name book one", "Kolya", 1976, bookChapter1, bookChapter2);
        Book book2 = new Book("Name book two", "Masha", 1996, bookChapter3, bookChapter4);

        System.out.println(book1);
        System.out.println(book2);

    }
}
