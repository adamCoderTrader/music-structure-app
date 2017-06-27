package com.example.adamoates.musicstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_now_playing);
    }
}
