package com.example.codeclam.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounter extends AppCompatActivity {

    TextView totalWords;
    EditText sentenceToCount;
    Button count_Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        totalWords = findViewById(R.id.answer);
        sentenceToCount = findViewById(R.id.set_sentence);
        count_Button = findViewById(R.id.count_button);
//        count_Button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                onCountButtonClicked(view);
//            }
//        });
    }

    public void onCountButtonClicked(View count_Button){
        Log.d(getClass().toString(), "onCountButtonClicked called");
        String question = sentenceToCount.getText().toString();
        Log.d(getClass().toString(), "The sentence asked was: " + question);
        Counter counter = new Counter();
        String answer = counter.returnCount(question);
        totalWords.setText(answer);
    }
}
