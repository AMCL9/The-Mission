package com.example.firstchurchofgodapplication.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.firstchurchofgodapplication.scripturemodel.Book;
import com.example.firstchurchofgodapplication.view.BibleVerseViewHolder;

import java.util.ArrayList;
import java.util.List;


public class BibleVerseAdapter extends RecyclerView.Adapter<BibleVerseViewHolder> {

    private List<Book> books = new ArrayList<>();

    @NonNull
    @Override
    public BibleVerseViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BibleVerseViewHolder bibleVerseViewHolder, int position) {
        bibleVerseViewHolder.onBind();
    }

    @Override
    public int getItemCount() {
        return books.size();
    }
}
