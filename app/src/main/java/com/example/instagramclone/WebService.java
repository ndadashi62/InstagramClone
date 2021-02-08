package com.example.instagramclone;

import com.example.instagramclone.model.PixabayResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WebService {
    @GET("/api/?key=15013261-03cc2482af88066d832ef38fb")
    Call<PixabayResponse> getPost(@Query("q") String searchKeyWord);//car
}
