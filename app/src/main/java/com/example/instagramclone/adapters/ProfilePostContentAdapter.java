package com.example.instagramclone.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.instagramclone.R;
import com.example.instagramclone.model.PixaBayPost;
import com.example.instagramclone.model.PixabayResponse;

import java.util.List;

public class ProfilePostContentAdapter extends RecyclerView.Adapter<ProfilePostContentViewholder> {
    List<PixaBayPost> postList;
    Context context;

    public ProfilePostContentAdapter(List<PixaBayPost> postList, Context context) {
        this.postList = postList;
        this.context = context;
    }

    @NonNull
    @Override
    public ProfilePostContentViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.profile_list_item,parent,false);
        return new ProfilePostContentViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfilePostContentViewholder holder, int position) {
        PixaBayPost pixaBayPost = postList.get(position);
        Glide.with(context)
                .load(pixaBayPost.getWebformatURL())
                .into(holder.imageViewProfilePostContent);
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }
}
