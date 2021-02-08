package com.example.instagramclone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.example.instagramclone.model.PixaBayPost;
import com.example.instagramclone.model.PixabayResponse;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ViewPager2 viewPagerMain = findViewById(R.id.viewPagerMain);
        viewPagerMain.setUserInputEnabled(false);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        MyFragmentAdapter myFragmentAdapter =
                new MyFragmentAdapter(getSupportFragmentManager(),
                        this.getLifecycle());
        viewPagerMain.setAdapter(myFragmentAdapter);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.action_home) {
                    viewPagerMain.setCurrentItem(0);
                }
                if (item.getItemId() == R.id.action_search) {
                    viewPagerMain.setCurrentItem(1);
                }
                if (item.getItemId() == R.id.action_activities) {
                    viewPagerMain.setCurrentItem(2);
                }
                if (item.getItemId() == R.id.action_prifile) {
                    viewPagerMain.setCurrentItem(3);
                }
                return true;
            }
        });
    }
}
