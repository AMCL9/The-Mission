package com.example.firstchurchofgodapplication.scripturemodel;

import java.util.List;

public class BibleResponse {
    private List<Book> books;
    private String type;
    private String version;
    private String direction;

    public BibleResponse(List<Book> book, String type, String version, String direction) {
        this.books = book;
        this.type = type;
        this.version = version;
        this.direction = direction;
    }

    public List<Book> getBook() {
        return books;
    }

    public void setBook(List<Book> book) {
        this.books = book;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
