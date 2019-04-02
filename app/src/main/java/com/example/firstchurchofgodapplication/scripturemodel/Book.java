package com.example.firstchurchofgodapplication.scripturemodel;

public class Book {
    private String book_nr;
    private String chapter_nr;
    private Chapter chapter;
    private String book_ref;
    private String book_name;

    public Book(String book_nr, String chapter_nr, Chapter chapter, String book_ref, String book_name) {
        this.book_nr = book_nr;
        this.chapter_nr = chapter_nr;
        this.chapter = chapter;
        this.book_ref = book_ref;
        this.book_name = book_name;
    }

    public String getBook_nr() {
        return book_nr;
    }

    public void setBook_nr(String book_nr) {
        this.book_nr = book_nr;
    }

    public String getChapter_nr() {
        return chapter_nr;
    }

    public void setChapter_nr(String chapter_nr) {
        this.chapter_nr = chapter_nr;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }

    public String getBook_ref() {
        return book_ref;
    }

    public void setBook_ref(String book_ref) {
        this.book_ref = book_ref;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
