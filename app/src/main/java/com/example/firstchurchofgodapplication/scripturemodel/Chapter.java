package com.example.firstchurchofgodapplication.scripturemodel;

public class Chapter {
    private Verse verse;


    public Chapter(Verse verse, String verse_nr) {
        this.verse = verse;

    }

    public Verse getVerse() {
        return verse;
    }

    public void setVerse(Verse verse) {
        this.verse = verse;
    }




    @Override
    public String toString() {
        return super.toString();
    }
}
