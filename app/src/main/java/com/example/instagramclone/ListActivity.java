package com.example.instagramclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.instagramclone.adapters.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        RecyclerView recyclerView  = findViewById(R.id.recyclreViewLIst);
        List<String> user = new ArrayList<>();
        user.add("asdfasdfasdf");
        user.add("asdfasdfasdf");
        user.add("asdfasdfasdf");
        user.add("asdfasdfasdf");
        user.add("asdfasdfasdf");
        user.add("asdfasdfasdf");
        user.add("asdfasdfasdf");
        user.add("asdfasdfasdf");
        user.add("asdfasdfasdf");
        user.add("asdfasdfasdf");
        user.add("asdfasdfasdf");

        MyAdapter myAdapter = new MyAdapter(user,this);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        //adatper(list,this)
        //recyclerview.setadapter(adapter);

    }
}
