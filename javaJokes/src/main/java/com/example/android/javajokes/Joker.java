package com.example.android.javajokes;

import java.util.Random;

public class Joker {

    public String getJoke() {
        String[] jokes = new String[3];
        jokes[0]= "Q:What do you call a programmer from Finland? \nA:Nerdic";
        jokes[1]= "Q:Why did the programmer quit his job? \nA:becuse he didn't get arrays";
        jokes[2]= "Q:What is a programmer favourite hangout place? \nA:foo bar";

        Random random = new Random();
        return jokes[random.nextInt(jokes.length)];
    }
}
