package com.example.firstchurchofgodapplication.scripturemodel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Message {

    ArrayList<BibleResponse> bibleResponses;

    public ArrayList<BibleResponse> getBibleResponses() {
        return bibleResponses;
    }

    public Message(ArrayList<BibleResponse> bibleResponses) {
        this.bibleResponses = bibleResponses;


    }
}
