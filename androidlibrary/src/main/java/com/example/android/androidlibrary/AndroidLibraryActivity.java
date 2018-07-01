package com.example.android.androidlibrary;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.widget.TextView;

public class AndroidLibraryActivity extends AppCompatActivity {

    private TextView jokeTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_library);
        String joke=getIntent().getStringExtra("result");
        jokeTextView=findViewById(R.id.joke_tv);
        jokeTextView.setText(joke);
    }


}
