package com.example.firstchurchofgodapplication.network;

import com.example.firstchurchofgodapplication.scripturemodel.BibleResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PassageService {

//    @GET("json?passage={book_ref}{chapter_nr}:{verse_nr}")
//    Call<BibleResponse> getPassages(
//            @Query("passage") String passage,
//            @Path("book_ref") String book_ref,
//            @Path("chapter_nr") String chapter_nr,
//            @Path("verse_nr") String verse_nr);

    @GET("json?passage={book_ref}{chapter_nr}:{verse_nr}")
    Call<BibleResponse> getPassages(
//            @Query("passage") String passage,
            @Path("book_ref") String book_ref,
            @Path("chapter_nr") String chapter_nr,
            @Path("verse_nr") String verse_nr);


}
