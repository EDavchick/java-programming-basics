package org.javaguru.elena_davydova.lesson_03.homework.level3;

public class BookChapter {
    String chapterName;
    String chapterText;

    public BookChapter(String chapterName, String chapterText) {
        this.chapterName = chapterName;
        this.chapterText = chapterText;
    }

    @Override
    public String toString() {
        return "BookChapter{" +
                "chapterName='" + chapterName + '\'' +
                ", chapterText='" + chapterText + '\'' +
                '}';
    }
}
