package com.example.firstchurchofgodapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import com.example.firstchurchofgodapplication.controller.FragmentListener;
import com.example.firstchurchofgodapplication.network.PassageService;
import com.example.firstchurchofgodapplication.network.RetrofitSingleton;
import com.example.firstchurchofgodapplication.scripturemodel.BibleResponse;
import com.example.firstchurchofgodapplication.scripturemodel.Book;
import com.example.firstchurchofgodapplication.scripturemodel.Chapter;
import com.example.firstchurchofgodapplication.scripturemodel.Verse;

import java.util.List;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity implements FragmentListener {

    private static int SPLASH_TIME_OUT = 4000;
    private List<Book> books;
    private String passage = "passage";
    private String book_ref = "book_ref";
    private String chapter_nr = "chapter_nr";
    private String verse_nr = "verse_nr";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                String text = "text";
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, EntranceFragment.newInstance(1, text))
                        .addToBackStack(null)
                        .commit();
                finish();
            }
        }, SPLASH_TIME_OUT);


        Retrofit retrofit = RetrofitSingleton.getInstance();

        retrofit.create(PassageService.class)
                .getPassages(book_ref, chapter_nr,verse_nr)
                .enqueue(new Callback<BibleResponse>() {
                    @Override
                    public void onResponse(Call<BibleResponse> call, Response<BibleResponse> response) {
                        BibleResponse bibleResponse = response.body();
                        if (bibleResponse != null) {
                            books.addAll(bibleResponse.getBook());
                            Book bookSelection = books.get(randomBookNumberGenerator());
                            String bookReference = bookSelection.getBook_ref();
                            String chapterNumber = bookSelection.getChapter_nr();
                            Chapter chapter = bookSelection.getChapter();
                            Verse verse = chapter.getVerse();
                            String scriptureSelection = verse.getVerse();



                        }

                    }

                    @Override
                    public void onFailure(Call<BibleResponse> call, Throwable t) {

                    }
                });
    }

    @Override
    public void showEntranceFragment(String text) {



    }

    public int randomBookNumberGenerator() {
        Random random = new Random();
        int n = random.nextInt(80);
        return n;
    }




}
