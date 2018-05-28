package com.example.codeclam.wordcounter;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Counter {


    public Counter(){
    }

    public int getCount(String str) {
        String [] arrOfStr = str.split(" ");
        return arrOfStr.length;
    }

    public String returnCount(String sentence){
        int total = getCount(sentence);
        return "Your sentence has: " + total + " words";
    }
}

