package com.codeclan.wordcount;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {

    TextView inputText;
    TextView outputText;
    TextView outputOccurrences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String input = extras.getString("input");

        inputText = (TextView)findViewById(R.id.input_text);
        inputText.setText(input);

        WordCount wordCount = new WordCount();
        outputText = (TextView)findViewById(R.id.output_text);
        outputText.setText(new Integer(wordCount.countWords(input)).toString());

        outputOccurrences = (TextView)findViewById(R.id.output_occurrences);
        outputOccurrences.setText(wordCount.countWordOccurrences(input));
    }
}
