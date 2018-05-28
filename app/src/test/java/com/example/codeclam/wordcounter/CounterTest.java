package com.example.codeclam.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest {
    Counter counter;

    @Before
    public void before(){
        counter = new Counter();
    }

    @Test
    public void canCount(){
        assertEquals(3, counter.getCount("hola como estas"));
    }
    @Test
    public void canCount2(){
        assertEquals(5, counter.getCount("hola como estas tu tu"));
    }

    @Test
    public void canReturnSentence(){
        assertEquals("Your sentence has: 3 words", counter.returnCount("Hola como estas?"));
    }

    @Test
    public void canReturnHash(){
        assertEquals("{como=1, hola=3, estas=1}", counter.returnMap("hola hola como estas hola"));
    }
}
