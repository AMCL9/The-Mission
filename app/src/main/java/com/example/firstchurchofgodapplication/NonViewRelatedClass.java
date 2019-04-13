package com.example.firstchurchofgodapplication;

public class NonViewRelatedClass {
    private static NonViewRelatedClass nonViewRelatedClass;

    private NonViewRelatedClass() {
    }

    public static NonViewRelatedClass getInstance() {
        if (nonViewRelatedClass == null) {
            nonViewRelatedClass = new NonViewRelatedClass();
        }
        return nonViewRelatedClass;
    }

    public boolean isDivisibleByGodsLuckyNumber (int input) {
        if (input == 0) {
            return false;
        }
        else return input % 7 == 0;
    }
}
