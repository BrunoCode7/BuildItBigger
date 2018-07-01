package com.example.android.androidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AndroidLibraryActivity extends AppCompatActivity {

    private TextView jokeTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_library);
        String joke=getIntent().getStringExtra("joke");
        jokeTextView=findViewById(R.id.joke_tv);
        jokeTextView.setText(joke);
    }
}
