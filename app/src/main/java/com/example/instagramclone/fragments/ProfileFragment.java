package com.example.instagramclone.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.instagramclone.R;
import com.example.instagramclone.WebService;
import com.example.instagramclone.adapters.ProfilePostContentAdapter;
import com.example.instagramclone.model.PixaBayPost;
import com.example.instagramclone.model.PixabayResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ProfileFragment extends Fragment {
    public ProfileFragment() {
        super(R.layout.fragmetn_profile);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final RecyclerView recyclerViewProfile = view.findViewById(R.id.recyclerViewProfile);
        ImageView imageView = view.findViewById(R.id.imageView);

        Glide.with(this)
                .load("https://images.unsplash.com/photo-1541439998155-388623962c26?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80")
                .circleCrop()
                .into(imageView);

        GsonConverterFactory gsonConverterFactory = GsonConverterFactory.create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://pixabay.com/")
                .addConverterFactory(gsonConverterFactory)
                .build();
        WebService webService = retrofit.create(WebService.class);

        webService.getPost("car").enqueue(new Callback<PixabayResponse>() {
            @Override
            public void onResponse(Call<PixabayResponse> call, Response<PixabayResponse> response) {
                List<PixaBayPost> pixabyPosts = response.body().getHits();
            ProfilePostContentAdapter postContentAdapter = new ProfilePostContentAdapter(pixabyPosts, getContext());
                recyclerViewProfile.setLayoutManager(new GridLayoutManager(getContext(),3));
                recyclerViewProfile.setAdapter(postContentAdapter);
            }

            @Override
            public void onFailure(Call<PixabayResponse> call, Throwable t) {

            }
        });

    }
}


