package com.example.firstchurchofgodapplication.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.firstchurchofgodapplication.R;
import com.example.firstchurchofgodapplication.scripturemodel.BibleResponse;

public class ScriptureViewHolder extends RecyclerView.ViewHolder {

    private TextView scripture, chapter, verse, book;
    FragmentListener fragmentListener;
    public String itemViewScripture;
    public String scriptureText;
    public  String chapterText;
    public  String verseText;
    public String bookText;

    public ScriptureViewHolder(@NonNull View itemView) {
        super(itemView);
        scripture = itemView.findViewById(R.id.scripture_text);
        chapter = itemView.findViewById(R.id.scripture_chapter);
        verse = itemView.findViewById(R.id.scripture_verse);
        book = itemView.findViewById(R.id.scripture_book);
        fragmentListener = (FragmentListener) itemView.getContext();
    }

    public void onBind( BibleResponse bibleResponse) {
        Log.d("Data", "onBind:" + bibleResponse.getBookname());
        scriptureText = bibleResponse.getText();
        scripture.setText(scriptureText);
        chapterText = String.format("%s: ", bibleResponse.getChapter());
        chapter.setText(chapterText);
        verseText = bibleResponse.getVerse();
        verse.setText(verseText);
        bookText = String.format("%s ", bibleResponse.getBookname());
        book.setText(bookText);
        itemViewScripture = bookText + " "+ chapterText + verseText + scriptureText;


        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentListener.showEntranceFragment(itemViewScripture, bookText , chapterText, scriptureText, verseText);


            }
        });


    }

}
