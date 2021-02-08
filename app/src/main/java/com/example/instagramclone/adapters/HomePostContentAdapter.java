package com.example.instagramclone.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.instagramclone.R;
import com.example.instagramclone.model.PixaBayPost;

import java.util.List;

public class HomePostContentAdapter extends RecyclerView.Adapter<HomePostContentAdapter.HomePostContentViewholder> {
List<PixaBayPost>postList;
Context context;

    public HomePostContentAdapter(List<PixaBayPost> postList, Context context) {
        this.postList = postList;
        this.context = context;
    }

    @NonNull
    @Override
    public HomePostContentViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_home_post_item,parent,false);
        return new HomePostContentViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomePostContentViewholder holder, int position) {
        PixaBayPost pixaBayPost = postList.get(position);
        holder.textViewComment.setText(pixaBayPost.getComments()+"");
        holder.textViewLikes.setText(pixaBayPost.getLikes()+"");
        holder.textViewViews.setText(pixaBayPost.getViews()+"");
        holder.textViewUsername.setText(pixaBayPost.getUserName());
        Glide.with(context).load(pixaBayPost.getUserImageURL()).circleCrop().into(holder.imageViewUserprofile);
        Glide.with(context).load(pixaBayPost.getWebformatURL()).into(holder.imageViewPostcontent);

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class HomePostContentViewholder extends RecyclerView.ViewHolder {
        TextView textViewLikes;
        TextView textViewViews;
        TextView textViewUsername;
        TextView textViewComment;
        ImageView imageViewUserprofile;
        ImageView imageViewPostcontent;
        public HomePostContentViewholder(@NonNull View itemView) {
            super(itemView);
            textViewComment = itemView.findViewById(R.id.textViewComment);
            textViewLikes = itemView.findViewById(R.id.textViewLikes);
            textViewUsername = itemView.findViewById(R.id.textViewUsername);
            textViewViews = itemView.findViewById(R.id.textViewView);
            imageViewPostcontent = itemView.findViewById(R.id.imageViewPostContent);
            imageViewUserprofile = itemView.findViewById(R.id.imageViewUserProfile);
        }
    }
}
