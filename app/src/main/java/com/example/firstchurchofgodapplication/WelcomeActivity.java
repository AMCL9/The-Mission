package com.example.firstchurchofgodapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.firstchurchofgodapplication.controller.FragmentListener;
import com.example.firstchurchofgodapplication.controller.ScriptureAdapter;
import com.example.firstchurchofgodapplication.network.PassageService;
import com.example.firstchurchofgodapplication.network.RetrofitSingleton;
import com.example.firstchurchofgodapplication.scripturemodel.BibleResponse;
import com.example.firstchurchofgodapplication.scripturemodel.Message;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class WelcomeActivity extends AppCompatActivity implements FragmentListener {
    private RecyclerView scriptureRecyclerView;
    private ArrayList<BibleResponse> scriptures = new ArrayList<>();
    private ScriptureAdapter scriptureAdapter;
    private RecyclerView.LayoutManager layoutManager;
    FragmentListener fragmentListener;
    String passage;
    private String book = "book";
    private String chapter = "chapter";
    private String verse = "verse";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        scriptureRecyclerView = findViewById(R.id.scripture_recycler_view);
        layoutManager = new GridLayoutManager(this,1);
        scriptureRecyclerView.setHasFixedSize(true);
        scriptureRecyclerView.setLayoutManager(layoutManager);
        scriptureAdapter = new ScriptureAdapter(scriptures, fragmentListener);
        scriptureRecyclerView.setAdapter(scriptureAdapter);


        passage ="random";
        Retrofit retrofit = RetrofitSingleton.getInstance();
        Retrofit retrofit2 = RetrofitSingleton.getInstance();
        Retrofit retrofit3 = RetrofitSingleton.getInstance();
        Retrofit retrofit4 = RetrofitSingleton.getInstance();
        Retrofit retrofit5 = RetrofitSingleton.getInstance();
        Retrofit retrofit6 = RetrofitSingleton.getInstance();
        Retrofit retrofit7 = RetrofitSingleton.getInstance();
        Retrofit retrofit8 = RetrofitSingleton.getInstance();
        Retrofit retrofit9 = RetrofitSingleton.getInstance();
        Retrofit retrofit10 = RetrofitSingleton.getInstance();

        retrofit.create(PassageService.class)
                .getPassages(passage,"json")
                .enqueue(new Callback<List<BibleResponse>>() {

                    @Override
                    public void onResponse(Call<List<BibleResponse>> call, Response<List<BibleResponse>> response) {
                        ArrayList<BibleResponse> bibleResponse = (ArrayList<BibleResponse>) response.body();
                        if(bibleResponse != null) {
                            scriptures.add(bibleResponse.get(0));



                        }
                    }

                    @Override
                    public void onFailure(Call<List<BibleResponse>> call, Throwable t) {

                    }
                });
        retrofit2.create(PassageService.class)
                .getPassages(passage,"json")
                .enqueue(new Callback<List<BibleResponse>>() {

                    @Override
                    public void onResponse(Call<List<BibleResponse>> call, Response<List<BibleResponse>> response) {
                        ArrayList<BibleResponse> bibleResponse = (ArrayList<BibleResponse>) response.body();
                        if(bibleResponse != null) {
                            scriptures.add(bibleResponse.get(0));



                        }
                    }

                    @Override
                    public void onFailure(Call<List<BibleResponse>> call, Throwable t) {

                    }
                });
        retrofit3.create(PassageService.class)
                .getPassages(passage,"json")
                .enqueue(new Callback<List<BibleResponse>>() {

                    @Override
                    public void onResponse(Call<List<BibleResponse>> call, Response<List<BibleResponse>> response) {
                        ArrayList<BibleResponse> bibleResponse = (ArrayList<BibleResponse>) response.body();
                        if(bibleResponse != null) {
                            scriptures.add(bibleResponse.get(0));



                        }
                    }

                    @Override
                    public void onFailure(Call<List<BibleResponse>> call, Throwable t) {

                    }
                });
        retrofit4.create(PassageService.class)
                .getPassages(passage,"json")
                .enqueue(new Callback<List<BibleResponse>>() {

                    @Override
                    public void onResponse(Call<List<BibleResponse>> call, Response<List<BibleResponse>> response) {
                        ArrayList<BibleResponse> bibleResponse = (ArrayList<BibleResponse>) response.body();
                        if(bibleResponse != null) {
                            scriptures.add(bibleResponse.get(0));



                        }
                    }

                    @Override
                    public void onFailure(Call<List<BibleResponse>> call, Throwable t) {

                    }
                });
        retrofit5.create(PassageService.class)
                .getPassages(passage,"json")
                .enqueue(new Callback<List<BibleResponse>>() {

                    @Override
                    public void onResponse(Call<List<BibleResponse>> call, Response<List<BibleResponse>> response) {
                        ArrayList<BibleResponse> bibleResponse = (ArrayList<BibleResponse>) response.body();
                        if(bibleResponse != null) {
                            scriptures.add(bibleResponse.get(0));



                        }
                    }

                    @Override
                    public void onFailure(Call<List<BibleResponse>> call, Throwable t) {

                    }
                });
        retrofit6.create(PassageService.class)
                .getPassages(passage,"json")
                .enqueue(new Callback<List<BibleResponse>>() {

                    @Override
                    public void onResponse(Call<List<BibleResponse>> call, Response<List<BibleResponse>> response) {
                        ArrayList<BibleResponse> bibleResponse = (ArrayList<BibleResponse>) response.body();
                        if(bibleResponse != null) {
                            scriptures.add(bibleResponse.get(0));



                        }
                    }

                    @Override
                    public void onFailure(Call<List<BibleResponse>> call, Throwable t) {

                    }
                });
        retrofit7.create(PassageService.class)
                .getPassages(passage,"json")
                .enqueue(new Callback<List<BibleResponse>>() {

                    @Override
                    public void onResponse(Call<List<BibleResponse>> call, Response<List<BibleResponse>> response) {
                        ArrayList<BibleResponse> bibleResponse = (ArrayList<BibleResponse>) response.body();
                        if(bibleResponse != null) {
                            scriptures.add(bibleResponse.get(0));



                        }
                    }

                    @Override
                    public void onFailure(Call<List<BibleResponse>> call, Throwable t) {

                    }
                });
        retrofit8.create(PassageService.class)
                .getPassages(passage,"json")
                .enqueue(new Callback<List<BibleResponse>>() {

                    @Override
                    public void onResponse(Call<List<BibleResponse>> call, Response<List<BibleResponse>> response) {
                        ArrayList<BibleResponse> bibleResponse = (ArrayList<BibleResponse>) response.body();
                        if(bibleResponse != null) {
                            scriptures.add(bibleResponse.get(0));



                        }
                    }

                    @Override
                    public void onFailure(Call<List<BibleResponse>> call, Throwable t) {

                    }
                });
        retrofit9.create(PassageService.class)
                .getPassages(passage,"json")
                .enqueue(new Callback<List<BibleResponse>>() {

                    @Override
                    public void onResponse(Call<List<BibleResponse>> call, Response<List<BibleResponse>> response) {
                        ArrayList<BibleResponse> bibleResponse = (ArrayList<BibleResponse>) response.body();
                        if(bibleResponse != null) {
                            scriptures.add(bibleResponse.get(0));



                        }
                    }

                    @Override
                    public void onFailure(Call<List<BibleResponse>> call, Throwable t) {

                    }
                });
        retrofit10.create(PassageService.class)
                .getPassages(passage,"json")
                .enqueue(new Callback<List<BibleResponse>>() {

                    @Override
                    public void onResponse(Call<List<BibleResponse>> call, Response<List<BibleResponse>> response) {
                        ArrayList<BibleResponse> bibleResponse = (ArrayList<BibleResponse>) response.body();
                        if(bibleResponse != null) {
                            scriptures.add(bibleResponse.get(0));
                            scriptureAdapter.setBibleResponses(scriptures);
                            scriptureRecyclerView.setAdapter(scriptureAdapter);


                        }
                    }

                    @Override
                    public void onFailure(Call<List<BibleResponse>> call, Throwable t) {

                    }
                });

    }

    @Override
    public void showEntranceFragment(String text, String text1, String text2) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, EntranceFragment.newInstance(book,chapter,verse))
                    .addToBackStack(null)
                    .commit();

        }

    }
