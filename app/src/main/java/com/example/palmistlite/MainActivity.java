package com.example.palmistlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText editText;
    EditText answer;
    String unit;
    Double a;
    int OldNumber;
    String newNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        answer = findViewById(R.id.answer);
    }

    public void start(View view) {
        double a = (Math.random() * (99 - 1)) + 1;
        OldNumber = (int) Math.round(a);
        String unit = String.valueOf(OldNumber);
    }

    public void give_an_answer(View view) {
        newNumber = editText.getText().toString();

        int i = Integer.parseInt (newNumber);
        int r = Integer.parseInt(unit);

        if (r > i){
            answer.setText("your answer is less than the hidden number");
        }
        if (i > r){
            answer.setText("your answer is more than a hidden number");
        }
        if (i == r){
            answer.setText("your answer is correct");
        }
    }
}
