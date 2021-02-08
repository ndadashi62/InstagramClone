package com.example.instagramclone.adapters;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagramclone.R;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView textView;
    //Image
    //Button
    //ImageView
    //
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.textViewTitle);
        //View findview view.findvtyvid();
    }
}
