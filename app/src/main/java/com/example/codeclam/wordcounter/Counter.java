package com.example.codeclam.wordcounter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

        public String returnMap(String sentence) {
            String[] splitted = sentence.split(" ");
            Map<String, Integer> hm = new HashMap<String, Integer>();
            for (int i = 0; i < splitted.length; i++) {
                if (hm.containsKey(splitted[i])) {
                    int cont = hm.get(splitted[i]);
                    hm.put(splitted[i], cont + 1);
                } else {
                    hm.put(splitted[i], 1);
                }
            }
            return  hm.toString();
        }

    }


