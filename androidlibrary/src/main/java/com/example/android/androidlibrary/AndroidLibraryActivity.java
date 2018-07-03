package com.example.android.androidlibrary;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.widget.TextView;

public class AndroidLibraryActivity extends AppCompatActivity {

    static String EXTRA_JOKE="result";
    private TextView jokeTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_library);
        String joke=getIntent().getStringExtra(EXTRA_JOKE);
        jokeTextView=findViewById(R.id.joke_tv);
        jokeTextView.setText(joke);
        
    }
    public static Intent newIntent(Context context, String joke) {
        Intent intent = new Intent(context, AndroidLibraryActivity.class);
        intent.putExtra(EXTRA_JOKE, joke);
        return intent;
    }


}
