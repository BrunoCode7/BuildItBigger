package com.udacity.gradle.builditbigger.backend;

import com.example.android.javajokes.Joker;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    public String getJoke() {
        Joker joker = new Joker();
        return joker.getJoke();
    }


}