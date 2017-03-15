package com.codeclan.wordcount;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CountingAppActivity extends AppCompatActivity {

    EditText inputEditText;
    Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counting_app);
        Log.d(getClass().toString(), "onCreate called");

        inputEditText = (EditText)findViewById(R.id.input_text);
        countButton = (Button)findViewById(R.id.count_button);
    }

    public void onCountButtonClicked(View button) {
        Log.d(getClass().toString(), "Button was clicked!");
        String input = inputEditText.getText().toString();
        Log.d("Sentence input was: ", input);

        Intent intent = new Intent(this, WordCountActivity.class);
        intent.putExtra("input", input);

        startActivity(intent);
    }

}
