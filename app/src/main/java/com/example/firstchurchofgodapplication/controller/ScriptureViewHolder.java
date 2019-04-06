package com.example.firstchurchofgodapplication.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.firstchurchofgodapplication.R;
import com.example.firstchurchofgodapplication.WelcomeActivity;
import com.example.firstchurchofgodapplication.scripturemodel.BibleResponse;

public class ScriptureViewHolder extends RecyclerView.ViewHolder {

    private TextView scripture;
    private TextView chapter;
    private TextView verse;
    private TextView book;
    String chosenBook;
    String chosenChapter;
    String chosenVerse;
    FragmentListener fragmentListener;

    public ScriptureViewHolder(@NonNull View itemView) {
        super(itemView);
        scripture = itemView.findViewById(R.id.scripture_text);
        chapter = itemView.findViewById(R.id.scripture_chapter);
        verse = itemView.findViewById(R.id.scripture_verse);
        book = itemView.findViewById(R.id.scripture_book);
        fragmentListener = (FragmentListener) itemView.getContext();
    }

    public void onBind (final BibleResponse bibleResponse) {
        Log.d("Data","onBind:" + bibleResponse.getBookname());
        scripture.setText(bibleResponse.getText());
        chapter.setText(String.format("%s: ", bibleResponse.getChapter()));
        verse.setText(bibleResponse.getVerse());
        book.setText(String.format("%s ", bibleResponse.getBookname()));

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentListener.showEntranceFragment(chosenBook, chosenChapter, chosenVerse);


            }
        });


    }
}
