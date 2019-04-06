package com.example.firstchurchofgodapplication.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.firstchurchofgodapplication.R;
import com.example.firstchurchofgodapplication.scripturemodel.BibleResponse;

import java.util.ArrayList;


public class ScriptureAdapter extends RecyclerView.Adapter<ScriptureViewHolder> {

    private ArrayList<BibleResponse> bibleResponses;
    FragmentListener fragmentListener;

    public ScriptureAdapter( ArrayList<BibleResponse>bibleResponses, FragmentListener fragmentlistener) {
        this.bibleResponses = bibleResponses;
    }

    @NonNull
    @Override
    public ScriptureViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        ScriptureViewHolder scriptureViewHolder = new ScriptureViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_view, viewGroup, false));
        return scriptureViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ScriptureViewHolder scriptureViewHolder, int position) {
        scriptureViewHolder.onBind(bibleResponses.get(position));
    }

    @Override
    public int getItemCount() {
        return bibleResponses.size();
    }

    public void setBibleResponses(ArrayList<BibleResponse> bibleResponses) {
        this.bibleResponses = bibleResponses;
        notifyDataSetChanged();
    }
}
