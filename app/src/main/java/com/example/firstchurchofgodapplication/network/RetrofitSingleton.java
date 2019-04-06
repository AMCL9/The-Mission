package com.example.firstchurchofgodapplication.network;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Path;

public class RetrofitSingleton {
    private static Retrofit retrofit;
    private static Retrofit retrofit2;

    private RetrofitSingleton() {

    }

    public static Retrofit getInstance() {
        if (retrofit == null) {



            retrofit = new Retrofit.Builder()
                    .baseUrl("https://labs.bible.org/")
                    .addConverterFactory(GsonConverterFactory.create())
                   .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static Retrofit getInstance2() {
        if( retrofit2 == null) {

            retrofit2 = new Retrofit.Builder()
                    .baseUrl("https://bibletalk.tv/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit2;
    }
}

