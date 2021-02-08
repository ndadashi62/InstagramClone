package com.example.instagramclone.adapters;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagramclone.R;

public class ProfilePostContentViewholder extends RecyclerView.ViewHolder {
    ImageView imageViewProfilePostContent;
    public ProfilePostContentViewholder(@NonNull View itemView) {
        super(itemView);
        imageViewProfilePostContent = itemView.findViewById(R.id.imageViewProfilePostContent);
    }
}
