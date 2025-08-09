package org.javaguru.elena_davydova.lesson_03.homework.level3;

public class Book {

    String bookName;
    String author;
    int year;
    BookChapter chapterOne;
    BookChapter chapterTwo;

    public Book(String bookName, String author, int year, BookChapter chapterOne, BookChapter chapterTwo) {
        this.bookName = bookName;
        this.author = author;
        this.year = year;
        this.chapterOne = chapterOne;
        this.chapterTwo = chapterTwo;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", chapterOne=" + chapterOne +
                ", chapterTwo=" + chapterTwo +
                '}';
    }
}
