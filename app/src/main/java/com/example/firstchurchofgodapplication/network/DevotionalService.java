package com.example.firstchurchofgodapplication.network;

import com.example.firstchurchofgodapplication.devotionalmodel.DevotionalResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DevotionalService {

    @GET("alexa.php")
    Call<DevotionalResponse> getDevotionals (@Query("intent") String intent);
}
