package com.example.firstchurchofgodapplication.network;

import com.example.firstchurchofgodapplication.scripturemodel.BibleResponse;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

import retrofit2.http.Query;

public interface PassageService {


    @GET("/api/")
    Call<List<BibleResponse>> getPassages(@Query("passage") String passage,
                                          @Query("type") String type);



}
