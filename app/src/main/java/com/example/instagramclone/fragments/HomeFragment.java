package com.example.instagramclone.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagramclone.R;
import com.example.instagramclone.WebService;
import com.example.instagramclone.adapters.HomePostContentAdapter;
import com.example.instagramclone.model.PixaBayPost;
import com.example.instagramclone.model.PixabayResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HomeFragment extends Fragment {
    public HomeFragment() {
        super(R.layout.fragmetn_home);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final RecyclerView recyclerView = view.findViewById(R.id.recyclerViewHome);
        GsonConverterFactory gsonConverterFactory = GsonConverterFactory.create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://pixabay.com/")
                .addConverterFactory(gsonConverterFactory)
                .build();
        WebService webService = retrofit.create(WebService.class);

        webService.getPost("money").enqueue(new Callback<PixabayResponse>() {
            @Override
            public void onResponse(Call<PixabayResponse> call, Response<PixabayResponse> response) {
                List<PixaBayPost> pixabyPosts = response.body().getHits();
                recyclerView.setAdapter(new HomePostContentAdapter(pixabyPosts,getActivity()));
                recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            }

            @Override
            public void onFailure(Call<PixabayResponse> call, Throwable t) {

            }
        });
    }
}


