package com.example.firstchurchofgodapplication;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.firstchurchofgodapplication.controller.FragmentListener;
import com.example.firstchurchofgodapplication.controller.ScriptureAdapter;
import com.example.firstchurchofgodapplication.network.PassageService;
import com.example.firstchurchofgodapplication.network.RetrofitSingleton;
import com.example.firstchurchofgodapplication.scripturemodel.BibleResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class WelcomeActivity extends AppCompatActivity implements FragmentListener {

    private final String TAG = "Retrofit Response";
    private Toolbar toolbar;
    private ActionBar actionBar;
    private MenuItem menuItem;
    private MenuItem menuItem2;
    private MenuItem menuItem3;
    private MenuItem menuItem4;
    private RecyclerView scriptureRecyclerView;
    private ArrayList<BibleResponse> scriptures = new ArrayList<>();
    private ScriptureAdapter scriptureAdapter;
    private RecyclerView.LayoutManager layoutManager;
    FragmentListener fragmentListener;
    String passage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_darklav_24dp);
        }


        scriptureRecyclerView = findViewById(R.id.scripture_recycler_view);
        layoutManager = new GridLayoutManager(this, 1);
        scriptureRecyclerView.setHasFixedSize(true);
        scriptureRecyclerView.setLayoutManager(layoutManager);
        scriptureAdapter = new ScriptureAdapter(scriptures, fragmentListener);
        scriptureRecyclerView.setAdapter(scriptureAdapter);


        passage = "random";
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
                .getPassages(passage, "json")
                .enqueue(new Callback<List<BibleResponse>>() {

                    @Override
                    public void onResponse(Call<List<BibleResponse>> call, Response<List<BibleResponse>> response) {
                        ArrayList<BibleResponse> bibleResponse = (ArrayList<BibleResponse>) response.body();
                        if (bibleResponse != null) {
                            scriptures.add(bibleResponse.get(0));


                        }
                    }

                    @Override
                    public void onFailure(Call<List<BibleResponse>> call, Throwable t) {

                    }
                });
        retrofit2.create(PassageService.class)
                .getPassages(passage, "json")
                .enqueue(new Callback<List<BibleResponse>>() {

                    @Override
                    public void onResponse(Call<List<BibleResponse>> call, Response<List<BibleResponse>> response) {
                        ArrayList<BibleResponse> bibleResponse = (ArrayList<BibleResponse>) response.body();
                        if (bibleResponse != null) {
                            scriptures.add(bibleResponse.get(0));


                        }
                    }

                    @Override
                    public void onFailure(Call<List<BibleResponse>> call, Throwable t) {

                    }
                });
        retrofit3.create(PassageService.class)
                .getPassages(passage, "json")
                .enqueue(new Callback<List<BibleResponse>>() {

                    @Override
                    public void onResponse(Call<List<BibleResponse>> call, Response<List<BibleResponse>> response) {
                        ArrayList<BibleResponse> bibleResponse = (ArrayList<BibleResponse>) response.body();
                        if (bibleResponse != null) {
                            scriptures.add(bibleResponse.get(0));


                        }
                    }

                    @Override
                    public void onFailure(Call<List<BibleResponse>> call, Throwable t) {
                        Log.d(TAG, "onFailure: " + t.getMessage());

                    }
                });
        retrofit4.create(PassageService.class)
                .getPassages(passage, "json")
                .enqueue(new Callback<List<BibleResponse>>() {

                    @Override
                    public void onResponse(Call<List<BibleResponse>> call, Response<List<BibleResponse>> response) {
                        ArrayList<BibleResponse> bibleResponse = (ArrayList<BibleResponse>) response.body();
                        if (bibleResponse != null) {
                            scriptures.add(bibleResponse.get(0));


                        }
                    }

                    @Override
                    public void onFailure(Call<List<BibleResponse>> call, Throwable t) {
                        Log.d(TAG, "onFailure: " + t.getMessage());
                    }
                });
        retrofit5.create(PassageService.class)
                .getPassages(passage, "json")
                .enqueue(new Callback<List<BibleResponse>>() {

                    @Override
                    public void onResponse(Call<List<BibleResponse>> call, Response<List<BibleResponse>> response) {
                        ArrayList<BibleResponse> bibleResponse = (ArrayList<BibleResponse>) response.body();
                        if (bibleResponse != null) {
                            scriptures.add(bibleResponse.get(0));


                        }
                    }

                    @Override
                    public void onFailure(Call<List<BibleResponse>> call, Throwable t) {
                        Log.d(TAG, "onFailure: " + t.getMessage());

                    }
                });
        retrofit6.create(PassageService.class)
                .getPassages(passage, "json")
                .enqueue(new Callback<List<BibleResponse>>() {

                    @Override
                    public void onResponse(Call<List<BibleResponse>> call, Response<List<BibleResponse>> response) {
                        ArrayList<BibleResponse> bibleResponse = (ArrayList<BibleResponse>) response.body();
                        if (bibleResponse != null) {
                            scriptures.add(bibleResponse.get(0));


                        }
                    }

                    @Override
                    public void onFailure(Call<List<BibleResponse>> call, Throwable t) {
                        Log.d(TAG, "onFailure: " + t.getMessage());

                    }
                });
        retrofit7.create(PassageService.class)
                .getPassages(passage, "json")
                .enqueue(new Callback<List<BibleResponse>>() {

                    @Override
                    public void onResponse(Call<List<BibleResponse>> call, Response<List<BibleResponse>> response) {
                        ArrayList<BibleResponse> bibleResponse = (ArrayList<BibleResponse>) response.body();
                        if (bibleResponse != null) {
                            scriptures.add(bibleResponse.get(0));


                        }
                    }

                    @Override
                    public void onFailure(Call<List<BibleResponse>> call, Throwable t) {
                        Log.d(TAG, "onFailure: " + t.getMessage());

                    }
                });
        retrofit8.create(PassageService.class)
                .getPassages(passage, "json")
                .enqueue(new Callback<List<BibleResponse>>() {

                    @Override
                    public void onResponse(Call<List<BibleResponse>> call, Response<List<BibleResponse>> response) {
                        ArrayList<BibleResponse> bibleResponse = (ArrayList<BibleResponse>) response.body();
                        if (bibleResponse != null) {
                            scriptures.add(bibleResponse.get(0));


                        }
                    }

                    @Override
                    public void onFailure(Call<List<BibleResponse>> call, Throwable t) {
                        Log.d(TAG, "onFailure: " + t.getMessage());

                    }
                });
        retrofit9.create(PassageService.class)
                .getPassages(passage, "json")
                .enqueue(new Callback<List<BibleResponse>>() {

                    @Override
                    public void onResponse(Call<List<BibleResponse>> call, Response<List<BibleResponse>> response) {
                        ArrayList<BibleResponse> bibleResponse = (ArrayList<BibleResponse>) response.body();
                        if (bibleResponse != null) {
                            scriptures.add(bibleResponse.get(0));


                        }
                    }

                    @Override
                    public void onFailure(Call<List<BibleResponse>> call, Throwable t) {
                        Log.d(TAG, "onFailure: " + t.getMessage());

                    }
                });
        retrofit10.create(PassageService.class)
                .getPassages(passage, "json")
                .enqueue(new Callback<List<BibleResponse>>() {

                    @Override
                    public void onResponse(Call<List<BibleResponse>> call, Response<List<BibleResponse>> response) {
                        ArrayList<BibleResponse> bibleResponse = (ArrayList<BibleResponse>) response.body();
                        if (bibleResponse != null) {
                            scriptures.add(bibleResponse.get(0));
                            scriptureAdapter.setBibleResponses(scriptures);
                            scriptureRecyclerView.setAdapter(scriptureAdapter);


                        }
                    }

                    @Override
                    public void onFailure(Call<List<BibleResponse>> call, Throwable t) {
                        t.printStackTrace();
                        Log.d(TAG, "onFailure: " + t.getMessage());

                    }
                });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);


        menuItem = menu.add(Menu.NONE, R.id.jusjomar, Menu.NONE, R.string.jusjomarley).setIcon(R.drawable.bible);
        menuItem.setShowAsAction(menuItem.SHOW_AS_ACTION_WITH_TEXT);

        menuItem2 = menu.add(Menu.NONE, R.id.dude_notifications, Menu.NONE, R.string.dude_notifications).setIcon(R.drawable.bible);
        menuItem2.setShowAsAction(menuItem2.SHOW_AS_ACTION_WITH_TEXT);

        menuItem3 = menu.add(Menu.NONE, R.id.black_rose, Menu.NONE, R.string.black_rose).setIcon(R.drawable.bible);
        menuItem3.setShowAsAction(menuItem3.SHOW_AS_ACTION_WITH_TEXT);

        menuItem4 = menu.add(Menu.NONE, R.id.linked_in, Menu.NONE, R.string.linkedin).setIcon(R.drawable.bible);
        menuItem4.setShowAsAction(menuItem4.SHOW_AS_ACTION_WITH_TEXT);
        return true;


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.jusjomar:
                Uri jusjo = Uri.parse("https://github.com/AMCL9/GroupPortfolio");
                Intent jus = new Intent(Intent.ACTION_VIEW, jusjo);
                startActivity(jus);
                break;
            case R.id.dude_notifications:
                Uri dude = Uri.parse("https://github.com/AMCL9/Notification_App_HW_Ashley_lewis");
                Intent text = new Intent(Intent.ACTION_VIEW, dude);
                startActivity(text);
                break;
            case R.id.black_rose:
                Uri rose = Uri.parse("https://github.com/AMCL9/Black_Rose");
                Intent click = new Intent(Intent.ACTION_VIEW, rose);
                startActivity(click);
                break;
            case R.id.linked_in:
                Uri linkedin = Uri.parse("http://linkedin.com/in/ashley-lewis-444515174/");
                Intent clicka = new Intent(Intent.ACTION_VIEW, linkedin);
                startActivity(clicka);
                break;
            default:
                return false;
        }


        return super.onOptionsItemSelected(item);
    }


    @Override
    public void showEntranceFragment(String text, String bookText, String chapterText, String verseText, String scriptureText) {

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, EntranceFragment.newInstance(text, bookText, chapterText, verseText, scriptureText))
                .addToBackStack(null)
                .commit();

    }




}
